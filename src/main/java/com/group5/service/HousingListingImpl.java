package com.group5.service;
import com.group5.Model.*;
import com.group5.proto.Listing.*;
import com.group5.repository.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@GRpcService
public class HousingListingImpl extends ListingServiceGrpc.ListingServiceImplBase {
    HouseListingRepository houseListingRepository;
    AddressRepository addressRepository;
    AreaRepository areaRepository;
    ImageFileRepository imageFileRepository;


    public HousingListingImpl(HouseListingRepository houseListingRepository, AddressRepository addressRepository, AreaRepository areaRepository, ImageFileRepository imageFileRepository) {
        this.houseListingRepository = houseListingRepository;
        this.addressRepository = addressRepository;
        this.areaRepository = areaRepository;
        this.imageFileRepository = imageFileRepository;
    }

    @Override
    public void createListing(CreateHouseListingRequest request, StreamObserver<HouseResponse> responseObserver) {
        System.out.println("Received Request ====> " + request.toString());

        Area area = new Area(request.getAddress().getPostNumber(), request.getAddress().getCity());
        area = areaRepository.save(area);
        Address address = addressRepository.save(new Address(request.getAddress().getStreet(), request.getAddress().getHouseNo(), area));


        HouseListing houseListing = houseListingRepository.save(new HouseListing(request.getConstructionYear(),
                request.getLastRebuilt(), request.getHasInspection(), request.getGroundArea(),
                request.getFloorArea(), (long) request.getPrice(), address, LocalDate.now().toString(), request.getDescription()));
        List<ImageFile> images = houseListing.getAllImageFiles(request.getImagesList(),houseListing);

        imageFileRepository.saveAll(images);



        HouseResponse.Builder response = HouseResponse.newBuilder().setId(houseListing.getId()).
                setAddress(AddressMessage.newBuilder().setStreet(houseListing.getAddress().getStreet()).setHouseNo(houseListing.getAddress().getHouseNumber())
                .setCity(houseListing.getAddress().getArea().getCity()).setPostNumber(houseListing.getAddress().getArea().getPostNumber()).build())
                .addAllImages(houseListing.getAllImageFileMessages(images)).setConstructionYear(houseListing.getConstructionYear())
                .setLastRebuilt(houseListing.getLastRebuilt()).setHasInspection(houseListing.isHasInspection()).
                setGroundArea(houseListing.getGroundArea()).setFloorArea(houseListing.getGroundArea()).setPrice(houseListing.getPrice()).
                setCreationDate(LocalDate.now().toString()).setDescription(houseListing.getDescription());

        HouseResponse responseText = response.build();
        responseObserver.onNext(responseText);
        responseObserver.onCompleted();
    }

    @Override
    public void getListingById(IdRequest request, StreamObserver<HouseResponse> responseObserver) {
        System.out.println("Received Request ====> " + request.toString());
        HouseListing houseListing = houseListingRepository.findById(request.getId()).get();
        Address address=houseListing.getAddress();
        Area area=houseListing.getAddress().getArea();
        List<ImageFile> filteredImages = new ArrayList<>();
        List<ImageFile> images=imageFileRepository.findAll();
        for(ImageFile x:images)
        {
            if(x.getHouseListing().getId()==request.getId())
            {
                filteredImages.add(x);
            }
        }
        List<ImageFileMessage> responseImages=houseListing.getAllImageFileMessages(filteredImages);


        HouseResponse response = HouseResponse.newBuilder().setId(houseListing.getId()).
                setAddress(AddressMessage.newBuilder().setStreet(houseListing.getAddress().getStreet()).setHouseNo(houseListing.getAddress().getHouseNumber())
                        .setCity(houseListing.getAddress().getArea().getCity()).setPostNumber(houseListing.getAddress().getArea().getPostNumber()).build())
                .addAllImages(responseImages).setConstructionYear(houseListing.getConstructionYear())
                .setLastRebuilt(houseListing.getLastRebuilt()).setHasInspection(houseListing.isHasInspection()).
                setGroundArea(houseListing.getGroundArea()).setFloorArea(houseListing.getFloorArea()).setPrice(houseListing.getPrice()).
                setCreationDate(LocalDate.now().toString()).setDescription(houseListing.getDescription()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getFilteredListings(ListingFiltersRequest request, StreamObserver<ShortListingResponse> responseObserver)
    {
        long priceFilter=999999999;
        long areaFilter=0;
        if(request.hasMaxPrice())
        {
            priceFilter=request.getMaxPrice();
        }
        if(request.hasMinArea())
        {
            areaFilter=request.getMinArea();
        }
        List<HouseListing> listings= houseListingRepository.findAll();
        List<ShortListingResponse> filteredListings=new ArrayList<>();
        if(request.hasCity())
        {
            for(HouseListing listing: listings)
            {
                if(listing.getAddress().getArea().getCity().equals(request.getCity())&&listing.getPrice()<priceFilter&&listing.getFloorArea()>areaFilter) {
                    filteredListings.add(buildShortListing(listing));
                }
            }
        }
        else {
            for (HouseListing listing : listings)
            {
                    if(listing.getPrice()<priceFilter&&listing.getFloorArea()>areaFilter) {
                        filteredListings.add(buildShortListing(listing));
                    }
                }
            }



        for(ShortListingResponse response:filteredListings)
        {
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    private ShortListingResponse buildShortListing(HouseListing listing) {

        ImageFile image=imageFileRepository.findFirstByHouseListing(listing);
        return ShortListingResponse.newBuilder().setPrice(listing.getPrice()).setAddress(AddressMessage.newBuilder()
                .setHouseNo(listing.getAddress().getHouseNumber()).setCity(listing.getAddress().getArea().getCity())
                .setStreet(listing.getAddress().getStreet()).setPostNumber(listing.getAddress().getArea().getPostNumber()).build())
                .setImage(ImageFileMessage.newBuilder().setImageContentType(image.getImageContentType()).setImageFileName(image.getFileName())
                .setImageBase64Data(image.getBase64data()).build()).setId(listing.getId()).build();
    }

}

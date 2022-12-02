package com.group5.service;
import com.group5.proto.Listing.*;
import com.group5.repository.*;
import com.group5.Model.Address;
import com.group5.Model.Area;
import com.group5.Model.HouseListing;
import com.group5.Model.ImageFile;
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

        Area area = new Area(request.getPostNumber(), request.getCity());
        area = areaRepository.save(area);
        Address address = addressRepository.save(new Address(request.getStreet(), request.getHouseNo(), area));
        List<ImageFile> images = new ArrayList<>();

        HouseListing houseListing = houseListingRepository.save(new HouseListing(request.getConstructionYear(),
                request.getLastRebuilt(), request.getHasInspection(), request.getGroundArea(),
                request.getFloorArea(), (long) request.getPrice(), address, LocalDate.now().toString()));


        System.out.println(request.getImageBase64DataList().size());
        System.out.println(request.getImageContentTypeList().size());
        System.out.println(request.getImageFileNameList().size());

        for(int index = 0; index < request.getImageBase64DataList().size(); index++) {
            images.add(imageFileRepository.save(new ImageFile(request.getImageBase64Data(index), request.getImageContentType(index),
                    request.getImageFileName(index), houseListing)));
        }

        List<String> imageBase64Data = new ArrayList<>();
        List<String> imageContentType = new ArrayList<>();
        List<String> imageFileName = new ArrayList<>();

        for(int index = 0; index > images.size(); index++){
            imageBase64Data.add(images.get(index).getBase64data());
            imageFileName.add(images.get(index).getFileName());
            imageContentType.add(images.get(index).getImageContentType());
        }

        HouseResponse.Builder response = HouseResponse.newBuilder().setId(houseListing.getId()).
                setStreet(address.getStreet()).setPostNumber(area.getPostNumber()).setCity(area.getCity()).
                setHouseNo(address.getHouseNumber()).setConstructionYear(houseListing.getConstructionYear())
                .setLastRebuilt(houseListing.getLastRebuilt()).setHasInspection(houseListing.isHasInspection()).
                setGroundArea(houseListing.getGroundArea()).setFloorArea(houseListing.getGroundArea()).setPrice(houseListing.getPrice()).
                setCreationDate(LocalDate.now().toString()).addAllImageBase64Data(imageBase64Data).addAllImageContentType(imageContentType).
                addAllImageFileName(imageFileName);

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
        List<ImageFile> responseImages = new ArrayList<>();
        List<ImageFile> images=imageFileRepository.findAll();
        for(ImageFile x:images)
        {
            if(x.getHouseListing().getId()==request.getId())
            {
                images.add(x);
            }
        }
        List<String> imageBase64Data = new ArrayList<>();
        List<String> imageContentType = new ArrayList<>();
        List<String> imageFileName = new ArrayList<>();

        for(int index = 0; index > images.size(); index++){
            imageBase64Data.add(images.get(index).getBase64data());
            imageFileName.add(images.get(index).getFileName());
            imageContentType.add(images.get(index).getImageContentType());
        }


        HouseResponse response = HouseResponse.newBuilder().setId(houseListing.getId()).
                setStreet(address.getStreet()).setPostNumber(area.getPostNumber()).setCity(area.getCity()).
                setHouseNo(address.getHouseNumber()).setConstructionYear(houseListing.getConstructionYear())
                .setLastRebuilt(houseListing.getLastRebuilt()).setHasInspection(houseListing.isHasInspection()).
                setGroundArea(houseListing.getGroundArea()).setFloorArea(houseListing.getGroundArea()).setPrice(houseListing.getPrice()).
                setCreationDate(LocalDate.now().toString()).addAllImageBase64Data(imageBase64Data).addAllImageContentType(imageContentType).
                addAllImageFileName(imageFileName)
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getFilteredListings(ListingFiltersRequest request, StreamObserver<ShortListingResponse> responseObserver)
    {
        long priceFilter;
        long postCodeFilter;
        long areaFilter;

        if(request.hasMaxPrice())
        {
            priceFilter=request.getMaxPrice();
        }
        if(request.hasMinArea())
        {
            areaFilter=request.getMinArea();
        }
        if(request.hasPostNumber())
        {
            postCodeFilter=request.getPostNumber();
        }


    }

}

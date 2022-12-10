package com.group5.Model;
import com.group5.proto.Listing.ImageFileMessage;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "house_listing")
public class HouseListing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "construction_year")
    int constructionYear;
    @Column(name = "last_rebuilt")
    int lastRebuilt;
    @Column(name = "has_inspection")
    boolean hasInspection;
    @Column(name = "ground_area")
    double groundArea;
    @Column(name = "floor_area")
    double floorArea;
    @Column(name = "price")
    long price;
    @OneToOne
    @JoinColumn(name = "address_id")
    Address address;

    String creationDate;
    @Column (name= "description")
    String description;
    @Column (name= "email")
    String email;

    public HouseListing(int constructionYear, int lastRebuilt, boolean hasInspection, double groundArea, double floorArea, long price, Address address, String creationsDate, String description,String email) {
        this.constructionYear = constructionYear;
        this.lastRebuilt = lastRebuilt;
        this.hasInspection = hasInspection;
        this.groundArea = groundArea;
        this.floorArea = floorArea;
        this.price = price;
        this.address = address;
        this.creationDate = creationsDate;
        this.description = description;
        this.email=email;
    }

    protected HouseListing() {

    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public int getLastRebuilt() {
        return lastRebuilt;
    }

    public void setLastRebuilt(int lastRebuilt) {
        this.lastRebuilt = lastRebuilt;
    }

    public boolean isHasInspection() {
        return hasInspection;
    }

    public void setHasInspection(boolean hasInspection) {
        this.hasInspection = hasInspection;
    }

    public double getGroundArea() {
        return groundArea;
    }

    public void setGroundArea(double groundArea) {
        this.groundArea = groundArea;
    }

    public double getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(double floorArea) {
        this.floorArea = floorArea;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public List<ImageFileMessage> getAllImageFileMessages(List<ImageFile> images)
    {
        List<ImageFileMessage> base=new ArrayList<>();
        for (ImageFile image:images) {
            base.add(ImageFileMessage.newBuilder().setImageFileName(image.getFileName()).setImageContentType(image.getImageContentType())
                    .setImageBase64Data(image.getBase64data()).build());
        }
        return base;
    }
    public List<ImageFile> getAllImageFiles(List<ImageFileMessage> images,HouseListing listing)
    {
        List<ImageFile> base=new ArrayList<>();
        for (ImageFileMessage image:images) {
            base.add(new ImageFile(image.getImageBase64Data(), image.getImageContentType(), image.getImageFileName(), listing ));
        }
        return base;
    }

    public String getDescription() {
        return description;
    }
}

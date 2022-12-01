package com.group5.Model;

import javax.persistence.*;

@Entity
@Table(name = "image_file")
public class ImageFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "base64data")
    private String base64data;
    @Column(name = "image_content_type")
    private String imageContentType;
    @Column(name = "file_name")
    private String fileName;
    @ManyToOne
    @JoinColumn(name = "house_listing_id")
    private HouseListing houseListing;

    protected ImageFile() {
    }

    public ImageFile(String base64data, String imageContentType, String fileName, HouseListing houseListing) {
        this.base64data = base64data;
        this.imageContentType = imageContentType;
        this.fileName = fileName;
        this.houseListing = houseListing;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBase64data() {
        return base64data;
    }

    public void setBase64data(String base64data) {
        this.base64data = base64data;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public HouseListing getHouseListing() {
        return houseListing;
    }

    public void setHouseListing(HouseListing houseListing) {
        this.houseListing = houseListing;
    }
}

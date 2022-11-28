package com.group5.Model;

import javax.persistence.*;

@Entity
@Table(name = "area")
public class Area {
    @Id
    int PostNumber;
    @Column(name = "city")
    String city;

    protected  Area(){

    }

    public Area(int PostNumber, String city) {
        this.PostNumber = PostNumber;
        this.city = city;
    }

    public int getPostNumber() {
        return PostNumber;
    }

    public void setPostNumber(int PostNumber) {
        this.PostNumber = PostNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

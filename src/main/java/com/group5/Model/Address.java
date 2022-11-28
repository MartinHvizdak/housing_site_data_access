package com.group5.Model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "street")
    String street;
    @Column(name = "house_no")
    int houseNumber;
    @ManyToOne
    @JoinColumn(name = "area_id")
    Area area;

    protected Address() {
    }

    public Address(String street, int houseNumber, Area area) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.area = area;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}

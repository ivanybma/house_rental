package com.houserental.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
public class Address {

    @Id
    private String addressId;

    private String address;

    private String city;

    private String state;

    private String zipcode;

    private double latitude;

    private double longitude;

    public Address() {}

    @PersistenceConstructor
    public Address(String address, String city, String state, String zipcode) {
        super();
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Address [address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
    }


}

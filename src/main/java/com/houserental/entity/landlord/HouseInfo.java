package com.houserental.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by cheyikung on 4/17/16.
 */
public class HouseInfo {

    private String houseId;

    private String landlordId;

    private Address address;

    private String propertyType;

    private int numOfBathroom;

    private int numOfBedroom;

    private double sqrtft;

    private double price;

    private List<String> reviewIds;

    private String description;

    private String status;

    private String postingDate;

    public HouseInfo() {}

    public HouseInfo(Address address, String propertyType, int numOfBathroom, int numOfBedroom, double sqrtft, double price, String description, String status, String postingDate) {
        super();
        this.address = address;
        this.propertyType = propertyType;
        this.numOfBathroom = numOfBathroom;
        this.numOfBedroom = numOfBedroom;
        this.sqrtft = sqrtft;
        this.price = price;
        this.description = description;
        this.status = status;
        this.postingDate = postingDate;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(String landlordId) {
        this.landlordId = landlordId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getNumOfBathroom() {
        return numOfBathroom;
    }

    public void setNumOfBathroom(int numOfBathroom) {
        this.numOfBathroom = numOfBathroom;
    }

    public int getNumOfBedroom() {
        return numOfBedroom;
    }

    public void setNumOfBedroom(int numOfBedroom) {
        this.numOfBedroom = numOfBedroom;
    }

    public double getSqrtft() {
        return sqrtft;
    }

    public void setSqrtft(double sqrtft) {
        this.sqrtft = sqrtft;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getReviewIds() {
        return reviewIds;
    }

    public void setReviewRefList(List<String> reviewIds) {
        this.reviewIds = reviewIds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(String postingDate) {
        this.postingDate = postingDate;
    }

    public void addReviewId(String reviewId){
        reviewIds.add(reviewId);
    }
}

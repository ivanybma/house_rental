package com.houserental.entity;

/**
 * Created by cheyikung on 4/19/16.
 */
public class ReviewRef {

    private String tenantId;
    private String reviewId;
    private String landlordId;

    public ReviewRef(){}

    public ReviewRef(String tenantId, String reviewId, String landlordId) {
        this.tenantId = tenantId;
        this.reviewId = reviewId;
        this.landlordId = landlordId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(String landlordId) {
        this.landlordId = landlordId;
    }
}

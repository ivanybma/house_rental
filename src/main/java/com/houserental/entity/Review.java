package com.houserental.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by cheyikung on 4/17/16.
 */
@Document(collection = "review")
public class Review {
    @Id
    private String reviewId;

    @DBRef(db = "tenant")
    private Tenant tenant;

    private Date date;

    private String rating;

    private String description;

    public Review(Date date, String rating, String description) {
        super();
        this.date = date;
        this.rating = rating;
        this.description = description;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

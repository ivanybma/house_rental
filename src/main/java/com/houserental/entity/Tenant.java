package com.houserental.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by cheyikung on 4/17/16.
 */
@Document(collection = "tenant")
public class Tenant {
    @Id
    private String tenantId;

    private String name;

    @DBRef(db = "review")
    private List<Review> review;

    private List<String>  favoriteHouseId;

    @PersistenceConstructor
    public Tenant(String name) {
        super();
        this.name = name;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public List<String> getFavoriteHouseId() {
        return favoriteHouseId;
    }

    public void setFavoriteHouseId(List<String> favoriteHouseId) {
        this.favoriteHouseId = favoriteHouseId;
    }
}

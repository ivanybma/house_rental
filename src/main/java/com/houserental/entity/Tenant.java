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

    private List<String> reviewIdList;

    private List<Favorite> favoriteList;

    private List<ReviewRef> reviewRefList;

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

    public List<String> getReviewIdList() {
        return reviewIdList;
    }

    public void setReviewIdList(List<String> reviewIdList) {
        this.reviewIdList = reviewIdList;
    }

    public List<Favorite> getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(List<Favorite> favoriteList) {
        this.favoriteList = favoriteList;
    }

    public List<ReviewRef> getReviewRefList() {
        return reviewRefList;
    }

    public void setReviewRefList(List<ReviewRef> reviewRefList) {
        this.reviewRefList = reviewRefList;
    }
}

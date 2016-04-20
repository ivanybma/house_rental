package com.houserental.repository;

import com.houserental.entity.Review;

/**
 * Created by cheyikung on 4/19/16.
 */
public interface TenantRepoCustom {
    public void addReview(String tenantName, String landlordName, String houseId, Review review);
}

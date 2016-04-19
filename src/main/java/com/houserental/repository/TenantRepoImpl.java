package com.houserental.repository;

import com.houserental.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cheyikung on 4/19/16.
 */
public class TenantRepoImpl implements TenantRepoCustom{
    @Autowired
    ReviewRepo reviewRepo;

    @Override
    public String addReview(Review review) {
        Review rev = reviewRepo.save(review);
        return rev.getReviewId();
    }
}

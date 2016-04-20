package com.houserental.repository;

import com.houserental.entity.HouseInfo;
import com.houserental.entity.Landlord;
import com.houserental.entity.Review;
import com.houserental.entity.Tenant;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cheyikung on 4/19/16.
 */
public class TenantRepoImpl implements TenantRepoCustom{
    @Autowired
    LandlordRepo landlordRepo;
    @Autowired
    TenantRepo tenantRepo;
    @Autowired
    ReviewRepo reviewRepo;

    @Override
    public void addReview(String tenantName, String landlordName, String houseId, Review review) {

        Tenant tenant = tenantRepo.findByName(tenantName);

        Landlord landlord = landlordRepo.findByName(landlordName);

        HouseInfo house = landlord.getHouseById(houseId);


        review.setLandlordId(landlord.getLandlordId());
        review.setHouseId(house.getHouseId());
        review.setTenantId(tenant.getTenantId());


        Review rev = reviewRepo.save(review);

        house.addReviewId(rev.getReviewId());
        tenant.addReviewId(rev.getReviewId());

        landlord.setHouseById(houseId, house);

        landlordRepo.save(landlord);

        tenantRepo.save(tenant);
    }
}

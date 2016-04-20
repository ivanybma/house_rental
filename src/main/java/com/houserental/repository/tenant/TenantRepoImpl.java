package com.houserental.repository.tenant;

import com.houserental.entity.landlord.HouseInfo;
import com.houserental.entity.landlord.Landlord;
import com.houserental.entity.review.Review;
import com.houserental.entity.tenant.Tenant;
import com.houserental.repository.landlord.LandlordRepo;
import com.houserental.repository.review.ReviewRepo;
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

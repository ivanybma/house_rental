package com.houserental.repository;

import com.houserental.entity.HouseInfo;
import com.houserental.entity.Landlord;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cheyikung on 4/19/16.
 */
public class LandlordRepoImpl implements LandlordRepoCustom{
    @Autowired
    LandlordRepo landlordRepo;

    @Override
    public void addHouse(String landlordName, HouseInfo houseInfo) {
        Landlord landlord = landlordRepo.findByName(landlordName);
        landlord.addHouse(houseInfo);
        landlordRepo.save(landlord);
    }
}

package com.houserental.repository.landlord;

import com.houserental.entity.landlord.HouseInfo;

/**
 * Created by cheyikung on 4/19/16.
 */
public interface LandlordRepoCustom {
    public void addHouse(String landlordName, HouseInfo houseInfo);
}

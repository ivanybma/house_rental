package com.houserental.entity.tenant;

/**
 * Created by cheyikung on 4/19/16.
 */
public class Favorite {

    private String landlordId;
    private String houseInfoId;

    public Favorite(){}

    public Favorite(String landlordId, String houseInfoId) {
        this.landlordId = landlordId;
        this.houseInfoId = houseInfoId;
    }

    public String getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(String houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public String getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(String landlordId) {
        this.landlordId = landlordId;
    }
}

package com.houserental.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheyikung on 4/17/16.
 */

@Document(collection = "landlord")
public class Landlord {


//    @Id
//    private Long landlordId;

    @Id
    private String landlordId;

    @DBRef(db = "houseinfo")
    private List<HouseInfo> houseOwned =  new ArrayList<HouseInfo>();

    private String phoneNum;

    private String email;

    public Landlord() {}

    @PersistenceConstructor
    public Landlord(String phoneNum, String email)
    {
        super();
        this.phoneNum = phoneNum;
        this.email = email;
    }


    public String getId() {
        return landlordId;
    }

    public void setId(String landlordId) {
        this.landlordId = landlordId;
    }

    public List<HouseInfo> getHouseOwned() {
        return houseOwned;
    }

    public void setHouseOwned(List<HouseInfo> houseOwned) {
        this.houseOwned = houseOwned;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Landlord [landlordId= " + landlordId + ", phone number= " + phoneNum + ", email= " + email + ", houseOwned= " + houseOwned + "]";
    }
}

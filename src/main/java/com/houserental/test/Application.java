package com.houserental.test;


import com.houserental.entity.*;
import com.houserental.repository.*;
import com.houserental.service.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * for testing purpose
 */

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new ClassPathResource("applicationContext.xml").getPath());
        LandlordRepo landlordRepo = context.getBean(LandlordRepo.class);

//        CounterService counterService = (CounterService) context.getBean(CounterService.class);

        Landlord landlordAchilles = new Landlord();
        landlordAchilles.setPhoneNum("111-111-1111");
        landlordAchilles.setEmail("achilles@gmail.com");

        landlordRepo.save(landlordAchilles);

        Address address = new Address("1 Washington St.", "San Jose", "CA", "94539");

        HouseInfo house1 = new HouseInfo();

        house1.setAddress(address);
        house1.setPropertyType("town house");
        house1.setNumOfBathroom(3);
        house1.setNumOfBedroom(4);
        house1.setSqrtft(400d);
        house1.setPrice(1000.0d);
        house1.setDescription("house 1 owned by 111-111-1111");
        house1.setStatus("open");
        house1.setPostingDate("2016-04-16");

        Landlord retrieveLL = landlordRepo.searchByPhoneNum("111-111-1111");

        List<HouseInfo> houseList = new ArrayList<HouseInfo>();
        houseList.add(house1);
        retrieveLL.setHouseOwned(houseList);

        landlordRepo.save(retrieveLL);

        context.close();
    }
}

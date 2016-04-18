package com.houserental.repository;

import com.houserental.entity.HouseInfo;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cheyikung on 4/17/16.
 */
public interface HouseInfoRepo extends CrudRepository<HouseInfo, String>{
    @Query("{'_id' : ?0}")
    public HouseInfo findById(String id);
}

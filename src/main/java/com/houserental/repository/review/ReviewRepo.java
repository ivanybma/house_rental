package com.houserental.repository;

import com.houserental.entity.Review;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cheyikung on 4/17/16.
 */
public interface ReviewRepo extends CrudRepository<Review, String>, ReviewRepoCustom{
    @Query("{'_id' : ?0}")
    public Review findById(String id);
}

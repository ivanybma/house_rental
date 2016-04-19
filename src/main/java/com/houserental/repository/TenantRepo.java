package com.houserental.repository;

import com.houserental.entity.Tenant;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cheyikung on 4/17/16.
 */
public interface TenantRepo extends CrudRepository<Tenant, String>, TenantRepoCustom{
    @Query("{'_id' : ?0}")
    public Tenant findById(String id);
}

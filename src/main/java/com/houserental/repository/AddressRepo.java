package com.houserental.repository;

import com.houserental.entity.Address;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address, String> {
    @Query("{'_id' : ?0}")
    public Address findById(String id);
}

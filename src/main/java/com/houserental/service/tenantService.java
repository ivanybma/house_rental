package com.houserental.service;

import com.houserental.entity.tenant;

import java.util.List;

/**
 * Created by ivanybma on 4/16/16.
 */
public interface tenantService {
    public void insert(tenant st);

    /**
     * delete object
     *
     * @author  Yuebiao ma
     * @version 1.0
     * @param id of object pending to be deleted
     * @since 2016-03-30
     *
     */
    public void delete(String id);

    /**
     * query object list
     *
     * @author  Yuebiao ma
     * @version 1.0
     * @param id of object to be queried
     * @since 2016-03-30
     *
     */
    public List<tenant> getProfilebyid(String id);

    public void update(tenant obj);

    public String testquery();
}

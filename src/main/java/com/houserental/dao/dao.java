package com.houserental.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ivanybma on 4/16/16.
 */
public interface dao<T extends Object> {

    public void insert(T obj);
    public void deleteById(Serializable id);
    public void update(T st);
    public List<T> query(String id);
}

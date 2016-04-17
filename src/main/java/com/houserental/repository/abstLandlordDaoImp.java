package com.houserental.repository;

import com.houserental.dao.dao;
import org.springframework.util.ReflectionUtils;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanybma on 4/16/16.
 */
public  abstract class  abstLandlordDaoImp <T extends Object> implements dao<T> {

    private Class<T> domainClass;


    /**
     * Reflect the concrete class object
     *
     * @author  Yuebiao ma
     * @version 1.0
     * @since 2016-03-30
     *
     */
    private Class<T> getDomainClass(){
        if (domainClass==null)
        {
            ParameterizedType thisType=(ParameterizedType) getClass().getGenericSuperclass();
            this.domainClass=(Class<T>) thisType.getActualTypeArguments()[0];
        }
        return domainClass;
    }

    /**
     * Reflect the concrete class name
     *
     * @author  Yuebiao ma
     * @version 1.0
     * @since 2016-03-30
     *
     */
    private String getDomainClassName(){
        return getDomainClass().getName();
    }

    /**
     * Persist object
     *
     * @author  Yuebiao ma
     * @version 1.0
     * @param obj object pending to be persisted
     * @since 2016-03-30
     *
     */
    public void insert(T obj){

        Method method= ReflectionUtils.findMethod(getDomainClass(), "toString");
        System.out.println("Saving.....");
        if(method!=null)
        {
            try{
                System.out.println(method.invoke(obj,null));
            }catch(Exception e){}
        }
        //save your object here......
        System.out.println("Saved!");
    }

    /**
     * Retrieve object list according to object id
     *
     * @author  Yuebiao ma
     * @version 1.0
     * @param id for query
     * @since 2016-03-30
     *
     */
    public List<T> query(String id){
        return new ArrayList<T>();
       // return entityManager.createQuery("from Profile as p where id=:id").setParameter("id",id).getResultList();
    }

    /**
     * Update object
     *
     * @author  Yuebiao ma
     * @version 1.0
     * @param obj object pending to be updated
     * @since 2016-03-30
     *
     */
    public void update(T obj){
        System.out.println(obj);
//        entityManager.merge(obj);
    }

    /**
     * delete object by id
     *
     * @author  Yuebiao ma
     * @version 1.0
     * @param id object pending to be deleted
     * @since 2016-03-30
     *
     */
    public void deleteById(Serializable id){
//        List<T> profilelst = entityManager.createQuery("from Profile as p where id=:id").setParameter("id",id).getResultList();
//        for(T obj:profilelst){
//            entityManager.remove(obj);
//        }
    }
}

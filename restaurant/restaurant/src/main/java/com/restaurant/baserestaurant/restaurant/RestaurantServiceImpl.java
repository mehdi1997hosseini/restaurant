package com.restaurant.baserestaurant.restaurant;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl extends ServiceBasicImpl<RestaurantEntity,Long,RestaurantRepository> implements RestaurantService{

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository repository) {
        super(repository);
    }


    @Override
    public void beforeSaveOrUpdate(RestaurantEntity entity) {

    }


}

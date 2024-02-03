package com.restaurant.baserestaurant.food;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl extends ServiceBasicImpl<FoodEntity,Long,FoodRepository> implements FoodService {

    @Autowired
    public FoodServiceImpl(FoodRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(FoodEntity entity) {

    }
}

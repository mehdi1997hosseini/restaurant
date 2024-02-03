package com.restaurant.baserestaurant.bossrestaurant;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BossRestaurantServiceImpl extends ServiceBasicImpl<BossRestaurantEntity,Long,BossRestaurantRepository> implements BossRestaurantService {

    @Autowired
    public BossRestaurantServiceImpl(BossRestaurantRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(BossRestaurantEntity entity) {

    }
}

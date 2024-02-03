package com.restaurant.baserestaurant.bossrestaurant;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/boss-restaurant")
public class BossRestaurantController extends ControllerBasic<BossRestaurantEntity,Long,BossRestaurantService> {

    @Autowired
    public BossRestaurantController(BossRestaurantService service) {
        super(service);
    }

}

package com.restaurant.baserestaurant.restaurant;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController extends ControllerBasic<RestaurantEntity,Long,RestaurantService> {

    @Autowired
    public RestaurantController(RestaurantService service) {
        super(service);
    }

}

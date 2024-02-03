package com.restaurant.baserestaurant.food;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/food")
public class FoodController extends ControllerBasic<FoodEntity,Long,FoodService> {

    @Autowired
    public FoodController(FoodService service) {
        super(service);
    }

}

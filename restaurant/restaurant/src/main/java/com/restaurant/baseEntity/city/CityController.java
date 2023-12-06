package com.restaurant.baseEntity.city;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("city")
public class CityController extends ControllerBasic<CityEntity,Long,CityService> {

    @Autowired
    public CityController(CityService service) {
        super(service);
    }
}

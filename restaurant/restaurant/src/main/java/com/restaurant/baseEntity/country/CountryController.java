package com.restaurant.baseEntity.country;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("country")
public class CountryController extends ControllerBasic<CountryEntity,Long,CountryService> {

    @Autowired
    public CountryController(CountryService service) {
        super(service);
    }
}

package com.restaurant.baseEntity.address;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController extends ControllerBasic<AddressEntity,Long, AddressService> {

    @Autowired
    public AddressController(AddressService service) {
        super(service);
    }

}

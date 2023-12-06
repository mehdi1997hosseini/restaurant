package com.restaurant.baseEntity.province;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("province")
public class ProvinceController extends ControllerBasic<ProvinceEntity,Long,ProvinceService> {

    @Autowired
    public ProvinceController(ProvinceService service) {
        super(service);
    }

}

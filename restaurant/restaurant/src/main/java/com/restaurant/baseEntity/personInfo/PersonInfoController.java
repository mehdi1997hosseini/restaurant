package com.restaurant.baseEntity.personInfo;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Person-Info")
public class PersonInfoController extends ControllerBasic<PersonInfoEntity,Long,PersonInfoService> {

    @Autowired
    public PersonInfoController(PersonInfoService service) {
        super(service);
    }


}

package com.restaurant.baseEntity.menuservice;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("menu")
public class MenuServiceController extends ControllerBasic<MenuServiceEntity,Long, MenuServiceService> {

    public MenuServiceController(MenuServiceService service) {
        super(service);
    }

}

package com.restaurant.baseEntity.color;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("color")
public class ColorController extends ControllerBasic<ColorEntity,Long,ColorService> {

    @Autowired
    public ColorController(ColorService service) {
        super(service);
    }
}

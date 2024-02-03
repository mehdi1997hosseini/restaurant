package com.restaurant.baserestaurant.employee;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController extends ControllerBasic<EmployeeEntity,Long,EmployeeService> {

    @Autowired
    public EmployeeController(EmployeeService service) {
        super(service);
    }
}

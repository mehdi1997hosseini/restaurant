package com.restaurant.baserestaurant.employee;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceBasicImpl<EmployeeEntity,Long,EmployeeRepository> implements EmployeeService {

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(EmployeeEntity entity) {

    }

}

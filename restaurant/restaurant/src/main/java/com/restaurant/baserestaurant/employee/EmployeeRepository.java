package com.restaurant.baserestaurant.employee;

import com.restaurant.baseProject.repositorybasic.RepositoryBasic;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends RepositoryBasic<EmployeeEntity,Long> {

}

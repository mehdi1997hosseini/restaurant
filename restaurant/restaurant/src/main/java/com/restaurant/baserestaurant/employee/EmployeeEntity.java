package com.restaurant.baserestaurant.employee;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import com.restaurant.baseEntity.personInfo.PersonInfoEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "TBL_EMPLOYEE")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeEntity extends EntityBasic<Long> {

    @Column(name = "EMPLOYEE_EMPLOYEE_CODE")
    private String employeeCode;

    @Column(name = "EMPLOYEE_ROLE")
    @ElementCollection(targetClass = RolesRestaurant.class)
    @CollectionTable(name = "TBL_ROLE_EMPLOYEE",joinColumns = @JoinColumn(name = "ROLE_EMPLOYEE_EMPLOYEE_CODE",referencedColumnName = "EMPLOYEE_EMPLOYEE_CODE"))
    private List<RolesRestaurant> roles;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_PERSON_INFO")
    private PersonInfoEntity personInfo;

}

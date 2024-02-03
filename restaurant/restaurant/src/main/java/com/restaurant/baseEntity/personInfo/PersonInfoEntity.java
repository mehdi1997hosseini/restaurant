package com.restaurant.baseEntity.personInfo;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "TBL_PERSON_INFO")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonInfoEntity extends EntityBasic<Long> {

    @Column(name = "PERSON_INFO_FIRSTNAME")
    private String firstname;
    @Column(name = "PERSON_INFO_LASTNAME")
    private String lastName;
    @Column(name = "PERSON_INFO_BIRTH_DATE")
    private Date birthDate;
    @Column(name = "PERSON_INFO_NATIONAL_CODE")
    private String nationalCode;
    @Column(name = "PERSON_INFO_MOBILE_NUMBER")
    private String mobileNumber;

}

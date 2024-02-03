package com.restaurant.baseEntity.country;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "TBL_COUNTRY")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryEntity extends EntityBasic<Long> {

    @Column(name = "COUNTRY_NAME")
    private String countryName;

    @Column(name = "COUNTRY_CODE")
    private Integer countryCode;

}

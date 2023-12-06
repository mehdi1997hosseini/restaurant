package com.restaurant.baseEntity.country;

import com.restaurant.baseProject.entitybasic.EntityBasic;
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
    private String countryName;

    private Integer countryCode;

}

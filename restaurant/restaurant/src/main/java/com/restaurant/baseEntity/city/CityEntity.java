package com.restaurant.baseEntity.city;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restaurant.baseEntity.province.ProvinceEntity;
import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "TBL_CITY")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CityEntity extends EntityBasic<Long> {

    @Column(name = "CITY_CODE")
    private Integer cityCode;
    @Column(name = "CITY_NAME")
    private String cityName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROVINCE_ID", nullable = false)
    @JsonIgnore
    private ProvinceEntity province;

}

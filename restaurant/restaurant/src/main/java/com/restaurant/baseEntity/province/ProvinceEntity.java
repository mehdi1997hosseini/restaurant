package com.restaurant.baseEntity.province;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restaurant.baseEntity.country.CountryEntity;
import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "TBL_PROVINCE")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProvinceEntity extends EntityBasic<Long> {

    @Column(name = "PROVINCE_CODE")
    private Integer provinceCode;
    @Column(name = "PROVINCE_NAME")
    private String provinceName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COUNTRY_ID", nullable = false)
    @JsonIgnore
    private CountryEntity country;

}


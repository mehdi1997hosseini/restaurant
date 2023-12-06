package com.restaurant.baseEntity.province;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

}


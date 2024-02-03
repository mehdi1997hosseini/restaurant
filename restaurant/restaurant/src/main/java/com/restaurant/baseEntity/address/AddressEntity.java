package com.restaurant.baseEntity.address;

import com.restaurant.baseEntity.city.CityEntity;
import com.restaurant.baseEntity.province.ProvinceEntity;
import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TBL_ADDRESS")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressEntity extends EntityBasic<Long> {

    @Column(name = "ADDRESS_STREET")
    private String street;
    @Column(name = "ADDRESS_LANE")
    private String lane;
    @Column(name = "ADDRESS_ZIP_CODE")
    private String zipCode;
    @Column(name = "ADDRESS_PLAQUE")
    private Integer plaque;
    @Column(name = "ADDRESS_PHONE_NUMBER")
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_PROVINCE")
    private ProvinceEntity province;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_CITY")
    private CityEntity city;

}

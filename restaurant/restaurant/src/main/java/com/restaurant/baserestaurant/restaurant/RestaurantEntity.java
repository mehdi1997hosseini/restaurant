package com.restaurant.baserestaurant.restaurant;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import com.restaurant.baseEntity.address.AddressEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TBL_RESTAURANT")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestaurantEntity extends EntityBasic<Long> {

    @Column(name = "RESTAURANT_RESTAURANT_NAME")
    private String restaurantName;
    @Column(name = "RESTAURANT_RESTAURANT_CODE")
    private Integer restaurantCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESTAURANT_ADDRESS")
    private AddressEntity address;

}

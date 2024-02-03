package com.restaurant.baserestaurant.bossrestaurant;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import com.restaurant.baserestaurant.employee.EmployeeEntity;
import com.restaurant.baserestaurant.restaurant.RestaurantEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "TBL_BOSS_RESTAURANT")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BossRestaurantEntity extends EntityBasic<Long> {

    @ManyToOne
    @JoinColumn(name = "BOSS_RESTAURANT_BOSS")
    private EmployeeEntity bossRestaurant;

    @ManyToOne
    @JoinColumn(name = "BOSS_RESTAURANT_RESTAURANT")
    private RestaurantEntity restaurant;

}

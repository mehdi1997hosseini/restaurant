package com.restaurant.baserestaurant.restaurant;

import com.restaurant.baseProject.repositorybasic.RepositoryBasic;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends RepositoryBasic<RestaurantEntity,Long> {

}

package com.restaurant.baserestaurant.food;

import com.restaurant.baseProject.repositorybasic.RepositoryBasic;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends RepositoryBasic<FoodEntity,Long> {

}

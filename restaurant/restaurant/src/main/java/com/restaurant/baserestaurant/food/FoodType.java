package com.restaurant.baserestaurant.food;

public enum FoodType {
      IRANIAN_FOOD(1)
    , INTERNATIONAL_FOOD(2)
    , TRADITIONAL_FOOD(3)
    , FAST_FOOD(4)
    , MAIN_COURSES(5)
    , SEA_FOOD(6)
    , SNACKS(7)
    , DESSERTS(8)
    , SALAD(9)
    , DRINKS(10);

    private final Integer code;

    FoodType(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

}

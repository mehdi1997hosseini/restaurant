package com.restaurant.baserestaurant.employee;

public enum RolesRestaurant {
    BOSS_RESTAURANT(1),
    MANAGER(2),
    CHEF(3),
    SOUS_CHEF(4),
    BARISTA(5),
    BOOK_KEEPER(6),
    WAREHOUSE_KEEPER(7),
    SERVANT(8),
    WAITER(9),
    DISHWASHER(10);


    private Integer code;
    private String title;

    RolesRestaurant(Integer code) {
        this.code = code;
    }

    RolesRestaurant(String title) {
        this.title = title;
    }

    RolesRestaurant(Integer code, String title) {
        this.code = code;
        this.title = title;
    }

    public Integer getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }
}

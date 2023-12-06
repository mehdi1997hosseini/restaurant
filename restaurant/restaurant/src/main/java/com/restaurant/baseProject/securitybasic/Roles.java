package com.restaurant.baseProject.securitybasic;

public enum Roles {
    BOSS(0),
    SUPER_ADMIN(1),
    ADMIN(2),
    USER(3),
    ;


    private Integer code;
    Roles(Integer code) {
        this.code = code;
    }
    public Integer getCode() {
        return code;
    }

}

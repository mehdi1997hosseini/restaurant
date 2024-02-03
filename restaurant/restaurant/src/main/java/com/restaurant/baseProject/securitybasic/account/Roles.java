package com.restaurant.baseProject.securitybasic.account;

import org.springframework.security.core.GrantedAuthority;

public enum Roles implements GrantedAuthority {
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

    @Override
    public String getAuthority() {
        return this.name();
    }

}

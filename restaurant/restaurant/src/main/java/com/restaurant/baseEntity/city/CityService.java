package com.restaurant.baseEntity.city;

import com.restaurant.baseProject.servicebasic.ServiceBasic;

public interface CityService extends ServiceBasic<CityEntity,Long> {
    public CityEntity getCityByCode(Integer code);
}

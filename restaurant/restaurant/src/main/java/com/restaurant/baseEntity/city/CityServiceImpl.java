package com.restaurant.baseEntity.city;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl extends ServiceBasicImpl<CityEntity, Long, CityRepository> implements CityService {

    public CityServiceImpl(CityRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(CityEntity entity) {
        List<Integer> lastCityCodeByProvince = this.repository.getLastCityCodeByProvinceId(entity.getProvince().getId());
        if (lastCityCodeByProvince == null||lastCityCodeByProvince.isEmpty())
            entity.setCityCode((entity.getProvince().getProvinceCode()*1000)+1);
        else
            entity.setCityCode(lastCityCodeByProvince.get(0) + 1);
    }

    @Override
    public CityEntity getCityByCode(Integer code) {
        return null;
    }
}

package com.restaurant.baseEntity.country;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryServiceImpl extends ServiceBasicImpl<CountryEntity,Long,CountryRepository> implements CountryService{


    public CountryServiceImpl(CountryRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(CountryEntity entity) {
        List<Integer> lastCountryCode = this.repository.findLastCountryCode();
        if (lastCountryCode==null||lastCountryCode.isEmpty())
            entity.setCountryCode(1);
        else
            entity.setCountryCode(lastCountryCode.get(0)+1);
    }
}

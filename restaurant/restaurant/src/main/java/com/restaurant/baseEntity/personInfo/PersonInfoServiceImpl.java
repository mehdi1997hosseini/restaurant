package com.restaurant.baseEntity.personInfo;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonInfoServiceImpl extends ServiceBasicImpl<PersonInfoEntity,Long,PersonInfoRepository> implements PersonInfoService {

    @Autowired
    public PersonInfoServiceImpl(PersonInfoRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(PersonInfoEntity entity) {

    }

}

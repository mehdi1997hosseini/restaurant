package com.restaurant.baseEntity.address;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends ServiceBasicImpl<AddressEntity,Long, AddressRepository> implements AddressService {

    @Autowired
    public AddressServiceImpl(AddressRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(AddressEntity entity) {

    }

}

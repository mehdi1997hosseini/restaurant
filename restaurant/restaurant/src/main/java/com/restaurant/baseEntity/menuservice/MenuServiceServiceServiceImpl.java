package com.restaurant.baseEntity.menuservice;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceServiceServiceImpl extends ServiceBasicImpl<MenuServiceEntity,Long, MenuServiceRepository> implements MenuServiceService {

    public MenuServiceServiceServiceImpl(MenuServiceRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(MenuServiceEntity entity) {

    }


}

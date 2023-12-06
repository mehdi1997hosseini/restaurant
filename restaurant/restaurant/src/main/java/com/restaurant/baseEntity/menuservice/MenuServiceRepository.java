package com.restaurant.baseEntity.menuservice;

import com.restaurant.baseProject.repositorybasic.RepositoryBasic;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuServiceRepository extends RepositoryBasic<MenuServiceEntity,Long> {
}

package com.restaurant.baseProject.repositorybasic;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface RepositoryBasic<E extends EntityBasic<P>, P extends Serializable> extends /*PagingAndSortingRepository<E, P>,*/ JpaRepository<E, P>/*, CrudRepository<E, P>*/ /*, DaoBasic<E,P>*/ {
}

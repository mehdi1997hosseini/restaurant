package com.restaurant.baseProject.servicebasic;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import com.restaurant.baseProject.repositorybasic.RepositoryBasic;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.util.List;

@MappedSuperclass
public abstract class ServiceBasicImpl<E extends EntityBasic<P>, P extends Serializable, R extends RepositoryBasic<E, P>> implements ServiceBasic<E, P>  {

    protected final R repository;

    public ServiceBasicImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E save(E entity) {
        return repository.save(entity);
    }

    @Override
    public E saveOrUpdate(E entity) {
        beforeSaveOrUpdate(entity);
        if (entity.getId()==null)
            return save(entity);
        return update(entity);
    }

    @Override
    public E update(E entity) {
        return save(entity);
    }

    @Override
    public List<E> findAll() {
        try {
            return repository.findAll();
        }catch (Exception ex){
            return null;
        }
    }

    @Override
    public E findById(P id) {
        return repository.findById(id).orElseThrow();
    }


    public abstract void beforeSaveOrUpdate(E entity) ;

}

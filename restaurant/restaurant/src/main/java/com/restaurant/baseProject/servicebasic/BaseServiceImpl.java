package com.restaurant.baseProject.servicebasic;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import com.restaurant.baseProject.repositorybasic.RepositoryBasic;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<E extends EntityBasic<P>,D,P extends Serializable, R extends RepositoryBasic<E, P>> implements BaseService<E,D,P> {

    protected final R repository;


    protected BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public D save(E entity) {
        return null;
    }

    @Override
    public D saveOrUpdate(D dto) {
        return null;
    }

    @Override
    public List<D> findAll() {
        return null;
    }

    @Override
    public D findById(P id) {
        return null;
    }
}

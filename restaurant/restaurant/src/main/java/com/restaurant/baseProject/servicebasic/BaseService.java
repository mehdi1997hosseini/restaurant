package com.restaurant.baseProject.servicebasic;

import java.io.Serializable;
import java.util.List;
// (entity,dto,primaryKey)
public interface BaseService<E,D,P extends Serializable> {
    public D save(E entity);
    public D saveOrUpdate(D dto);
    public List<D> findAll();
    public D findById(P id);

}

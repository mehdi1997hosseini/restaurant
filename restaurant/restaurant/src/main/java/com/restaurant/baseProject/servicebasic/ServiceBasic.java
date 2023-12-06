package com.restaurant.baseProject.servicebasic;

import com.restaurant.baseProject.entitybasic.EntityBasic;

import java.io.Serializable;
import java.util.List;

//(entity , primaryKey)
public interface ServiceBasic<E extends EntityBasic<P>,P extends Serializable>{

    public E save(E entity);
    public E update(E entity);
    public E saveOrUpdate(E entity);
    public List<E> findAll();
    public E findById(P id);

}

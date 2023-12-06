package com.restaurant.baseProject.mapperbasic;

import java.util.List;

public interface MapperBasic<E, D> {
    E convertEntity(D model);
    List<E> convertEntity(List<D> models);
    D convertDto(E entity);
    List<D> convertDto(List<E> entities);

}

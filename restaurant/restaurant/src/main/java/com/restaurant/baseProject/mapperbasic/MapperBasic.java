package com.restaurant.baseProject.mapperbasic;

import java.util.List;

public interface MapperBasic<E, D> {
    E convertToEntity(D model);
    List<E> convertToEntity(List<D> models);
    D convertToDto(E entity);
    List<D> convertToDto(List<E> entities);

}

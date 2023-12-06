package com.restaurant.baseEntity.city;

import com.restaurant.baseProject.repositorybasic.RepositoryBasic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends RepositoryBasic<CityEntity,Long> {
    @Query(value = "select c.cityCode from CityEntity c where c.province.id =?1 order by c.cityCode desc ")
    public List<Integer> getLastCityCodeByProvinceId(Long provinceId);

}

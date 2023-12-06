package com.restaurant.baseEntity.province;

import com.restaurant.baseProject.repositorybasic.RepositoryBasic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends RepositoryBasic<ProvinceEntity,Long> {
    @Query(value = "select c.provinceCode from ProvinceEntity c order by c.provinceCode desc ")
    public List<Integer> findLastProvinceCode();
}

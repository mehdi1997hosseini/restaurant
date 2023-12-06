package com.restaurant.baseEntity.color;

import com.restaurant.baseProject.repositorybasic.RepositoryBasic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorRepository extends RepositoryBasic<ColorEntity,Long> {
    @Query(value = "select c.colorCode from ColorEntity c order by c.colorCode desc ")
    public List<Integer> findLastColorCode();

}

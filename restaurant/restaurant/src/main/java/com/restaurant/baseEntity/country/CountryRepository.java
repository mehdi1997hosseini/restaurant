package com.restaurant.baseEntity.country;

import com.restaurant.baseProject.repositorybasic.RepositoryBasic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends RepositoryBasic<CountryEntity,Long> {
    @Query(value = "select c.countryCode from CountryEntity c order by c.countryCode desc")
    public List<Integer> findLastCountryCode();

}

package com.restaurant.baseProject.securitybasic.account;

import com.restaurant.baseProject.repositorybasic.RepositoryBasic;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends RepositoryBasic<AccountEntity,String> {

    public AccountEntity findAccountEntityByUsername(String username);

}

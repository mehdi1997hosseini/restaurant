package com.restaurant.baseProject.securitybasic.account;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends ServiceBasicImpl<AccountEntity,String,AccountRepository> implements AccountService , UserDetailsService {

    @Autowired
    public AccountServiceImpl(AccountRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(AccountEntity entity) {

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findAccountEntityByUsername(username);
    }
}

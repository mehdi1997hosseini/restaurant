package com.restaurant.baseProject.securitybasic.account;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController extends ControllerBasic<AccountEntity,String,AccountService> {

    @Autowired
    public AccountController(AccountService service) {
        super(service);
    }

}

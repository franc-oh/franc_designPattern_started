package com.franc.design._02_structural._06_adapter._02_after1.adapter;

import com.franc.design._02_structural._06_adapter._02_after1.adaptee.User;
import com.franc.design._02_structural._06_adapter._02_after1.adaptee.UserService;
import com.franc.design._02_structural._06_adapter._02_after1.target.Account;
import com.franc.design._02_structural._06_adapter._02_after1.target.AccountService;

public class A_UserService implements AccountService {

    UserService userService;

    public A_UserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Account selectAccount(String email) {
        String username = userService.findUsernameByEmail(email);
        User account = userService.findByUsername(username);
        return new A_User(account);
    }
}

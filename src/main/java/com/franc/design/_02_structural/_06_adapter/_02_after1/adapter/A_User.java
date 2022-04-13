package com.franc.design._02_structural._06_adapter._02_after1.adapter;

import com.franc.design._02_structural._06_adapter._02_after1.adaptee.User;
import com.franc.design._02_structural._06_adapter._02_after1.target.Account;

public class A_User implements Account {

    private User user;


    public A_User(User user) {
        this.user = user;
    }


    @Override
    public String getEmail() {
        return this.user.getEmail();
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String toString() {
        return user.toString();
    }

}

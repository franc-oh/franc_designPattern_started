package com.franc.design._02_structural._06_adapter._02_after2;

import com.franc.design._02_structural._06_adapter._02_after2.adaptee.AccountService;
import com.franc.design._02_structural._06_adapter._02_after2.target.LoginHandler;
import com.franc.design._02_structural._06_adapter._02_after2.target.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountService();
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("franc", "franc_pwd");
        System.out.println(login);
    }

}

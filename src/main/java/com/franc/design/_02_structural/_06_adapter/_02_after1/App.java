package com.franc.design._02_structural._06_adapter._02_after1;

import com.franc.design._02_structural._06_adapter._02_after1.adaptee.User;
import com.franc.design._02_structural._06_adapter._02_after1.adaptee.UserService;
import com.franc.design._02_structural._06_adapter._02_after1.adapter.A_UserService;
import com.franc.design._02_structural._06_adapter._02_after1.target.Account;
import com.franc.design._02_structural._06_adapter._02_after1.target.LoginHandler;

public class App {

    public static void main(String[] args) {
        LoginHandler loginHandler = new LoginHandler( new A_UserService( new UserService() ) );

        Account login = loginHandler.login("franc@naver.com", "franc!@#");
        System.out.println(login.toString());
    }

}

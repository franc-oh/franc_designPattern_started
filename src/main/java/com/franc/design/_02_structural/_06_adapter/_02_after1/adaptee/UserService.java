package com.franc.design._02_structural._06_adapter._02_after1.adaptee;

public class UserService {

    public User findByUsername(String userName) {
        User account = new User();
        account.setName(userName);
        account.setPassword(userName + "!@#");
        account.setEmail(userName + "@naver.com");
        return account;
    }

    public String findUsernameByEmail(String email) {
        return "franc";
    }

    public void createNewAccount(User user) {

    }

    public void updateAccount(User user) {

    }

}

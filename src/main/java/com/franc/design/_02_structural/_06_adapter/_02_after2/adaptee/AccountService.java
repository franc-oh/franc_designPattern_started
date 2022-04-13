package com.franc.design._02_structural._06_adapter._02_after2.adaptee;

import com.franc.design._02_structural._06_adapter._02_after2.target.UserDetails;
import com.franc.design._02_structural._06_adapter._02_after2.target.UserDetailsService;

public class AccountService implements UserDetailsService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username+"_pwd");
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}

package com.franc.design._02_structural._06_adapter._02_after2.adaptee;

import com.franc.design._02_structural._06_adapter._02_after2.target.UserDetails;

public class Account implements UserDetails {

    private String name;

    private String password;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }

}

package com.franc.design.creational.builder;

public class UserBuilder {
    private String name;
    private String phone;
    private String email;
    private int age;

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public User build() {
        return new User(name, phone, email, age);
    }
}

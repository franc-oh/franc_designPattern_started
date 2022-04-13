package com.franc.design._01_creational._04_builder;

public class User {

    private final String name;
    private final String phone;
    private final String email;
    private final int age;

    public User(String name, String phone, String email, int age) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.franc.design.creational.builder;

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

package com.franc.design.creational.builder;

public class Client {

    public static void main(String[] args) {

        User u = new UserBuilder().name("kdhong").email("112@naver.com").build();

        System.out.println(u.toString());

    }

}

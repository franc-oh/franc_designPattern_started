package com.franc.design._01_creational._02_factoryMethod._02_after;

public class Grandeur extends HyundaiCar {

    private static final String MODEL = "그랜저";

    public Grandeur(String color, String grade) {
        setModel(MODEL);
        setColor(color);
        setGrade(grade);
    }
}

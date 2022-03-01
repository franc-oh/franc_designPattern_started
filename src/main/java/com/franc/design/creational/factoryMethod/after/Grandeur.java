package com.franc.design.creational.factoryMethod.after;

public class Grandeur extends HyundaiCar {

    private static final String MODEL = "그랜저";

    public Grandeur(String color, String grade) {
        setModel(MODEL);
        setColor(color);
        setGrade(grade);
    }
}

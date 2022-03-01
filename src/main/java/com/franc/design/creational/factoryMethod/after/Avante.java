package com.franc.design.creational.factoryMethod.after;

public class Avante extends HyundaiCar {

    private static final String MODEL = "아반떼";

    public Avante(String color, String grade) {
        setModel(MODEL);
        setColor(color);
        setGrade(grade);
    }
}

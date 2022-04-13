package com.franc.design._01_creational._02_factoryMethod._02_after;

public class Avante extends HyundaiCar {

    private static final String MODEL = "아반떼";

    public Avante(String color, String grade) {
        setModel(MODEL);
        setColor(color);
        setGrade(grade);
    }
}

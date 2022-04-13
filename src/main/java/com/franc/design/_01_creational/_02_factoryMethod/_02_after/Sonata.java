package com.franc.design._01_creational._02_factoryMethod._02_after;

public class Sonata extends HyundaiCar {

    private static final String MODEL = "소나타";

    public Sonata(String color, String grade) {
        setModel(MODEL);
        setColor(color);
        setGrade(grade);
    }
}

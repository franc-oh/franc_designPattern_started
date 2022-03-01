package com.franc.design.creational.factoryMethod.after;

public class Sonata extends HyundaiCar {

    private static final String MODEL = "소나타";

    public Sonata(String color, String grade) {
        setModel(MODEL);
        setColor(color);
        setGrade(grade);
    }
}

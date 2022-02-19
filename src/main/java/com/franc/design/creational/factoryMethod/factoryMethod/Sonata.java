package com.franc.design.creational.factoryMethod.factoryMethod;

public class Sonata extends HyundaiCar {

    private String model = "소나타";

    public Sonata(String color, String grade) {
        setModel(model);
        setColor(color);
        setGrade(grade);
    }
}

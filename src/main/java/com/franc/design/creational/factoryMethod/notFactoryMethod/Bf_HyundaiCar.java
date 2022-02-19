package com.franc.design.creational.factoryMethod.notFactoryMethod;

public class Bf_HyundaiCar {

    private String model;   // 차종
    private String color;   // 색상
    private String grade;   // 트림
    private int price;      // 가격


    public Bf_HyundaiCar(String model, String color, String grade, int price) {
        this.model = model;
        this.color = color;
        this.grade = grade;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HyundaiCar{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", grade='" + grade + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

package com.franc.design._01_creational._02_factoryMethod._02_after;

public class HyundaiCar {

    private String model;   // 차량 모델
    private String color;   // 색상
    private String grade;   // 트림
    private int price;     // 가격


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
                ", price=" + price +
                '}';
    }
}

package com.franc.design.creational.factoryMethod.factoryMethod;

import java.util.Arrays;

public class AvanteCarFactory implements HyundaiCarFactory{

    private static final int MODEL_PRICE_AVANTE = 18000000; // 기본 차량가격

    private static final String[] BASIC_COLOR = {"WHITE", "BLACK", "GREY"}; // 기본 색림
    private static final int COLOR_PRICE_AVANTE = 2000000; // 색상 추가금

    // 트림별 추가금
    private static final int GRADE_PRICE_AVANTE_SMART = 0;
    private static final int GRADE_PRICE_AVANTE_MODERN = 1200000;
    private static final int GRADE_PRICE_AVANTE_NOBLE = 2400000;

    private Avante car;


    @Override
    public Avante getCar(String color, String grade) {
        car = new Avante(color, grade);
        return car;
    }

    @Override
    public int getBasePrice() {
        return MODEL_PRICE_AVANTE;
    }

    @Override
    public int getColorPrice() {
        int colorPrice = 0;

        // 선택한 색상이 기본색상이 아니면 추가금 발생
        if(Arrays.stream(BASIC_COLOR)
                .filter(e -> e.equals(car.getColor()))
                .count() == 0) {

            colorPrice = COLOR_PRICE_AVANTE;
            System.out.println("색상 추가금 발생!! - " + colorPrice);
        }

        return colorPrice;
    }

    @Override
    public int getGradePrice() {
        int trimPrice = 0;
        switch (car.getGrade()) {
            case "SMART" : trimPrice = GRADE_PRICE_AVANTE_SMART; break;
            case "MODERN" : trimPrice = GRADE_PRICE_AVANTE_MODERN; break;
            case "NOBLE" : trimPrice = GRADE_PRICE_AVANTE_NOBLE; break;
        }

        if (trimPrice > 0) System.out.println("트림 추가금 발생!! - " + trimPrice);

        return trimPrice;
    }
}

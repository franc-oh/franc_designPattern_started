package com.franc.design.creational.factoryMethod.after;


import java.util.Arrays;

/**
 * 소나타공장 - 팩토리 메소드_클라이언트 클래스
 */
public class SonataCarFactory implements HyundaiCarFactory {

    private static final int BASE_PRICE = 24000000;
    private static final String[] BASE_COLOR = {"WHITE", "BLACK", "GREY", "SILVER"};
    private static final int COLOR_PRICE = 2000000;
    private static final int GRADE_PRICE_SMART = 0;
    private static final int GRADE_PRICE_MODERN = 3000000;
    private static final int GRADE_PRICE_NOBLE = 5000000;

    private Sonata car;

    @Override
    public HyundaiCar createCar(String color, String grade) {
        car = new Sonata(color, grade);
        return car;
    }

    @Override
    public int calcPrice(String color, String grade) {
        int price = BASE_PRICE; // 차량 모델에 따른 기본 값 책정

        // 선택한 색상이 기본으로 제공하는 색상이 아니면 추가금 부여
        long baseColorCnt = Arrays.stream(BASE_COLOR).filter(e -> e.equals(color)).count();
        if(baseColorCnt <= 0) {
            price += COLOR_PRICE;
        }

        // 트림에 따른 추가금 계산
        switch (grade) {
            case "SMART" : price += GRADE_PRICE_SMART; break;
            case "MODERN" : price += GRADE_PRICE_MODERN; break;
            case "NOBLE" : price += GRADE_PRICE_NOBLE; break;
        }

        return price;
    }
}

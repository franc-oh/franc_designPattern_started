package com.franc.design._01_creational._02_factoryMethod._01_before;


import java.util.Arrays;

/**
 * 현대차공장 - 구체적인 클래스
 */
public class HyundaiCarFactory_Bf {

    /*
        차량주문 - 고객이 원하는 모델/색상/등급을 받아 차량가격을 산출하여 출고한다.
     */
    public HyundaiCar_Bf orderCar(String model, String color, String grade) {

        HyundaiCar_Bf orderCar = createCar(model, color, grade); // 자동차 생산
        int price = calcPrice(model, color, grade); // 차량가격 산출
        orderCar.setPrice(price);

        return orderCar;
    }

    /*
        자동차 생산
     */
    public HyundaiCar_Bf createCar(String model, String color, String grade) {
        HyundaiCar_Bf car = new HyundaiCar_Bf();
        car.setModel(model);
        car.setColor(color);
        car.setGrade(grade);

        return car;
    }

    /*
        차량 가격 산출
     */
    public int calcPrice(String model, String color, String grade) {
        int price = 0;

        // 차량 모델에 따른 기본 값 책정
        switch (model) {
            case "아반떼":
                price = 18000000;
                break;
            case "소나타":
                price = 24000000;
                break;
            case "그랜져":
                price = 32000000;
                break;
        }

        // 차량별 기본으로 제공하는 색상
        String[] baseColorAvante = {"WHITE", "BLACK", "GREY"};
        String[] baseColorSonata = {"WHITE", "BLACK", "GREY", "SILVER"};
        String[] baseColorGrandeur = {"WHITE", "BLACK", "GREY", "SILVER", "NAVY"};

        String[] baseColor = null;
        switch (model) {
            case "아반떼":
                baseColor = baseColorAvante;
                break;
            case "소나타":
                baseColor = baseColorSonata;
                break;
            case "그랜져":
                baseColor = baseColorGrandeur;
                break;
        }

        // 선택한 색상이 기본으로 제공하는 색상이 아니면 추가금 부여
        long baseColorCnt = Arrays.stream(baseColor).filter(e -> e.equals(color)).count();
        if(baseColorCnt <= 0) {
            price += 2000000;
        }

        // 트림에 따른 추가금 계산
        if ("아반떼".equals(model)) {
            switch (grade) {
                case "SMART" : price += 0; break;
                case "MODERN" : price += 2000000; break;
                case "NOBLE" : price += 4000000; break;
            }
        } else if ("소나타".equals(model)) {
            switch (grade) {
                case "SMART" : price += 0; break;
                case "MODERN" : price += 3000000; break;
                case "NOBLE" : price += 5000000; break;
            }
        } else if ("그랜저".equals(model)) {
            switch (grade) {
                case "SMART" : price += 0; break;
                case "MODERN" : price += 4000000; break;
                case "NOBLE" : price += 6000000; break;
            }
        }

        return price;
    }

}

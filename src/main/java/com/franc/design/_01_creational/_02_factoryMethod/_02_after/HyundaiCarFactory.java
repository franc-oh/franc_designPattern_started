package com.franc.design._01_creational._02_factoryMethod._02_after;

/**
 * 현대차공장 - 팩토리 메소드_슈퍼클래스
 */
public interface HyundaiCarFactory {

    /*
        차량주문(팩토리 메소드) - 고객이 원하는 색상/등급을 받아 차량가격을 산출하여 출고한다.
     */
    default HyundaiCar orderCar(String color, String grade) {
        HyundaiCar orderCar = createCar(color, grade); // 자동차 생산
        int price = calcPrice(color, grade); // 차량가격 산출
        orderCar.setPrice(price);

        return orderCar;

    }

    /*
        자동차 생산
     */
    public HyundaiCar createCar(String color, String grade);

    /*
        가격 산출
     */
    public int calcPrice(String color, String grade);

}

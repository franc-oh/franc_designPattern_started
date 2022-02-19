package com.franc.design.creational.factoryMethod.factoryMethod;


public interface HyundaiCarFactory {

    /**
     * 차량주문
     */
    default HyundaiCar orderCar(String color, String grade) {
        HyundaiCar car = getCar(color, grade);
        String model = car.getModel();

        accept(model, color, grade); // 주문확인 알림

        // 견적 계산
        int price = calcPrice();
        car.setPrice(price);

        complate(model, color, grade, price); // 생산완료 알림

        return car;
    }

    /**
     * 주문확인 알림
     */
    default void accept(String model, String color, String grade) {
        System.out.println("주문확인 [ 차종-"+model+" 색상-"+color+" 트림-"+grade+" ]");
    }

    /**
     * 생산완료  알림
     */
    default void complate(String model, String color, String grade, int price) {
        System.out.println(model + " 생산완료 됐습니다. [가격:"+price+"원]");
    }

    /**
     * 차 가격 계산 (차량 기본 값 + 색상 추가금 + 트림 추가금)
     */
    default int calcPrice() {
        int price = getBasePrice()
                + getColorPrice() + getGradePrice();

        return price;
    };

    /**
     * 차 인스턴스 빌드
     */
    HyundaiCar getCar(String color, String grade);

    /**
     * 차 가격 계산 - 기본가격 가져오기
     */
    int getBasePrice();

    /**
     * 차 가격 계산 - 색상 추가금 계산하기
     */
    int getColorPrice();

    /**
     * 차 가격 계산 - 트림 추가금 계산하기
     */
    int getGradePrice();



}

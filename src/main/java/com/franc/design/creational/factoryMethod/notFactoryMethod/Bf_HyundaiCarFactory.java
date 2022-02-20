package com.franc.design.creational.factoryMethod.notFactoryMethod;


import java.util.Arrays;

/**
 * 현대 차 공장
 */
public class Bf_HyundaiCarFactory {
    // 차량별 기본 값
    private static final int MODEL_PRICE_AVANTE = 18000000;
    private static final int MODEL_PRICE_SONATA = 24000000;
    private static final int MODEL_PRICE_GRANDEUL = 32000000;

    // 차량별 기본색상
    private static final String[] BASIC_COLOR_AVANTE = {"WHITE", "BLACK", "GREY"};
    private static final String[] BASIC_COLOR_SONATA = {"WHITE", "BLACK", "GREY", "BLUE", "RED"};
    private static final String[] BASIC_COLOR_GRANDEUL = {"WHITE", "BLACK", "GREY", "BLUE", "RED", "SILVER", "NAVY"};

    // 차량별 색상 추가금
    private static final int COLOR_PRICE_AVANTE = 2000000;
    private static final int COLOR_PRICE_SONATA = 2000000;
    private static final int COLOR_PRICE_GRANDEUL = 2000000;

    // 차량별 트림 추가금
    private static final int GRADE_PRICE_AVANTE_SMART = 0;
    private static final int GRADE_PRICE_AVANTE_MODERN = 1200000;
    private static final int GRADE_PRICE_AVANTE_NOBLE = 2400000;
    private static final int GRADE_PRICE_SONATA_SMART = 0;
    private static final int GRADE_PRICE_SONATA_MODERN = 2400000;
    private static final int GRADE_PRICE_SONATA_NOBLE = 3200000;
    private static final int GRADE_PRICE_GRANDEUL_SMART = 0;
    private static final int GRADE_PRICE_GRANDEUL_MODERN = 3200000;
    private static final int GRADE_PRICE_GRANDEUL_NOBLE = 4800000;

    /**
     * 차량주문
     */
    public static Bf_HyundaiCar orderCar(String model, String color, String grade) {
        accept(model, color, grade); // 주문확인 알림
        int price = calcPrice(model, color, grade); // 견적 계산
        complate(model, color, grade, price); // 생산완료 알림

        return new Bf_HyundaiCar(model, color, grade, price);
    }

    /**
     * 주문확인 알림
     */
    public static void accept(String model, String color, String grade) {
        System.out.println("주문확인 [ 차종-"+model+" 색상-"+color+" 트림-"+grade+" ]");
    }

    /**
     * 생산완료 알림
     */
    public static void complate(String model, String color, String grade, int price) {
        System.out.println(model + " 생산완료 됐습니다. [가격:"+price+"원]");
    }

    /**
     * 차 가격 계산 (차량 기본 값 + 색상 추가금 + 트림 추가금)
     */
    public static int calcPrice(String model, String color, String grade) {
        int price = getBasePrice(model) + getColorPrice(model, color) + getGradePrice(model, grade);
        return price;
    }

    /**
     * 차 가격 계산 - 기본가격 가져오기
     */
    public static int getBasePrice(String model) {
        int price = 0;
        if ("아반떼".equals(model)) price = MODEL_PRICE_AVANTE;
        else if ("소나타".equals(model)) price = MODEL_PRICE_SONATA;
        else if ("그랜저".equals(model)) price = MODEL_PRICE_GRANDEUL;

        return price;
    }

    /**
     * 차 가격 계산 - 색상 추가금 계산하기
     */
    public static int getColorPrice(String model, String color) {
        String[] carBaseColor = null;
        int colorPrice = 0;

        if ("아반떼".equals(model)) {
            carBaseColor = BASIC_COLOR_AVANTE;
            colorPrice = COLOR_PRICE_AVANTE;

        } else if ("소나타".equals(model)) {
            carBaseColor = BASIC_COLOR_SONATA;
            colorPrice = COLOR_PRICE_SONATA;

        } else if ("그랜저".equals(model)) {
            carBaseColor = BASIC_COLOR_GRANDEUL;
            colorPrice = COLOR_PRICE_GRANDEUL;
        }

        // 선택한 색상이 각 차량에 지정된 기본색상이 아니면 추가금 발생
        if(Arrays.stream(carBaseColor)
                .filter(e -> e.equals(color))
                .count() == 0) {

            System.out.println("색상 추가금 발생!! - " + colorPrice);
            return colorPrice;
        }

        return 0;
    }

    /**
     * 차 가격 계산 - 트림 추가금 계산하기
     */
    public static int getGradePrice(String model, String grade) {
        int trimPrice = 0;

        if ("아반떼".equals(model)) {
            switch (grade) {
                case "SMART" : trimPrice = GRADE_PRICE_AVANTE_SMART; break;
                case "MODERN" : trimPrice = GRADE_PRICE_AVANTE_MODERN; break;
                case "NOBLE" : trimPrice = GRADE_PRICE_AVANTE_NOBLE; break;
            }
        } else if ("소나타".equals(model)) {
            switch (grade) {
                case "SMART" : trimPrice = GRADE_PRICE_SONATA_SMART; break;
                case "MODERN" : trimPrice = GRADE_PRICE_SONATA_MODERN; break;
                case "NOBLE" : trimPrice = GRADE_PRICE_SONATA_NOBLE; break;
            }
        } else if ("그랜저".equals(model)) {
            switch (grade) {
                case "SMART" : trimPrice = GRADE_PRICE_GRANDEUL_SMART; break;
                case "MODERN" : trimPrice = GRADE_PRICE_GRANDEUL_MODERN; break;
                case "NOBLE" : trimPrice = GRADE_PRICE_GRANDEUL_NOBLE; break;
            }
        }

        if (trimPrice > 0) System.out.println("트림 추가금 발생!! - " + trimPrice);

        return trimPrice;
    }

}

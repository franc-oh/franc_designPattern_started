package com.franc.design._02_structural._08_composite._02_after;

/** 포션 (단일객체) */
public class Potion implements Component {

    private String name; // 포션 이름
    private int price;   // 포션 가격

    public Potion(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 포션 가격을 리턴한다.
    @Override
    public int getPrice() {
        return this.price;
    }
}

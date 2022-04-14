package com.franc.design._02_structural._08_composite._01_before;

/** 아이템 (단일객체) */
public class Item {

    private String name; // 아이템 이름
    private int price;   // 아이템 가격

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 아이템의 가격을 리턴한다.
    public int getPrice() {
        return this.price;
    }
}

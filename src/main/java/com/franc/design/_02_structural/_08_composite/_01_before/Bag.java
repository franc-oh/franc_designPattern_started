package com.franc.design._02_structural._08_composite._01_before;

import java.util.ArrayList;
import java.util.List;

/** 아이템을 담는 가방 (복합객체) */
public class Bag {
    private List<Item> items = new ArrayList<>(); // 가방안에 담긴 아이템들

    // 가방에 아이템을 담는다.
    public void addItem(Item item) {
        items.add(item);
    }

    // 가방 내용물의 가격 합을 리턴한다.
    public int getPrice() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }
}

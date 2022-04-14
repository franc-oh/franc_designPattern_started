package com.franc.design._02_structural._08_composite._02_after;

import com.franc.design._02_structural._08_composite._01_before.Item;

import java.util.ArrayList;
import java.util.List;

/** 물건을 담는 가방 (복합객체) */
public class Bag implements Component{
    private List<Component> objects = new ArrayList<>(); // 가방안에 담긴 물건들

    // 가방에 물건을 담는다.
    public void add(Component object) {
        objects.add(object);
    }

    // 가방 내용물의 가격 합을 리턴한다.
    @Override
    public int getPrice() {
        return objects.stream().mapToInt(Component::getPrice).sum();
    }
}

package com.franc.design._02_structural._11_flyweight._02_after;


/** 클라이언트 */
public class Client {
    public static void main(String[] args) {
        // #1. FlyweightFactory
        FontFactory fontFactory = new FontFactory();

        // #2. Flyweight => 자주 변하지 않는 필드에 대해선 캐싱된 데이터를 재사용한다.
        Character c1 = new Character('h', "white", fontFactory.getFont("Nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("Nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("Nanum:12"));
    }
}

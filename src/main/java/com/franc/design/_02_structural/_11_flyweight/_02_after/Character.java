package com.franc.design._02_structural._11_flyweight._02_after;

/** 문자 객체 => flyweight*/
public class Character {
    // 자주 변하는 값은 필드로 두고, 변하지 않는 값들은 캐싱 객체로 분리한다.
    private char value;
    private String color;
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}

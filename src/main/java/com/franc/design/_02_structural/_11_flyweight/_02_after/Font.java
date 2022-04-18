package com.franc.design._02_structural._11_flyweight._02_after;

/** 자주 변하는 필드를 모은 객체 */
public class Font {
    final String family;
    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}

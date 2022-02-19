package com.franc.design.creational.singleton;

/**
 * 이른 초기화
 *  => 사용을 안해도 인스턴스가 생성된다.
 */
public class Settings3 {

    private static final Settings3 INSTANCE = new Settings3();

    private Settings3() {}

    public static Settings3 getInstance() {
        return INSTANCE;
    }
}

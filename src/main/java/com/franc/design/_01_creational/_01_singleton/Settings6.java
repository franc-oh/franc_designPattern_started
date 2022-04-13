package com.franc.design._01_creational._01_singleton;

import java.io.Serializable;

/**
 * Static Inner Class (직렬화/역직렬화 테스트)
 *  => Serializable => 직렬화/역직렬화 가능
 */
public class Settings6 implements Serializable {

    private Settings6() {}

    // static inner class
    private static class SettingsHolder {
        private static final Settings6 INSTANCE = new Settings6();
    }

    public static Settings6 getInstance() {
        return SettingsHolder.INSTANCE; // 해당 시점에 inner class에 접근 >> 인스턴스 생성됨
    }

    // 직렬화/역직렬화 싱글톤 깨기 방지
    /*
    protected Object readResolve() {
        return getInstance();
    }
     */
}

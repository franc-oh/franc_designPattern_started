package com.franc.design.creational.singleton;

/**
 * Static Inner Class
 *  => 리플렉션, 직렬화/역직렬화 시 싱글톤이 깨진다.
 */
public class Settings5 {

    private Settings5() {}

    // static inner class
    private static class SettingsHolder {
        private static final Settings5 INSTANCE = new Settings5();
    }

    public static Settings5 getInstance() {
        return SettingsHolder.INSTANCE; // 해당 시점에 inner class에 접근 >> 인스턴스 생성됨
    }
}

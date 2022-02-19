package com.franc.design.creational.singleton;

/**
 * Synchronized
 *  => 멀티쓰레드에서 안전하지 않다.
 */
public class Settings2 {

    private static Settings2 instance;

    private Settings2() {}

    public static synchronized Settings2 getInstance() {
        if(instance == null)
            instance = new Settings2();

        return instance;
    }
}

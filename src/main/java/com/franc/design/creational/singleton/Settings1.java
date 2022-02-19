package com.franc.design.creational.singleton;

/**
 * private 생성자 + public static 메소드
 *  => 멀티쓰레드에서 안전하지 않다.
 */
public class Settings1 {

    private static Settings1 instance;

    private Settings1() {}

    public static Settings1 getInstance() {
        if(instance == null)
            instance = new Settings1();

        return instance;
    }
}

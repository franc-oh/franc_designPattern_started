package com.franc.design.creational.singleton;

/**
 * Double Checked Locking
 *  => 복잡하다.
 *  => 1.5 이상에서만 사용가능
 */
public class Settings4 {

    private static volatile Settings4 instance; // volatile => 1.5이상만 사용 가능

    private Settings4() {}

    public static Settings4 getInstance() {

        // 1. 인스턴스가 있는지 체크 => 매번 락을 체크하지 않는다.
        if(instance == null) {
            // 2. 없으면 동기화블럭안에서 한번 더 체크 후 인스턴스 생성 => 사용 시점에 인스턴스 생성
            synchronized (Settings4.class) {
                if(instance == null) {
                    instance = new Settings4();
                }
            }
        }

        return instance;
    }
}

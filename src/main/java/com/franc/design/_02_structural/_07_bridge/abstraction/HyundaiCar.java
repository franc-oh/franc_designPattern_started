package com.franc.design._02_structural._07_bridge.abstraction;

import com.franc.design._02_structural._07_bridge.Implementation.MediaPlayer;

public class HyundaiCar implements Car {

    MediaPlayer player; // Implementation을 연결
    String carName; // Refined Abstraction의 하위클래스의 모델명을 받는다.

    public HyundaiCar(MediaPlayer player, String carName) {
        this.player = player;
        this.carName = carName;
    }

    @Override
    public void powerOn() {
        System.out.printf("Hello %s ~ \n", this.carName);
    }

    @Override
    public void mediaOn() {
        System.out.printf("%s On!! \n", player.getName());
    }

    @Override
    public void mediaOff() {
        System.out.printf("%s Off!! \n", player.getName());
    }
}

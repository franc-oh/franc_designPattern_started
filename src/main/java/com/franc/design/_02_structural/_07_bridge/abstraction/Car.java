package com.franc.design._02_structural._07_bridge.abstraction;

public interface Car {
    void powerOn(); // 시동을 켠다. - 자동차의 고유기능
    void mediaOn(); // 미디어를 켠다 - 멀티미디어 기능
    void mediaOff(); // 미디어를 끈다 - 멀티미디어 기능
}

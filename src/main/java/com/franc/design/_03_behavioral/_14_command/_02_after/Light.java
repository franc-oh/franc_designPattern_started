package com.franc.design._03_behavioral._14_command._02_after;


/** Receiver (조명)
 * - 실제 요청을 받는 수신자
 **/
public class Light {
    private boolean isOn;

    public void on() {
        System.out.println("불을 켭니다.");
        this.isOn = true;
    }

    public void off() {
        System.out.println("불을 끕니다.");
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
}


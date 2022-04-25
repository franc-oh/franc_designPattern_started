package com.franc.design._03_behavioral._14_command._02_after;

/** Receiver (게임)
 * - 실제 요청을 받는 수신자
 **/
public class Game {
    private boolean isStarted;

    public void start() {
        System.out.println("게임을 시작합니다.");
        this.isStarted = true;
    }

    public void end() {
        System.out.println("게임을 종료합니다.");
        this.isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }
}

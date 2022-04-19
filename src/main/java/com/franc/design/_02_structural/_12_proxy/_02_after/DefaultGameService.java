package com.franc.design._02_structural._12_proxy._02_after;

/**  게임 서비스 => RealSubject */
public class DefaultGameService implements GameService {
    @Override
    public void gameStart() {
        System.out.println("Game Start !!!");
    }
}

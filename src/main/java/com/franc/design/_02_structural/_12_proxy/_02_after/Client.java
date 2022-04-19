package com.franc.design._02_structural._12_proxy._02_after;

/** 클라이언트 */
public class Client {
    public static void main(String[] args) {
        GameService oldGameService = new DefaultGameService();
        oldGameService.gameStart();

        GameService gameService = new GameServiceProxy();
        gameService.gameStart();
    }
}

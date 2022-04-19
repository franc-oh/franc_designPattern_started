package com.franc.design._02_structural._12_proxy._01_before;

/** 클라이언트 */
public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.gameStart();
    }
}

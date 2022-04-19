package com.franc.design._02_structural._12_proxy._02_after;

/** 게임 서비스 프록시 => Proxy */
public class GameServiceProxy implements GameService {

    // Subject 필드 (프록시 객체 생성 시, RealSubject를 사용하기 위함이다.)
    private GameService gameService;

    @Override
    public void gameStart() {

        // #1. 게임 시작 전 작업 실행
        if(gameService == null)
            gameService = new DefaultGameService();
        System.out.println("========== Init !!! =========");

        // #2. 게임 시작
        gameService.gameStart();

        // #3. 게임 시작 후 작업 실행
        System.out.println("========== Save !!! =========");
    }
}

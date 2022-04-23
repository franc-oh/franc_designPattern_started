package com.franc.design._03_behavioral._13_chain_of_responsibilities._01_before;

/** 클라이언트 */
public class Client {
    public static void main(String[] args) {
        // #1. 수신부와 처리부를 분리하지 않고 수신부에서 모두 처리할 경우
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.handler(request); // => 무궁화 꽃이 피었습니다.

        // ~~ 만약 요청처리 전 로깅이나 인증처리를 해야한다면?? => 수신부를 매번 수정해야 한다.


        // #2. 그래서 수신부와 처리부를 분리했다.
        RequestHandler requestHandler2 = new LoggingRequestHandler(); // 로깅
        requestHandler2.handler(request);

        // ~~ 로깅과 인증을 둘다 처리해야한다면?? 클라이언트가 처리부의 타입을 모두 알아야되나??
    }
}

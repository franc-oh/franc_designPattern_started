package com.franc.design._03_behavioral._13_chain_of_responsibilities._02_after;

/** [책임연쇄 패턴] - 클라이언트 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");

        // #1. 수신부에 요청 => 요청 시 일어나야 할 책임들을 체이닝한다.
        RequestHandler requestHandler = new LoggingRequestHandler(
                new AuthRequestHandler(
                        new PrintRequestHandler(null))
        );

        // #2. 요청에 대한 처리 실행 => 로깅 > 인증 > 출력 순으로 책임들을 연쇄적으로 실행한다.
        requestHandler.handle(request);
    }
}

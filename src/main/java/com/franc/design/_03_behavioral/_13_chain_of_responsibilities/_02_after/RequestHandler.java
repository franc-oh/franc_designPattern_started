package com.franc.design._03_behavioral._13_chain_of_responsibilities._02_after;

/** [책임연쇄 패턴] - 요청 수신부(Handler) */

// #1. 필드 사용을 위해 인터페이스보단 추상클래스로 추상화
public abstract class RequestHandler {

    private RequestHandler nextHandler; // #2. 필드 : 체이닝 될 다음 처리부

    // #3. 위임할 핸들러를 필드에 담는다.
    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // #4. 다음 핸들러에 위임
    public void handle(Request request) {
        if (nextHandler != null) { // 위임 할 핸들러가 없을 때 까지 위임
            nextHandler.handle(request);
        }
    }
}

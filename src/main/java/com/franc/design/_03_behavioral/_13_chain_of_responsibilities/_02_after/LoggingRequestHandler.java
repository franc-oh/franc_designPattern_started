package com.franc.design._03_behavioral._13_chain_of_responsibilities._02_after;

/** [책임연쇄패턴]  Concrete Handler - 로깅 */
public class LoggingRequestHandler extends RequestHandler {

    // #1. 위임 할 핸들러를 받아 필드에 담는다.
    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅"); // #2. 책임에 대한 처리
        super.handle(request); // #3. 다음 핸들러 처리
    }
}

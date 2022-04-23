package com.franc.design._03_behavioral._13_chain_of_responsibilities._01_before;

/** 단순 상속을 통해 분리된 처리부 - 로깅 */
public class LoggingRequestHandler extends RequestHandler {
    @Override
    public void handler(Request request) {
        System.out.println("로깅");
        super.handler(request);
    }
}

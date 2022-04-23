package com.franc.design._03_behavioral._13_chain_of_responsibilities._01_before;

/** 단순 상속을 통해 분리된 처리부 - 인증 */
public class AuthRequestHandler extends RequestHandler {
    @Override
    public void handler(Request request) {
        System.out.println("인증완료");
        super.handler(request);
    }
}

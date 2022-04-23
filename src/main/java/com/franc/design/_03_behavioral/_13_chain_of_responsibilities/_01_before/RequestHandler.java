package com.franc.design._03_behavioral._13_chain_of_responsibilities._01_before;

/** 요청 수신부 */
public class RequestHandler {
    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}

package com.franc.design._03_behavioral._13_chain_of_responsibilities._02_after;

/** [책임연쇄 패턴] - 요청수신 객체 */
public class Request {

    private String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

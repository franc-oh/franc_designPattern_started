package com.franc.design._03_behavioral._14_command._02_after;

/** Command - 구체적인 요청들을 추상화, 요청자가 요청을 보내는 수단 */
public interface Command {

    void execute(); // 요청에 대한 처리
}

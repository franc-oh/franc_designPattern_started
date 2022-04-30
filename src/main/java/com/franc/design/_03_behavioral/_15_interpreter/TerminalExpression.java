package com.franc.design._03_behavioral._15_interpreter;

/** [TerminalExpression] - Compression을 이루는 노드 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    // 노드 단위에서의 계산
    @Override
    public boolean interpreter(String context) {
        // 'context'에 'data'가 포함 됐는 지 여부를 계산
        if(context.contains(data))
            return true;

        return false;
    }
}

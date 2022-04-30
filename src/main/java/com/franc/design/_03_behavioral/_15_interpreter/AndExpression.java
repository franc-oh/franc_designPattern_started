package com.franc.design._03_behavioral._15_interpreter;

/** [NonTerminalExpression] - 다른 Expression들의 정보를 연산 */
public class AndExpression implements Expression{
    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    // 노드들을 가지고 연산
    @Override
    public boolean interpreter(String context) {
        return expression1.interpreter(context) && expression2.interpreter(context);
    }
}

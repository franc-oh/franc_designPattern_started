package com.franc.design._03_behavioral._15_interpreter;

public class Client {

    public static void main(String[] args) {
        // #1. 노드 셋팅
        Expression arg1 = new TerminalExpression("MAX");
        Expression arg2 = new TerminalExpression("JAMES");

        // #2. orExpression > arg1, arg2
        Expression orExpression = new OrExpression(arg1, arg2);
        System.out.println("OrExpression : " + orExpression.interpreter("name MAX, HAM"));
        System.out.println("OrExpression : " + orExpression.interpreter("name HAM, JAMES"));

        // #3. andExpression > arg1, arg2
        Expression andExpression = new AndExpression(arg1, arg2);
        System.out.println("AndExpression : " + andExpression.interpreter("name MAX, HAM"));
        System.out.println("AndExpression : " + andExpression.interpreter("name JAMES, MAX"));

        // #4. orExpression2 > orExpression, andExpression
        Expression orExpression2 = new OrExpression(orExpression, andExpression);
        System.out.println("OrExpression2 : " + orExpression2.interpreter("name MAX, HAM"));

        // #5. andExpression2 > orExpression2, arg2
        Expression andExpression2 = new AndExpression(orExpression2, arg2);
        System.out.println("AndExpression2 : " + andExpression2.interpreter("name MAX, HAM"));
        System.out.println("AndExpression2 : " + andExpression2.interpreter("name JAMES, MAX"));
    }
}

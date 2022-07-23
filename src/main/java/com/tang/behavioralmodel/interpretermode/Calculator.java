package com.tang.behavioralmodel.interpretermode;

import java.util.Stack;

/**
 * @author weepppp 2022/7/18 8:14
 **/
// 计算器类
public class Calculator {
    private AbstractExpression expression;

    public void parse(String expression) {
        String[] expressionArray = expression.split("");
        Stack<AbstractExpression> stack = new Stack<>();
        for (int i = 0; i < expressionArray.length; i++) {
            if ("+".equals(expressionArray[i])) {
                AbstractExpression left = stack.pop();
                AbstractExpression right = new ValueExpression(Integer.parseInt(expressionArray[++i]));
                stack.push(new AddExpression(left,right));
            } else if ("-".equals(expressionArray[i])) {
                AbstractExpression left = stack.pop();
                AbstractExpression right = new ValueExpression(Integer.parseInt(expressionArray[++i]));
                stack.push(new SubtractionExpression(left,right));
            } else {
                stack.push(new ValueExpression(Integer.parseInt(expressionArray[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int calculate() {
        return expression.interpret();
    }
}

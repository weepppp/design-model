package com.tang.behavioralmodel.interpretermode;

/**
 * @author weepppp 2022/7/18 8:11
 **/
public class AddExpression extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public AddExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}

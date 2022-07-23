package com.tang.behavioralmodel.interpretermode;

/**
 * @author weepppp 2022/7/18 8:13
 **/
public class SubtractionExpression extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public SubtractionExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
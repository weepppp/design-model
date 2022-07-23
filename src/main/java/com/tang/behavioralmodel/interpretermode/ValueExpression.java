package com.tang.behavioralmodel.interpretermode;

/**
 * @author weepppp 2022/7/18 8:09
 **/
public class ValueExpression extends AbstractExpression {

    private int value;

    public ValueExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}

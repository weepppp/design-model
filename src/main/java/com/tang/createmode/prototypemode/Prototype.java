package com.tang.createmode.prototypemode;

/**
 * @author weepppp 2022/7/12 8:12
 **/
public class Prototype implements Cloneable {

    // 声明一个克隆自身的接口
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

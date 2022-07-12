package com.tang.createmode.prototypemode;

/**
 * @author weepppp 2022/7/12 8:14
 **/
public class ConcretePrototype extends Prototype {

    //实现一个克隆自身的操作
    public ConcretePrototype(String name) {
        setName(name);
    }
}

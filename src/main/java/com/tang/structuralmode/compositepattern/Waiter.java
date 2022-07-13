package com.tang.structuralmode.compositepattern;

/**
 * @author weepppp 2022/7/13 8:11
 **/
public class Waiter extends Employees {

    // 叶子节点，一组相似对象中的一个

    public Waiter(String name) {
        super(name);
    }

    void work() {
        System.out.println("我是"+name+":开始工作");
    }
}

package com.tang.structuralmode.compositepattern;

/**
 * @author weepppp 2022/7/13 8:10
 **/
public class Cook extends Employees {

    // 叶子节点，一组相似对象中的一个

    public Cook(String name) {
        super(name);
    }

    void work() {
        System.out.println("我是"+name+":开始工作");
    }



}

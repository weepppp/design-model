package com.tang.structuralmode.compositepattern;

/**
 * @author weepppp 2022/7/13 8:01
 **/
public abstract class Employees {

    // 根节点，基类方法

    protected String name;

    public Employees(String name) {
        this.name = name;
    }

    public void addEmployees(Employees employees){

    }

    abstract void work();

}

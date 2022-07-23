package com.tang.structuralmode.appearancemode;

/**
 * @author weepppp 2022/7/13 22:42
 **/
public class Facade {
    ServiceA sa;
    ServiceC sc;
    ServiceB sb;

    public Facade() {
        sa = new ServiceImplA();
        sb = new ServiceImplB();
        sc = new ServiceImplC();
    }

    // 自定义拿取任何实现类的任何功能

    public void methodA() {
        sa.methodA();
        sb.methodB();
    }

    public void methodC() {
        sc.methodC();
        sa.methodA();
        sb.methodB();
    }
}

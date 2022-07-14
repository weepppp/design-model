package com.tang.structuralmode.proxypattern;

/**
 * @author weepppp 2022/7/14 20:22
 **/
public class RealSubject implements Object{

    public void action() {
        System.out.println("这是被代理的功能");
    }
}

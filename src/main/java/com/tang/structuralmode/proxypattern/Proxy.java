package com.tang.structuralmode.proxypattern;

/**
 * @author weepppp 2022/7/14 20:44
 **/

// 代理类要实现被代理类的功能
public class Proxy implements Object {

    Object realSubject;

    public Proxy() {
        realSubject = new RealSubject();
    }

    public void action() {
        System.out.println("代理开始");
        realSubject.action();
        System.out.println("代理结束");
    }
}

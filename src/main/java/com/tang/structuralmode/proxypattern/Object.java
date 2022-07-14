package com.tang.structuralmode.proxypattern;

/**
 * @author weepppp 2022/7/14 20:22
 **/

// 定义RealSubject和Proxy的共用接口，这样就在任何使用RealSubject的地方都可以使用Proxy。
public interface Object {
    void action();
}

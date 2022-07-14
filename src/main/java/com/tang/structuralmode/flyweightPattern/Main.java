package com.tang.structuralmode.flyweightPattern;

/**
 * @author weepppp 2022/7/14 8:22
 **/

/**
 * @功能: 享元模式
 * @概念： 运用共享技术有效地支持大量细粒度的对象。
 * @使用场景： 1、系统有大量相似对象。 2、需要缓冲池的场景。
 */
public class Main {
    public static void main(String[] args) {
        Flyweight a1 = FlyweightFactory.getFlyweight("a");
        Flyweight a2 = FlyweightFactory.getFlyweight("a");
        System.out.println(a1 == a2);
        Flyweight b1 = FlyweightFactory.getFlyweight("b");
        System.out.println(FlyweightFactory.getSize());
    }

}

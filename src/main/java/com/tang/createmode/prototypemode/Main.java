package com.tang.createmode.prototypemode;

/**
 * @author weepppp 2022/7/12 8:11
 **/

/**
 * @功能: 原型模式
 * @概念： 用已经创建的实例对象作为原型，通过复制对象来创建一个和原型相同的对象或相似的新对象
 */
public class Main {

    // 让一个原型克隆自身从而创建一个新的对象。
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new ConcretePrototype("prototype");
        Prototype clonePrototype = (Prototype) prototype.clone();
        System.out.println(prototype.getName());
        System.out.println(clonePrototype.getName());
    }

}

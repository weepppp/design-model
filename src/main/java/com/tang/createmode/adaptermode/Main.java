package com.tang.createmode.adaptermode;

/**
 * @author weepppp 2022/7/12 8:26
 **/

/**
 * @功能: 适配器模式
 * @概念： 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * @功能： 你想使用一个已经存在的类，而它的接口不符合你的需求。
 */
public class Main {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();
        target.adapterMethod();
    }
}

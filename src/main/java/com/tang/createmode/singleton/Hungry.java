package com.tang.createmode.singleton;

/**
 * @author weepppp 2022/7/11 13:53
 **/

/**
 * 单例模式:
 * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 */

/**
 * @功能： 饿汉式：设置成静态资源，在类加载时就将这个对象创建出来以备不时之需
 */
public class Hungry {
    private static Hungry hungry = new Hungry();

    public static Hungry getHungry(){
        return hungry;
    }
}

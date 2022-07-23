package com.tang.createmode.singleton;

/**
 * @author weepppp 2022/7/11 14:01
 **/


/**
 * @功能: 懒汉式等到真正要使用这个单例类的时候才去实例化它
 */
public class Lazy {

    private static Lazy lazy = null;

    public Lazy() {
    }

    public static Lazy getLazy(){
        if (lazy == null) {
            lazy =  new Lazy();
        }
        return lazy;
    }

}

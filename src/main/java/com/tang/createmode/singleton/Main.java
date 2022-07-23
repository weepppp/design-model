package com.tang.createmode.singleton;

/**
 * @author weepppp 2022/7/22 8:21
 * 测试单例模式
 **/
public class Main {
    public static void main(String[] args) {
        Lazy lazy = Lazy.getLazy();
        Lazy lazy1 = Lazy.getLazy();
        System.out.println(lazy==lazy1);
    }
}

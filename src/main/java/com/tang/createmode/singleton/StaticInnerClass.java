package com.tang.createmode.singleton;

/**
 * @author weepppp 2022/7/11 16:45
 **/

/**
 * @功能 静态内部类实现
 * 外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存,只有当getInstance()方法第一次被调用时，才会去初始化INSTANCE
 */
public class StaticInnerClass {

    public StaticInnerClass() {
    }

    private static class InnerClass{
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance(){
        return InnerClass.INSTANCE;
    }
}

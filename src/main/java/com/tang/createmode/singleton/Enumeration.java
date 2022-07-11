package com.tang.createmode.singleton;

/**
 * @author weepppp 2022/7/11 18:48
 **/

/**
 * @功能 枚举类
 * 不会被“修改反射机制”“序列化反序列化”破坏单例模式
 */
public enum  Enumeration {

    INSTANCE;

    public static Enumeration getInstance(){
        return INSTANCE;
    }
    
}

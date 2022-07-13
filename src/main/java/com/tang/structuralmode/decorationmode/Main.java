package com.tang.structuralmode.decorationmode;

/**
 * @author weepppp 2022/7/13 8:46
 **/

/**
 * @功能: 装饰模式
 * 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。就增加功能来说，装饰模式比生成子类更为灵活。
 */
public class Main {

    public static void main(String[] args) {
        YangGuo yangGuo = new YangGuo();
        HongQiGong hongQiGong = new HongQiGong(yangGuo);
        hongQiGong.attackMagic();
    }
}

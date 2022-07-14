package com.tang.structuralmode.decorationmode;

/**
 * @author weepppp 2022/7/13 8:46
 **/

/**
 * @功能: 装饰模式
 * 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。就增加功能来说，装饰模式比生成子类更为灵活。
 *
 * 本例子：在{徒弟群}Swordsman，有个徒弟叫{杨过}YangGuo，{杨过}本来就会剑法
 * 有一个{师父制造群}Master，里面要注入{徒弟群}的某个徒弟，师傅制造机制造了一个师傅{洪七公}HongQiGong，{洪七公}自带教{打狗棒法}的天赋点
 * 杨过到洪七公那里学习了这个天赋
 */
public class Main {

    public static void main(String[] args) {
        YangGuo yangGuo = new YangGuo();
        HongQiGong hongQiGong = new HongQiGong(yangGuo);
        hongQiGong.attackMagic();
    }
}

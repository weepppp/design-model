package com.tang.structuralmode.decorationmode;

/**
 * @author weepppp 2022/7/13 8:55
 **/
public class HongQiGong extends Master {

    // 装饰者具体实现类：
    // 洪七公，负责向杨过传授新的武功
    public HongQiGong(Swordsman swordsman) {
        super(swordsman);
    }

    public void teachAttackMagic(){
        System.out.println("洪七公教杨过打狗棒法");
    }

    @Override
    public void attackMagic() {
        super.attackMagic(); // 实现组件具体实现类本身就有的功能
        teachAttackMagic(); // 实现额外的装饰功能

    }
}

package com.tang.structuralmode.decorationmode;

/**
 * @author weepppp 2022/7/13 8:51
 **/
public abstract class Master extends Swordsman {

    // 抽象装饰者：
    // 抽象装饰者保持了对抽象组件的引用，方便调用被装饰对象中的方法。在这个例子中就是武学前辈要持有武侠的引用，方便教授他武学并使他融会贯通
    private Swordsman swordsman;

    public Master(Swordsman swordsman) {
        this.swordsman = swordsman;
    }

    @Override
    public void attackMagic() {
        swordsman.attackMagic();  // 这里是去实现组件具体实现类本身就有的功能，这个功能是一直延续的
    }
}

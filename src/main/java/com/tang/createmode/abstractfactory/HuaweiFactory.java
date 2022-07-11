package com.tang.createmode.abstractfactory;

/**
 * @author weepppp 2022/7/11 9:56
 **/
public class HuaweiFactory implements IFactory {
    public Phone creatPhone() {
        return new HuaweiPhone();
    }

    public Computer creatComputer() {
        return new HuaweiComputer();
    }
}

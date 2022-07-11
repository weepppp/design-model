package com.tang.createmode.abstractfactory;

/**
 * @author weepppp 2022/7/11 9:54
 **/
public class XiaomiFactory implements IFactory {

    public Phone creatPhone() {
        return new XiaomiPhone();
    }

    public Computer creatComputer() {
        return new XiaomiComputer();
    }
}

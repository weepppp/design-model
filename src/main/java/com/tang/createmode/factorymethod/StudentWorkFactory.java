package com.tang.createmode.factorymethod;

/**
 * @author weepppp 2022/7/11 8:28
 **/
public class StudentWorkFactory implements WorkFactory {

    public Work getwork() {
        return new StudentWork();
    }
}

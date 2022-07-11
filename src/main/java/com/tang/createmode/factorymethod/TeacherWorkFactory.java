package com.tang.createmode.factorymethod;

/**
 * @author weepppp 2022/7/11 8:30
 **/
public class TeacherWorkFactory implements WorkFactory {
    public Work getwork() {
        return new TeacherWork();
    }
}

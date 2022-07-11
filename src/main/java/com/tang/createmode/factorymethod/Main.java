package com.tang.createmode.factorymethod;

/**
 * @author weepppp 2022/7/11 8:31
 **/
public class Main {
    public static void main(String[] args) {
        WorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getwork().dowork();
        WorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getwork().dowork();
    }
}

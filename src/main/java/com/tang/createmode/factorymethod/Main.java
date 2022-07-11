package com.tang.createmode.factorymethod;

/**
 * @author weepppp 2022/7/11 8:31
 **/

/**
 * @概念： 定义一个用于创建对象的接口，让工厂实例化某一个子类。 FactoryMethod使一个类的实例化延迟到其子类。
 * 也就是说，我们一般在客户端中创造子类实例，现在把这种实例的创建交给工厂去处理，要用的时候找工厂获取就可以
 *
 * @优点： 在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象，把对象的创建和使用过程分割开来，
 * 比如说 Class A 想调用 Class B的方法，那么我们无需关心B是如何创建的，直接去工厂获取就行。
 * 减少每次创建对象时的代码量，易于统一维护
 */
public class Main {
    public static void main(String[] args) {
        WorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getwork().dowork();
        WorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getwork().dowork();
    }
}

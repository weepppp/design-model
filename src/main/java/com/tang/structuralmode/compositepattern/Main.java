package com.tang.structuralmode.compositepattern;

/**
 * @author weepppp 2022/7/13 8:00
 **/

/**
 * @功能: 组合模式
 * 又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
 */
public class Main {

    public static void main(String[] args) {
        Employees manager = new Manager("餐厅经理");
        manager.addEmployees(new Cook("湘菜厨师"));
        manager.addEmployees(new Cook("川菜厨师"));
        manager.addEmployees(new Waiter("点餐服务员"));
        manager.addEmployees(new Waiter("结账服务员"));
        manager.work();
    }
}

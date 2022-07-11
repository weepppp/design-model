package com.tang.createmode.builderpattern;

/**
 * @author weepppp 2022/7/11 11:19
 **/
public class CommonHouse extends HouseBuilder {

    private House house = new House();

    void buildWalls() {
        house.setWalls("普通墙体");
        System.out.println("正在装修普通墙体");
    }

    void bulidDecoration() {
        house.setDecoration("普通装饰");
        System.out.println("正在粉刷普通装饰");
    }

    House buildHouse() {
        return house;
    }
}

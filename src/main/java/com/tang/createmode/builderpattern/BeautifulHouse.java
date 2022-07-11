package com.tang.createmode.builderpattern;

/**
 * @author weepppp 2022/7/11 11:23
 **/
public class BeautifulHouse extends HouseBuilder {

    private House house = new House();

    void buildWalls() {
        house.setWalls("漂亮墙体");
        System.out.println("正在装修漂亮墙体");
    }

    void bulidDecoration() {
        house.setDecoration("漂亮装饰");
        System.out.println("正在粉刷漂亮装饰");
    }

    House buildHouse() {
        return house;
    }
}

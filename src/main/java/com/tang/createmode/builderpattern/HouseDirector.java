package com.tang.createmode.builderpattern;

/**
 * @author weepppp 2022/7/11 11:26
 **/
public class HouseDirector {

    private HouseBuilder houseBuilder;

    public House contructHouse(HouseBuilder houseBuilder) {
        houseBuilder.buildWalls();
        houseBuilder.bulidDecoration();
        return houseBuilder.buildHouse();
    }

}

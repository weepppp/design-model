package com.tang.createmode.builderpattern;

/**
 * @author weepppp 2022/7/11 10:25
 **/
public class House {
    private String walls;
    private String decoration;

    public House() {
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", decoration='" + decoration + '\'' +
                '}';
    }

    public House(String walls, String decoration) {
        this.walls = walls;
        this.decoration = decoration;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }
}

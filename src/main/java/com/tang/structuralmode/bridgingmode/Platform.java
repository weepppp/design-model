package com.tang.structuralmode.bridgingmode;

/**
 * @author weepppp 2022/7/12 10:03
 **/
public abstract class Platform {

    protected Vedio vedio;

    public Platform(Vedio vedio) {
        this.vedio = vedio;
    }

    abstract Vedio showVedio();


}

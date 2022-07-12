package com.tang.structuralmode.bridgingmode;

/**
 * @author weepppp 2022/7/12 10:08
 **/
public class AndroidPlatform extends Platform {

    public AndroidPlatform(Vedio vedio) {
        super(vedio);
    }

    Vedio showVedio() {
        System.out.println("在 Android 平台打开视频");
        return vedio;
    }
}

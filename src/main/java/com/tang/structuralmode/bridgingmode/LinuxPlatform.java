package com.tang.structuralmode.bridgingmode;

/**
 * @author weepppp 2022/7/12 10:07
 **/
public class LinuxPlatform extends Platform {


    public LinuxPlatform(Vedio vedio) {
        super(vedio);
    }

    Vedio showVedio() {
        System.out.println("在 Linux 平台播放视频");
        return vedio;
    }
}

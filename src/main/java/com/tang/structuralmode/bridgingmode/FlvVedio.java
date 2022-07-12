package com.tang.structuralmode.bridgingmode;

/**
 * @author weepppp 2022/7/12 9:59
 **/
public class FlvVedio implements Vedio {
    public Vedio openVedio() {
        System.out.println("打开 FLV 格式视频");
        return new FlvVedio();
    }

    public void showVedio() {
        System.out.println("当前视频格式是 FLV");
    }
}

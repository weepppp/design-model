package com.tang.structuralmode.bridgingmode;

/**
 * @author weepppp 2022/7/12 10:01
 **/
public class MP4Vedio implements Vedio {
    public Vedio openVedio() {
        System.out.println("打开 MP4 格式视频");
        return new MP4Vedio();
    }

    public void showVedio() {
        System.out.println("当前视频格式是 MP4");
    }
}

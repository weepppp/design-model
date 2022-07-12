package com.tang.createmode.adaptermode;

/**
 * @author weepppp 2022/7/12 8:29
 **/
public interface Target {

    // 定义Client使用的与特定领域相关的接口。也就是你需要用的接口
    void adapteeMethod();
    void adapterMethod();

}

package com.tang.structuralmode.bridgingmode;

/**
 * @author weepppp 2022/7/12 8:57
 **/

/**
 * @功能: 桥接模式
 * @概念： 桥接模式是采用组合的方式，建立两个类之间的关系，合成复用原则，推荐优先使用组合，不是继承
 *
 * 桥接模式与组合模式的区别：
 * 组合模式更强调部分与整体间的组合 ;桥接模式更强调平行级别上不同类的组合 ;
 * 桥接模式与适配器模式的区别:
 * 适配器模式是改变已有接口，让二者之间相互配合，目的是配合，桥接模式分离抽象和具体的实现，目的是分离;
 */
public class Main {
    public static void main(String[] args) {
        // 本案例中抽象就是Platform平台类及子类，实现就是Video视频接口及其实现类，抽象和实现都可以各自以继承的方式扩展，可以动态的将抽象的子类对象和实现的子类对象进行组合
        Platform linuxPlatform1 = new LinuxPlatform(new MP4Vedio());
        linuxPlatform1.showVedio().showVedio();
        Platform linuxPlatform2 = new LinuxPlatform(new FlvVedio());
        linuxPlatform2.showVedio().showVedio();
        Platform androidPlatform = new AndroidPlatform(new MP4Vedio());
        androidPlatform.showVedio().showVedio();
    }
}

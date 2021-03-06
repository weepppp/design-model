package com.tang.createmode.abstractfactory;

/**
 * @author weepppp 2022/7/11 9:05
 **/

/**
 * @功能： 抽象工厂模式
 * @概念： 工厂方法模式是一个产品系列一个工厂类，而抽象工厂模式是多个产品系列一个工厂类。
 * 在抽象工厂模式中，客户端不再负责对象的创建，而是把这个责任丢给了具体的工厂类，客户端只负责对对象的调用，从而明确了各个类的职责。
 * 抽象工厂模式中存在四种角色，分别是抽象工厂角色，具体工厂角色，抽象产品角色，具体产品角色。
 * 如小米工厂生产小米手机和小米电脑  华为工厂生产华为手机和华为电脑   小米手机和小米电脑都属于小米产品  华为手机和华为电脑都属于华为产品
 * @优点： 当一系列相互关联的产品被设计到一个工厂类里后，客户端的调用将会变得非常简单，而且，如果要更换这一系列的产品，则只需要更换一个工厂类即可。
 */
public class Main {
    public static void main(String[] args) {
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        Phone xiaomiphone = xiaomiFactory.creatPhone();
        xiaomiphone.call();
        Computer xiaomicomputer = xiaomiFactory.creatComputer();
        xiaomicomputer.playgame();

        HuaweiFactory huaweiFactory = new HuaweiFactory();
        Phone huaweiphone = huaweiFactory.creatPhone();
        huaweiphone.call();
        Computer huaweicomputer = huaweiFactory.creatComputer();
        huaweicomputer.playgame();
    }

}

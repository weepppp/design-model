package com.tang.createmode.builderpattern;

/**
 * @author weepppp 2022/7/11 10:15
 **/

/**
 * @功能： 建造者模式
 * @概念： 将一个复杂对象的构造与它的表示分离，使的同样的构造过程可以创建不同的表示。
 * ? 建造者模式与工厂模式：
 * 1.侧重点不同：建造者模式注重方法的调用顺序，工厂模式则注重创建对象。
 * 2.创建对象的力度不同：建造者模式创建复杂的对象，由各种复杂的部件组成；工厂模式创建出来的对象都一样。
 * 3.关注点不同：建造者模式不仅要创建出对象，而且还要知道对象由哪些部件组成，其主要目的是通过组装配件而产生新的产品；工厂模式只需要把对象创建出来即可，不需要关心构建过程，只关心什么产品由什么工程产生即可。
 * 4.复杂程度不同。如果创建产品很复杂，使用工厂模式；如果创建产品更复杂，使用建造者模式。
 * ? 为什么建造者是用抽象类表示？而不是用接口？
 * 1.接口是一组规范的定义 ；抽象类只是相当于占位符，更多的功能需要子类的完善，也就是更加重视子功能的扩展丰富  此处更加符合抽象类的用法
 * @优点： 封装性好，易于扩展，便于控制细节风险
 * @缺点： 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似；如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围受到一定的限制。
 */
public class Main {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector();
        House house = houseDirector.contructHouse(commonHouse);
        System.out.println(house);

        BeautifulHouse beautifulHouse = new BeautifulHouse();
        House house1 = houseDirector.contructHouse(beautifulHouse);
        System.out.println(house1);
    }

}

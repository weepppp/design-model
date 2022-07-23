package com.tang.behavioralmodel.interpretermode;

/**
 * @author weepppp 2022/7/18 8:05
 **/

/**
 * @功能: 解释器模式
 * 一种行为型设计模式。定义了一个解释器，来解释给定语言和文法的句子。其实质是把语言中的每个符号定义成一个（对象）类，从而把每个程序转换成一个具体的对象树。
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String expression = "1+2+3+4-5";
        calculator.parse(expression);
        System.out.println(expression + "=" + calculator.calculate());
    }
}

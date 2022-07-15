package com.tang.behavioralmodel.responsibilitychainmodel;

/**
 * @author weepppp 2022/7/15 8:19
 **/

/**
 * @功能: 责任链模式
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链。并沿着这条链传递该请求，直到有一个对象处理它为止。
 * 这一模式的想法是，给多个对象处理一个请求的机会，从而解耦发送者和接收者。
 * 有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
 */
public class Main {

    public static void main(String[] args) {
        TLRequestHandle tl = new TLRequestHandle();
        PMRequestHandle pm = new PMRequestHandle(tl);
        HRRequestHandle hr = new HRRequestHandle(pm);
        Request addMoney = new AddMoneyRequest();
        hr.handleRequest(addMoney);

    }
}

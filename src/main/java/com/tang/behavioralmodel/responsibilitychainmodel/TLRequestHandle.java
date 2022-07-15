package com.tang.behavioralmodel.responsibilitychainmodel;

/**
 * @author weepppp 2022/7/15 8:25
 **/
public class TLRequestHandle implements RequestHandle {


    public void handleRequest(Request request) {
        if (request instanceof LeaveRequest) {
            System.out.println("请假请求由Tl组长审批了");
        }
    }
}

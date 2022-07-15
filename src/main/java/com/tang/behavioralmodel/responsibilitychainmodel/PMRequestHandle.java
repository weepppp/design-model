package com.tang.behavioralmodel.responsibilitychainmodel;

/**
 * @author weepppp 2022/7/15 8:28
 **/
public class PMRequestHandle implements RequestHandle {
    RequestHandle nestHandler;

    public PMRequestHandle(RequestHandle nestHandler) {
        this.nestHandler = nestHandler;
    }

    public void handleRequest(Request request) {
        if (request instanceof AddMoneyRequest) {
            System.out.println("加薪请求由pm组长审批了");
        } else {
            nestHandler.handleRequest(request);
        }
    }
}

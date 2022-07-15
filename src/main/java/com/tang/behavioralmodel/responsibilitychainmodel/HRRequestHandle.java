package com.tang.behavioralmodel.responsibilitychainmodel;

/**
 * @author weepppp 2022/7/15 8:30
 **/
public class HRRequestHandle implements RequestHandle {
    RequestHandle nestHandler;

    public HRRequestHandle(RequestHandle nestHandler) {
        this.nestHandler = nestHandler;
    }

    public void handleRequest(Request request) {
        if (request instanceof DimissionRequest) {
            System.out.println("离职请求由hr审批了");
        } else {
            nestHandler.handleRequest(request);
        }
    }
}

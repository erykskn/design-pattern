package com.ery.behavioral.chainOfResponsibility;

public class SupportService  implements ISupportService{

    ISupportService iSupportService = null;

    public ISupportService getiSupportService() {
        return iSupportService;
    }

    public void setiSupportService(ISupportService iSupportService) {
        this.iSupportService = iSupportService;
    }

    @Override
    public void handleRequest(ServiceRequest serviceRequest) {
        iSupportService.handleRequest(serviceRequest);
    }
}

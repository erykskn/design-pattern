package com.ery.behavioral.chainOfResponsibility;

public class FrontDeskSupport implements ISupportService{

    private ISupportService next = null;

    public ISupportService getNext() {
        return next;
    }

    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest serviceRequest) {

        if(serviceRequest.getServiceLevel() == ServiceLevel.LEVEL_ONE){
            serviceRequest.setConclusion("Front desk solved level one request!");
        }else{
            if (next != null){
                next.handleRequest(serviceRequest);
            }else{
                throw  new IllegalArgumentException("No handle found for :: "  + serviceRequest.getServiceLevel());
            }
        }

    }
}

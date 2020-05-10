package com.ery.behavioral.chainOfResponsibility;

public class SupervisorSupport implements ISupportService{
    private ISupportService next;

    public ISupportService getNext() {
        return next;
    }

    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest serviceRequest) {
        if ( ServiceLevel.LEVEL_TWO.equals(serviceRequest.getServiceLevel())) {
            serviceRequest.setConclusion("Supervisor solved level two request!");
        }else{
            if(next != null){
                next.handleRequest(serviceRequest);
            }else{
                throw new IllegalArgumentException("No handle found for ::" + serviceRequest.getServiceLevel());
            }
        }
    }
}

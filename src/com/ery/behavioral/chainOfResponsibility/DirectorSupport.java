package com.ery.behavioral.chainOfResponsibility;

public class DirectorSupport implements ISupportService{
    private ISupportService next;

    public ISupportService getNext() {
        return next;
    }

    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest serviceRequest) {
        if ( ServiceLevel.LEVEL_FOUR.equals(serviceRequest.getServiceLevel())) {
            serviceRequest.setConclusion("Director solved level two request!");
        }else{
            if(next != null){
                next.handleRequest(serviceRequest);
            }else{
                serviceRequest.setConclusion("Your problem is none of  our business");
                throw new IllegalArgumentException("No handle found for ::" + serviceRequest.getServiceLevel());
            }
        }
    }
}

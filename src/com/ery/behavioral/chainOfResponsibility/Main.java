package com.ery.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        //need mvn app and add spring dependencies
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        SupportService supportService = (SupportService) context.getBean("supportService");

        ServiceRequest request = new ServiceRequest();
        request.setServiceLevel(ServiceLevel.LEVEL_ONE);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());

        request = new ServiceRequest();
        request.setServiceLevel(ServiceLevel.LEVEL_THREE);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());

        request = new ServiceRequest();
        request.setServiceLevel(ServiceLevel.INVALID_REQUEST);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());
    }
}

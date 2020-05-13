package com.ery.structural.facade;

public class Main {
    public static void main(String[] args) {
        ReportGeneratorFacade.generateReport(ReportType.PDF, null, null);
        System.out.println();
        ReportGeneratorFacade.generateReport(ReportType.HTML, null, null);
    }
}

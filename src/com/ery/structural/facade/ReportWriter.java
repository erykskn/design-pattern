package com.ery.structural.facade;

public class ReportWriter {
    public void writeHTMLReport(Report report, String location){
        System.out.println("HTML Report");
    }
    public void writePDFReport(Report report, String location){
        System.out.println("PDF Report");
    }
}

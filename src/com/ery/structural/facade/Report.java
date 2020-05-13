package com.ery.structural.facade;

public class Report {
    private ReportData reportData;
    private ReportFooter reportFooter;
    private ReportHeader reportHeader;

    public ReportData getReportData() {
        return reportData;
    }

    public void setReportData(ReportData reportData) {
        System.out.println("Report Data Set!");
        this.reportData = reportData;
    }

    public ReportFooter getReportFooter() {
        return reportFooter;
    }

    public void setReportFooter(ReportFooter reportFooter) {
        System.out.println("Report Footer Set!");
        this.reportFooter = reportFooter;
    }

    public ReportHeader getReportHeader() {
        return reportHeader;
    }

    public void setReportHeader(ReportHeader reportHeader) {
        System.out.println("Report Header Set!");
        this.reportHeader = reportHeader;
    }
}

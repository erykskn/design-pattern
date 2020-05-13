package com.ery.structural.facade;

public class ReportGeneratorFacade {
    public static void generateReport(ReportType reportType, String data, String location) {

        if (reportType == null || data == null) {
            // throw some exception
        }

        Report report = new Report();
        //set data to report data
        report.setReportData(new ReportData());
        report.setReportFooter(new ReportFooter());
        report.setReportHeader(new ReportHeader());

        ReportWriter reportWriter = new ReportWriter();

        switch (reportType) {
            case PDF -> {
                reportWriter.writePDFReport(report, location);
                break;
            }
            case HTML -> {
                reportWriter.writeHTMLReport(report, location);
                break;
            }
        }


    }
}

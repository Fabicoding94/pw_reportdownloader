package com.fabiolabarone.myreportdownloader.model_dto;

import java.util.List;

public class AziendaReport {
    private String companyName;
    private String segment;
    private List<ReportLink> report;

    // Getters e Setters
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getSegment() { return segment; }
    public void setSegment(String segment) { this.segment = segment; }

    public List<ReportLink> getReport() { return report; }
    public void setReport(List<ReportLink> report) { this.report = report; }
}
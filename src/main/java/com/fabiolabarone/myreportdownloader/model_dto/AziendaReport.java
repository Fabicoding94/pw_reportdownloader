package com.fabiolabarone.myreportdownloader.model_dto;

import java.util.List;

public class AziendaReport {
    private String companyName;
    private String segment;

    private String brandHistory;
    private List<ReportLink> report;

    public String getBrandHistory() {
        return brandHistory;
    }

    public void setBrandHistory(String brandHistory) {
        this.brandHistory = brandHistory;
    }

    // Getters e Setters
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getSegment() { return segment; }
    public void setSegment(String segment) { this.segment = segment; }

    public List<ReportLink> getReport() { return report; }
    public void setReport(List<ReportLink> report) { this.report = report; }
}
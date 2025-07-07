package com.fabiolabarone.myreportdownloader.model_dto;

public class ReportLink {
    private int year;
    private String title;
    private String url;


    // Getters e Setters
    public int getYear() { return year; }
    public void setYear(int anno) { this.year = anno; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
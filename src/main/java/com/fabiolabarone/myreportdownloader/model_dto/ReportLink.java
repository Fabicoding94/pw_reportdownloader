package com.fabiolabarone.myreportdownloader.model_dto;

public class ReportLink {
    private int anno;
    private String titolo;
    private String url;

    // Getters e Setters
    public int getAnno() { return anno; }
    public void setAnno(int anno) { this.anno = anno; }

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
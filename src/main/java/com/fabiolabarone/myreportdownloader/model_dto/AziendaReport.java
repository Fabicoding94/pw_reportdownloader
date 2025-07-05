package com.fabiolabarone.myreportdownloader.model_dto;

import java.util.List;

public class AziendaReport {
    private String nome;
    private String segmento;
    private List<ReportLink> report;

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSegmento() { return segmento; }
    public void setSegmento(String segmento) { this.segmento = segmento; }

    public List<ReportLink> getReport() { return report; }
    public void setReport(List<ReportLink> report) { this.report = report; }
}
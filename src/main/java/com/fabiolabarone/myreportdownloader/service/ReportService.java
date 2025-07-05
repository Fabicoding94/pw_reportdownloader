package com.fabiolabarone.myreportdownloader.service;

import com.fabiolabarone.myreportdownloader.model_dto.AziendaReport;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class ReportService {

    public List<AziendaReport> getAllReports() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = getClass().getClassLoader().getResourceAsStream("data/report.json");
            return mapper.readValue(is, new TypeReference<List<AziendaReport>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Errore nella lettura del file JSON", e);
        }
    }
}
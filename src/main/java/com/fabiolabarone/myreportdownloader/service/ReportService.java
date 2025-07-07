package com.fabiolabarone.myreportdownloader.service;

import com.fabiolabarone.myreportdownloader.model_dto.AziendaReport;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
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

    public  ResponseEntity<byte[]> downloadReport(String url) {
       //logica dowload report
        try {
            // Scarica il PDF remoto
            URL pdfUrl = new URL(url);
            InputStream inputStream = pdfUrl.openStream();
            byte[] pdfBytes = inputStream.readAllBytes();
            inputStream.close();

            // Imposta headers per forzare il download
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("attachment", "report.pdf");

            return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
package com.fabiolabarone.myreportdownloader.controller;

import com.fabiolabarone.myreportdownloader.model_dto.AziendaReport;
import com.fabiolabarone.myreportdownloader.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "*") // utile per permettere richieste da Angular
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping
    public List<AziendaReport> getReports() {
        return reportService.getAllReports();
    }


    @GetMapping("/download")
    public ResponseEntity<byte[]> downloadReport(@RequestParam String url) {
        return reportService.downloadReport(url);
    }
}
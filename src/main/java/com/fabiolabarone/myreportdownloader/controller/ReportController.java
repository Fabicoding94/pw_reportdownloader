package com.fabiolabarone.myreportdownloader.controller;

import com.fabiolabarone.myreportdownloader.model_dto.AziendaReport;
import com.fabiolabarone.myreportdownloader.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
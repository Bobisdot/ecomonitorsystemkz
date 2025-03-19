package com.ecomonitor.ecomonitorsystem.controller;

import com.ecomonitor.ecomonitorsystem.model.Complaint;
import com.ecomonitor.ecomonitorsystem.service.ComplaintService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {
    private final ComplaintService complaintService;

    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    @GetMapping
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }
    @PostMapping("/add")
    public String addComplaint(@RequestBody Complaint complaint) {
        complaintService.saveComplaint(complaint);
        return "New complaint is added";
    }
}

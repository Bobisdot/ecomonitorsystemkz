package com.ecomonitor.ecomonitorsystem.service;

import com.ecomonitor.ecomonitorsystem.model.Complaint;
import com.ecomonitor.ecomonitorsystem.repository.ComplaintRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ComplaintServiceImpl implements ComplaintService {
    private final ComplaintRepository complaintRepository;

    public ComplaintServiceImpl(ComplaintRepository complaintRepository) {
        this.complaintRepository = complaintRepository;
    }

    @Override
    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }
    @Override
    public void saveComplaint(Complaint complaint) {
        complaintRepository.save(complaint);
    }
}

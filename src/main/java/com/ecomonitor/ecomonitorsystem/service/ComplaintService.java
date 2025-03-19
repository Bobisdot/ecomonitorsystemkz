package com.ecomonitor.ecomonitorsystem.service;

import com.ecomonitor.ecomonitorsystem.model.Complaint;
import java.util.List;

public interface ComplaintService {
    List<Complaint> getAllComplaints();
    void saveComplaint(Complaint complaint);
}

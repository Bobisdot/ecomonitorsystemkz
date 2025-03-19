package com.ecomonitor.ecomonitorsystem.repository;

import com.ecomonitor.ecomonitorsystem.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
}

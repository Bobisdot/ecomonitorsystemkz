package com.ecomonitor.ecomonitorsystem.repository;

import com.ecomonitor.ecomonitorsystem.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}

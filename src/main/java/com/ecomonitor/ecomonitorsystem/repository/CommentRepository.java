package com.ecomonitor.ecomonitorsystem.repository;

import com.ecomonitor.ecomonitorsystem.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

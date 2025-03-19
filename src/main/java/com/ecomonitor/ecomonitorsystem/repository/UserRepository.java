package com.ecomonitor.ecomonitorsystem.repository;

import com.ecomonitor.ecomonitorsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

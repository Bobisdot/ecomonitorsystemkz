package com.ecomonitor.ecomonitorsystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
}

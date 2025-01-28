package com.forrestgump.courseapi;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String title;

    @Column(nullable = false, length = 500)
    private String description;

    @Column(nullable = false)
    private int workload;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private String instructor;

    @Column(nullable = false)
    private boolean published;

    @Column(nullable = false, length = 100)
    private String category;

    @Column(nullable = true)
    private String imageUrl;
}

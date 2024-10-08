package com.demo.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String rollNo;
    @Column(nullable = false)
    private Integer marks;
    @Column(nullable = false)
    private String qualification;
}

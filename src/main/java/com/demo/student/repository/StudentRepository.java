package com.demo.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> { 
    
}




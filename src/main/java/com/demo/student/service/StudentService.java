package com.demo.student.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.demo.student.model.Student;

import reactor.core.publisher.Flux;

public interface StudentService {

    Student saveStudent(Student student);

    Student getStudentById(Integer studentId) throws InterruptedException, ExecutionException;

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void removeStudent(Integer studentId);

    Flux<Student> getStudents();
    
}



package com.demo.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.student.model.Student;
import com.demo.student.repository.StudentRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer studentId) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        return optionalStudent.get();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        Student existingstudent = studentRepository.findById(student.getId()).get();
        existingstudent.setId(student.getId());
        existingstudent.setName(student.getName());
        existingstudent.setMarks(student.getMarks());
        existingstudent.setRollNo(student.getRollNo());
        existingstudent.setQualification(student.getQualification());
        Student updatedstudent = studentRepository.save(existingstudent);
        return updatedstudent;
    }

    @Override
    public void removeStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Flux<Student> getStudents() {
        return Flux.fromIterable(studentRepository.findAll());
    }
    
}

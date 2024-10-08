package com.demo.student.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.student.model.Student;
import com.demo.student.service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

        // build create Student REST API
        @PostMapping(path = "/save")
        public ResponseEntity<Student> saveStudent(@RequestBody Student student){
            Student savedStudent = studentService.saveStudent(student);
            return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
        }
    
        // build get Student by id REST API
        // http://localhost:8080/api/students/1
        @GetMapping(path = "/getAllStudents/{id}")
        public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer studentId) throws InterruptedException, ExecutionException{
            Student student = studentService.getStudentById(studentId);
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
    
        // Build Get All Students REST API
        // http://localhost:8080/api/students
        @GetMapping(path = "/getAllStudents")
        public ResponseEntity<List<Student>> getAllStudents(){
            List<Student> students = studentService.getAllStudents();
            return new ResponseEntity<>(students, HttpStatus.OK);
        }
   
        // Build Update Student REST API
        @PutMapping(path = "updateStudent/{id}")
        // http://localhost:8080/api/students/1
        public ResponseEntity<Student> updateStudent(@PathVariable("id") Integer studentId,
                                               @RequestBody Student student){
            student.setId(studentId);
            Student updatedStudent = studentService.updateStudent(student);
            return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
        }
    
        // Build Delete Student REST API
        @DeleteMapping(path= "deleteStudent/{id}")
        public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer studentId){
            studentService.removeStudent(studentId);
            return new ResponseEntity<>("Student successfully deleted!", HttpStatus.OK);
        }
    
}

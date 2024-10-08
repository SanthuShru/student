package com.demo.student.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class StudentMapper implements RowMapper<Student> {

    public Student mapRow(ResultSet resultSet, int i) throws SQLException {

        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setMarks(resultSet.getInt("marks"));
        student.setQualification(resultSet.getString("qualification"));
        student.setRollNo(resultSet.getString("rollNo"));
        return student;
    }
}

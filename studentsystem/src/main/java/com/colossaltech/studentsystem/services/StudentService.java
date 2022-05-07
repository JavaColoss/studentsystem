package com.colossaltech.studentsystem.services;

import com.colossaltech.studentsystem.models.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}

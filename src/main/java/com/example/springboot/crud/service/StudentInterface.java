package com.example.springboot.crud.service;

import com.example.springboot.crud.entity.Student;

import java.util.List;

public interface StudentInterface {
    // To save new student
    public Student saveStudent(Student student);

    //To update student
    public Student updateStudent(Student student);

    //to fetch all students
    public List<Student> findAllStudents();

    //to delete student
    public void deleteStudent(int id);
}

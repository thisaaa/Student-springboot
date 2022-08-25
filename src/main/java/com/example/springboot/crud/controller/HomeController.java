package com.example.springboot.crud.controller;

import com.example.springboot.crud.entity.Student;
import com.example.springboot.crud.serviceImplementation.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class HomeController {
    @Autowired
    private StudentServiceImpl studentServiceImpl;

    //to save new student
    @PostMapping(value = "saveStudent")
    public Student saveStudent(@RequestBody Student student){
        studentServiceImpl.saveStudent(student);
        return student;
    }

    //to get all student details
    @GetMapping(value = "getAllStudents")
    public List<Student> findAllStudent(){
        return studentServiceImpl.findAllStudents();
    }

    //to update student details
    @PutMapping(value = "updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentServiceImpl.updateStudent(student);
    }

    //to delete student details
    @DeleteMapping(value = "deleteStudent")
    public String deleteStudent(@RequestParam int id){
        studentServiceImpl.deleteStudent(id);
        return "Student Deleted !";
    }
}

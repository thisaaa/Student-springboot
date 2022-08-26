package com.example.springboot.crud.controller;

import com.example.springboot.crud.entity.Course;
import com.example.springboot.crud.entity.Student;
//import com.example.springboot.crud.serviceImplementation.CourseServiceImpl;
//import com.example.springboot.crud.serviceImplementation.CourseServiceImpl;
import com.example.springboot.crud.serviceImplementation.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Controller {
    @Autowired
    private ServiceImpl serviceImpl;


    //to save new course
    @PostMapping(value = "saveCourse")
    public Course saveCourse(@RequestBody Course course){
        serviceImpl.saveCourse(course);
        return course;
    }

    //to save new student
    @PostMapping(value = "saveStudent")
    public Student saveStudent(@RequestBody Student student){
        serviceImpl.saveStudent(student);
        return student;
    }

    //to get all student details
    @GetMapping(value = "getAllStudents")
    public List<Student> findAllStudent(){
        return serviceImpl.findAllStudents();
    }

    //to update student details
    @PutMapping(value = "updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return serviceImpl.updateStudent(student);
    }

    //to delete student details
    @DeleteMapping(value = "deleteStudent")
    public String deleteStudent(@RequestParam int id){
        serviceImpl.deleteStudent(id);
        return "Student Deleted !";
    }
}

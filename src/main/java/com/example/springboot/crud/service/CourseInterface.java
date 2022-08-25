package com.example.springboot.crud.service;

import com.example.springboot.crud.entity.Course;
import com.example.springboot.crud.entity.Student;

import java.util.List;

public interface CourseInterface {
    // To save new course
    public Student saveCourse(Course course);

    //To update course
    public Student updateCourse(Course course);

    //to fetch all courses
    public List<Course> findAllStudents();

    //to delete course
    public void deleteCourse(int id);
}

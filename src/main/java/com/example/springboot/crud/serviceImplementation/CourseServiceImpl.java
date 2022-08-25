package com.example.springboot.crud.serviceImplementation;

import com.example.springboot.crud.dao.CourseRepository;
import com.example.springboot.crud.dao.StudentRepository;
import com.example.springboot.crud.entity.Course;
import com.example.springboot.crud.entity.Student;
import com.example.springboot.crud.service.CourseInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseInterface {
    @Autowired
    private CourseRepository courseRepo;
    @Override
    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public List<Course> findAllStudents() {
        return (List<Course>) courseRepo.findAll();
    }

    @Override
    public void deleteCourse(int id) {
        courseRepo.deleteById(id);
    }
}

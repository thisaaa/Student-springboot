package com.example.springboot.crud.serviceImplementation;
import com.example.springboot.crud.dao.CourseRepository;
import com.example.springboot.crud.dao.StudentRepository;
import com.example.springboot.crud.entity.Course;
import com.example.springboot.crud.entity.Student;
import com.example.springboot.crud.service.CourseInterface;
import com.example.springboot.crud.service.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements StudentInterface, CourseInterface {
    @Autowired
    private StudentRepository studentRepo;
    @Autowired
    private CourseRepository courseRepo;
    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public void deleteCourse(int id) {

    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);

    }

    @Override
    public  Course saveCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public List<Course> findAllCourses() {
        return null;
    }
}

package com.example.springboot.crud.serviceImplementation;

//import com.example.springboot.crud.dao.CourseRepository;
import com.example.springboot.crud.dao.StudentRepository;
import com.example.springboot.crud.entity.Student;
import com.example.springboot.crud.service.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentInterface {
    @Autowired
    private StudentRepository studentRepo;
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
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);

    }
}

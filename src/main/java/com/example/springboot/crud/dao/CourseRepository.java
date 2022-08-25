package com.example.springboot.crud.dao;

import com.example.springboot.crud.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course , Integer> {
}

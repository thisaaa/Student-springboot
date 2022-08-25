package com.example.springboot.crud.dao;

import com.example.springboot.crud.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student , Integer> {
}

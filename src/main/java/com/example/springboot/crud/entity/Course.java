package com.example.springboot.crud.entity;

import javax.persistence.*;

@Entity
@Table(name = "course_table" , catalog = "student_database")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int duration;
    private String courseName;
    private String moduleLeaderName;

    public Course(int id, int duration, String courseName, String moduleLeaderName) {
        this.id = id;
        this.duration = duration;
        this.courseName = courseName;
        this.moduleLeaderName = moduleLeaderName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getModuleLeaderName() {
        return moduleLeaderName;
    }

    public void setModuleLeaderName(String moduleLeaderName) {
        this.moduleLeaderName = moduleLeaderName;
    }
}

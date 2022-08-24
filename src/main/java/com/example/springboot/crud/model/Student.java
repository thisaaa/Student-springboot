package com.example.springboot.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "student_table" , catalog = "student_database")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int age;
    private String fName;
    private String lName;
    private String city;

    public Student(){
        super();
        //TODO Auto-generated constructor stub
    }

    public Student(int id, int age, String fName, String lName, String city) {
        this.id = id;
        this.age = age;
        this.fName = fName;
        this.lName = lName;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

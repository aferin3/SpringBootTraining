package com.fidan.cruddemo.dao;

import com.fidan.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(int id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student student);


}

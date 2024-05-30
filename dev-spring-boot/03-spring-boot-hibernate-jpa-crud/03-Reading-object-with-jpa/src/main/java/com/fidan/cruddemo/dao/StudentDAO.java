package com.fidan.cruddemo.dao;

import com.fidan.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(int id);

}

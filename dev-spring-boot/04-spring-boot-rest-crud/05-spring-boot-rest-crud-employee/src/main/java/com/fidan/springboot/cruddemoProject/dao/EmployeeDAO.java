package com.fidan.springboot.cruddemoProject.dao;

import com.fidan.springboot.cruddemoProject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void delete(Employee employee);
}

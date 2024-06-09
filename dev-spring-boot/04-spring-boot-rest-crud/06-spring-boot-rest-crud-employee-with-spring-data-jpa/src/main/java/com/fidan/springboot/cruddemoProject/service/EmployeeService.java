package com.fidan.springboot.cruddemoProject.service;

import com.fidan.springboot.cruddemoProject.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void delete(Employee employee);
}

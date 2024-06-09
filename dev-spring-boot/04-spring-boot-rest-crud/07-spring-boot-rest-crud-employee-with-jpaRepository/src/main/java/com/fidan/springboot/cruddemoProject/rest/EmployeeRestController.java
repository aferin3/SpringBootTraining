package com.fidan.springboot.cruddemoProject.rest;

import com.fidan.springboot.cruddemoProject.entity.Employee;
import com.fidan.springboot.cruddemoProject.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;


    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);

        if(employee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        return employee;
    }

    // add mapping for POST /employees - add new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {

        // also just in case they pass an id in json ... set id to 0
        // this is to force to save of new item ... instead of update

        employee.setId(0);
        return employeeService.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
    @DeleteMapping("/employees/{employeeID}")
    public String deleteEmployee(@PathVariable int employeeID) {
        Employee employee = employeeService.findById(employeeID);
        if(employee == null) {
            throw new RuntimeException("Employee id not found - " + employeeID);
        }
        employeeService.delete(employee);
        return "Employee deleted id: " + employeeID;
    }

}

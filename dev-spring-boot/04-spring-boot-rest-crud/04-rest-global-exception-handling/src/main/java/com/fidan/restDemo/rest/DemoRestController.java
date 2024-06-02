package com.fidan.restDemo.rest;


import com.fidan.restDemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    private List<Student> students;

    //define @PostConstruct to load the student dat ... only once

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();

        students.add(new Student("Poornima","Patel"));
        students.add(new Student("Mario","Rossi"));
        students.add(new Student("Mary","Smith"));
        students.add(new Student("Afer","Fidan"));
    }



    @GetMapping("/students")
    public List<Student> getStudents() {

        //Thanks to Spring Rest and Jackson POJOs are automatically converted to JSON
        return students;
    }

    //define endpoint or "/students/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        //check the studentId again list size
        if (studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return students.get(studentId);
    }



}

package com.fidan.restDemo.rest;


import com.fidan.restDemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    //define endpoint for "/students" - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents() {

        //Thanks to Spring Rest and Jackson POJOs are automatically converted to JSON
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Poornima","Patel"));
        students.add(new Student("Mario","Rossi"));
        students.add(new Student("Mary","Smith"));
        students.add(new Student("Afer","Fidan"));

        return students;
    }
}

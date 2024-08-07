package com.fidan.springboot.thymeleafDemo.controller;

import com.fidan.springboot.thymeleafDemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showForm(Model model){

        model.addAttribute("student", new Student());

        return "studentForm";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student student){

        System.out.println("the Student is " + student.getFirstName() + " " + student.getLastName());
        return "studentConfirmation";
    }

}

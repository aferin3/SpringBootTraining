package com.fidan.springboot.thymeleafDemo.controller;

import com.fidan.springboot.thymeleafDemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${student.countries}")
    List<String> countries;

    @Value("${student.languages}")
    List<String> languages;

    @GetMapping("/showStudentForm")
    public String showForm(Model model){

        model.addAttribute("student", new Student());

        model.addAttribute("countries", countries);

        model.addAttribute("languages", languages);

        return "studentForm";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student student){

        System.out.println("the Student is " + student.getFirstName() + " " + student.getLastName());
        return "studentConfirmation";
    }

}

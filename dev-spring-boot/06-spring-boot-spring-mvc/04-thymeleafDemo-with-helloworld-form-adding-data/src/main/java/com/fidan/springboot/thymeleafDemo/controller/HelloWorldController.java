package com.fidan.springboot.thymeleafDemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {


    // need a controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
      return "helloworld-form";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");
        name = name.toUpperCase();

        String result = "Yo! " + name + " has been processed!";
        model.addAttribute("message", result);

        return "helloworld";
    }
}

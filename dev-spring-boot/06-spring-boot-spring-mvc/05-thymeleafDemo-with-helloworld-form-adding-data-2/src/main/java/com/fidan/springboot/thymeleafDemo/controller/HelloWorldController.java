package com.fidan.springboot.thymeleafDemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {


    // need a controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
      return "helloworld-form";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(@RequestParam("studentName") String name, Model model){

        name = name.toUpperCase();

        String result = "Yo! " + name + " has been processed!";
        model.addAttribute("message", result);

        return "helloworld";
    }
}

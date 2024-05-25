package com.fidan.springboot.demo.springapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!!!";
    }

    @GetMapping("/page2")
    public String sayHello2(){
        return "Hello Page2";
    }
    @GetMapping("/page3")
    public String sayHello3(){
        return "Hello Page3";
    }


}

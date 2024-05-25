package com.fidan.springboot.demo.springapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //inject properties for : team.name an user.name
    @Value("${team.name}")
    private String teamName;

    @Value("${userPC.name}")
    private String userName;

    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!!!";
    }

    @GetMapping("/page2")
    public String sayHello2(){
        return "team name is "+teamName+" and user name is "+userName;
    }
    @GetMapping("/page3")
    public String sayHello3(){
        return "Hello Page3";
    }


}

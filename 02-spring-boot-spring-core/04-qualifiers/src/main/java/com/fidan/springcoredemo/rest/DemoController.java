package com.fidan.springcoredemo.rest;

import com.fidan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency

    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach) {
        this.myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkout();
    }
}

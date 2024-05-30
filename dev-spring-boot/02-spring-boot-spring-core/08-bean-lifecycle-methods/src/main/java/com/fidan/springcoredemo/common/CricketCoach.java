package com.fidan.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In Constructor: " + this.getClass().getSimpleName());
    }

    //define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In PostConstruct: " + this.getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("In PostConstruct: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for Cricket Coach!!!";
    }
}
  
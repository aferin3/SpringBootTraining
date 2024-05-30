package com.fidan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In Constructor: " + this.getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkout() {
        return "Practice for Cricket Coach!!!";
    }
}
  
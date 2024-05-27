package com.fidan.springcoredemo.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("In Constructor " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for Baseball Coach";
    }
}

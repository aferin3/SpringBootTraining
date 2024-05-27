package com.fidan.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In Connstructor "+ this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practical Coach workout for tracking course";
    }

}

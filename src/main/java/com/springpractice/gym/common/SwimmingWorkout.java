package com.springpractice.gym.common;

import org.springframework.stereotype.Component;

@Component
public class SwimmingWorkout implements Workout{

    public SwimmingWorkout() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String exercise() {
        return "Swim 20 laps.";
    }

}

package com.springpractice.gym.common;

import org.springframework.stereotype.Component;

@Component
public class RunningWorkout implements Workout{

    public RunningWorkout() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String exercise() {
        return "Run 10,000 steps.";
    }

}


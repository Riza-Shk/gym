package com.springpractice.gym.common;

import org.springframework.stereotype.Component;

@Component
public class WeightTrainingWorkout implements Workout{

    public WeightTrainingWorkout() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String exercise() {
        return "Weight train for at least 30 mins.";
    }

}

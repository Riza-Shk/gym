package com.springpractice.gym.common;

import org.springframework.stereotype.Component;

@Component
public class YogaWorkout implements Workout{

    public YogaWorkout() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String exercise() {
        return "Do 10 different Aasans.";
    }

}

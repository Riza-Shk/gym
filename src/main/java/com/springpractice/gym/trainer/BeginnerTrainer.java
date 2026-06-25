package com.springpractice.gym.trainer;

import com.springpractice.gym.common.Workout;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeginnerTrainer implements Trainer{

    Workout workout;

    public BeginnerTrainer(@Qualifier("yogaWorkout") Workout myWorkout) {
        System.out.println("Beginner Trainer from : " + getClass().getSimpleName());
        workout = myWorkout;

    }
    @Override
    public String getDailyWorkout() {
        return workout.exercise();
    }
}

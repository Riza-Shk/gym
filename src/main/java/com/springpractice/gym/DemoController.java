package com.springpractice.gym;

import com.springpractice.gym.trainer.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Trainer raj;

    @Autowired
    public DemoController(@Qualifier("beginnerTrainer") Trainer trainer) {
        raj = trainer;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return raj.getDailyWorkout();
    }

}

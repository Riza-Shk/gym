package com.springpractice.gym;

import com.springpractice.gym.trainer.BeginnerTrainer;
import com.springpractice.gym.trainer.Trainer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymApplication.class, args);
	}
}

package com.avinash.joke.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.avinash.joke")
@ImportResource("classpath:chuk-config.xml")
public class AvinashJokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvinashJokeAppApplication.class, args);
	}
}

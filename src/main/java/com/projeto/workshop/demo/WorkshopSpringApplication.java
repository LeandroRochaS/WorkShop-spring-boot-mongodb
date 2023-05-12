package com.projeto.workshop.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.projeto.workshop.resources")
public class WorkshopSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopSpringApplication.class, args);
	}

}

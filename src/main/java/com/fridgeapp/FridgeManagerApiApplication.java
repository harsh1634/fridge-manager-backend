package com.fridgeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FridgeManagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FridgeManagerApiApplication.class, args);
		System.out.println("Hello there!");
	}

}

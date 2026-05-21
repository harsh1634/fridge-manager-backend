package com.fridgeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FridgeManagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FridgeManagerApiApplication.class, args);
		System.out.println("Hello there!");
	}

}

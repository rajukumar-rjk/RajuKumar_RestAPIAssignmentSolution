package com.greatlearning.gradedcodingassignment6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Gradedcodingassignment6Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Gradedcodingassignment6Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Start System Rest API..");

	}
}

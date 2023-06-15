package com.ivoyant.learncosmosdb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnCosmosdbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LearnCosmosdbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server is running!!!");
	}
}

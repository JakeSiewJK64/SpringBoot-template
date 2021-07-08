package com.fategrandorder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class FateGrandOrderApplication implements CommandLineRunner {
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(FateGrandOrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(mongoTemplate);
	}
}

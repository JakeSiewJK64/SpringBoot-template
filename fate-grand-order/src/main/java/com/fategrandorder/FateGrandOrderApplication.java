package com.fategrandorder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FateGrandOrderApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(FateGrandOrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}

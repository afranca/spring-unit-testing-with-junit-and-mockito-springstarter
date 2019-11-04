package com.in28minutes.unittesting.unittesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28minutes.unittesting")
public class UnitTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestingApplication.class, args);
	}
}

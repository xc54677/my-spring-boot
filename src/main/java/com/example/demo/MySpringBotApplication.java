package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //@SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan
public class MySpringBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBotApplication.class, args);
	}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldDemoApplication {

	public static void main(String[] args) {
		// UC1: Displaying hello message
		System.out.println("“Hello from BridgeLabz”");
		SpringApplication.run(HelloworldDemoApplication.class, args);
	}

}

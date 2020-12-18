package com.example.demo.springconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.springconcepts.component.DemoBean;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		System.out.println(" *** Welcome to Spring Concept Demo *** ");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		System.out.println("Checking context:" + context.getBean(DemoBean.class));
	}
}
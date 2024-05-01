package com.practice.restcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.practice.restcrud.controller")
public class RestCrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestCrudApplication.class, args);
//		System.out.println("hello world");
	}

}

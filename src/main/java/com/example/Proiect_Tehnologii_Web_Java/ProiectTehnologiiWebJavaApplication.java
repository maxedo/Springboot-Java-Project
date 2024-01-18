package com.example.Proiect_Tehnologii_Web_Java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@ComponentScan(basePackages="com.example.Proiect_Tehnologii_Web_Java")
@OpenAPIDefinition
public class ProiectTehnologiiWebJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProiectTehnologiiWebJavaApplication.class, args);
	}

}

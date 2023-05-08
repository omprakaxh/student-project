package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition
(info =@Info(
title = "Car details",
version = "1.1.2",
description = "Cardetails Project",
contact = @Contact(
		name = "omprakash",
		email = "omprakaxh@gmail.com"
		)
)
)
@SpringBootApplication

public class CarDbiApplication {
	public static void main(String[] args) {
		SpringApplication.run(CarDbiApplication.class, args);
	}

}

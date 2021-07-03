package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Console implements CommandLineRunner {
	
	@Autowired
	Service service;

	@Override
	public void run(String... args) throws Exception {
		service.tracer("Bonjour ");
	}
	
}

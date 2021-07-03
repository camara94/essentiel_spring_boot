package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.LogService;



@Component
public class Console implements CommandLineRunner{
	private LogService logService;
	
	@Autowired
	public Console(LogService logService) {
		this.logService = logService;
	}

	@Override
	public void run(String... args) throws Exception {
		this.logService.tracer("Bonjour ");
	}
}

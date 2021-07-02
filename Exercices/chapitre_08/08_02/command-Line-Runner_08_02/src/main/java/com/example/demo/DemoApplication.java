package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoCommandLineRunner1.class);

	public static void main(String[] args) {
		logger.info("===== Début exécution main() ====");
		SpringApplication.run(DemoApplication.class, args);
		logger.info("===== Fin exécution main() ====");
	}

}

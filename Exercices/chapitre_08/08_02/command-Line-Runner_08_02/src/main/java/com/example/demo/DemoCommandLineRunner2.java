package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class DemoCommandLineRunner2 implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(DemoCommandLineRunner2.class);

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Dans la méthode run() de CommandLineRunner2");

    }
}

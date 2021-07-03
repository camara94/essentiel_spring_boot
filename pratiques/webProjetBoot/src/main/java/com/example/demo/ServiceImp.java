package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;



public class ServiceImp implements Service{
	
	Logger logger = LoggerFactory.getLogger(ServiceImp.class);
	
	@Autowired
	private LogProperties properties;

	@Override
	public void tracer(String message) {
		logger.trace(message + " " + properties.getNom());
	}

}

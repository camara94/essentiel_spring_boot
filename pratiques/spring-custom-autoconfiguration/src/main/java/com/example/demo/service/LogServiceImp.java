package com.example.demo.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogServiceImp implements LogService {
	
	Logger logger = LoggerFactory.getLogger(LogServiceImp.class);

	@Override
	public void tracer(String message) {
		logger.info("Trace affichée dans LogServiceImp : " + message);
	}

}

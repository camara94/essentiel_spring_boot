package com.linkedin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogServiceImp implements LogService {
	
	Logger logger = LoggerFactory.getLogger(LogServiceImp.class);

	@Override
	public void tracer(String message) {
		logger.info("Trace affichée dans LogServiceImp : " + message);

	}

}

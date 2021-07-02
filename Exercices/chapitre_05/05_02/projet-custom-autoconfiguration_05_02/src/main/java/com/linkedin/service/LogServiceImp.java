package com.linkedin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class LogServiceImp implements LogService {
	
	Logger logger = LoggerFactory.getLogger(LogServiceImp.class);
	
	@Autowired
	private LogProperties properties;

	@Override
	public void tracer(String message) {
		logger.info(this.properties.getPrefix() + " Trace affichée dans LogServiceImp : " + message
				+" "+this.properties.getSuffix());
	}

}

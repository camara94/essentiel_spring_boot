package com.example.demo.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class LogServiceImp implements LogService {
	
	Logger logger = LoggerFactory.getLogger(LogServiceImp.class);
	
	@Autowired
	private LogProperties proprieties;
	
	@Override
	public void tracer(String message) {
		logger.info("Trace affichée dans LogServiceImp : \n" + message + proprieties.getNom());
	}

}

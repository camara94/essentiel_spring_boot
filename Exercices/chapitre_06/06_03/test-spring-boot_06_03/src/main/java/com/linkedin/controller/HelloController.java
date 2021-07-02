package com.linkedin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkedin.HelloService;

@RestController
public class HelloController {
	
	private HelloService service;
	
	public HelloController(HelloService service) {
		this.service = service;
	}


	@GetMapping("/")
	public String hello() {
		return service.direBonjour();
	}


	public HelloService getService() {
		return service;
	}
	
	

}

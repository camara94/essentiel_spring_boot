package com.linkedin;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public HelloService() {
		
	}
	
	public String direBonjour() {
		return "Hello World";
	}

}

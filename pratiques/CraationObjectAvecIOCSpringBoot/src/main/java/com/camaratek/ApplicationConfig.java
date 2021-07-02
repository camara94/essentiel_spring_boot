package com.camaratek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Autowired
	private A a;
	
	@Autowired
	private B b;
	
	
	@Bean
	public A createA() {
		return new A();
	}
	
	@Bean
	public B createB() {
		return new B();
	}
	
	@Bean
	public C createC() {
		return new C(a, b);
	}
}

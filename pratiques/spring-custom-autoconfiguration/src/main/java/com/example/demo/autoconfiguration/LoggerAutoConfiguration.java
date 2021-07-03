package com.example.demo.autoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.LogService;
import com.example.demo.service.LogServiceImp;

@Configuration
@ConditionalOnClass(LogService.class)
public class LoggerAutoConfiguration {
	
	@Bean
	@ConditionalOnMissingBean
	public LogService logService() {
		return new LogServiceImp();
	}

}

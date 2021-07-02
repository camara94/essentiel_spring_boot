package com.linkedin.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.linkedin.service.LogService;
import com.linkedin.service.LogServiceImp;

@Configuration
@ConditionalOnClass(LogService.class)
public class LoggerAutoConfiguration {
	
	@Bean
	@ConditionalOnMissingBean
	public LogService logService() {
		return new LogServiceImp();
	}

}

package com.example.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.LogProperties;
import com.example.demo.Service;
import com.example.demo.ServiceImp;

@Configuration
@ConditionalOnClass(Service.class)
@EnableConfigurationProperties(LogProperties.class)
public class LogConfiguration {
	
	@Bean
	@ConditionalOnMissingBean
	public Service createService() {
		return new ServiceImp();
	}
}

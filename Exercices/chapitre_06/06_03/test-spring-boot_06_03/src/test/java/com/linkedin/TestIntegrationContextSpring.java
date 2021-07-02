package com.linkedin;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.linkedin.controller.HelloController;


@SpringBootTest
class TestIntegrationContextSpring {
	
	@Autowired
	private HelloController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
		assertThat(controller.getService()).isNotNull();
	}
	

}

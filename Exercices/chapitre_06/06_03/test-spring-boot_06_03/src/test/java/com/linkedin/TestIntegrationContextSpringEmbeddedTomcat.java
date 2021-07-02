package com.linkedin;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TestIntegrationContextSpringEmbeddedTomcat {
	
	@LocalServerPort
	private int  port;
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void hello_doit_retourner_hello_world() {
	String	response = this.restTemplate.getForObject("http://localhost:" + port + "/",
				String.class);
	assertEquals(response, "Hello World");
	}
   
}

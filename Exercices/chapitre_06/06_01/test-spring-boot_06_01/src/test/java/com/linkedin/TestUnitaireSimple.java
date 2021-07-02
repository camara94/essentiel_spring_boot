package com.linkedin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class TestUnitaireSimple {
	
	
	@Test
	public void return_helloworld_when_get_hello() {
		HelloService homeService = new HelloService();
		HelloController controller = new HelloController(homeService);
		String message = controller.hello();
		assertEquals(message, "Hello World");
		
	}

}

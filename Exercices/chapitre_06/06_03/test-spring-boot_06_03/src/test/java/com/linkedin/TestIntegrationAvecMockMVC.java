package com.linkedin;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;



@SpringBootTest
@AutoConfigureMockMvc
class TestIntegrationAvecMockMVC {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	void hello_doit_retourner_hello_world() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).
		andExpect(jsonPath("$").value("Hello World"));
	}
	

}

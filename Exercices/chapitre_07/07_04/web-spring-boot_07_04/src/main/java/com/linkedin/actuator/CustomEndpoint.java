package com.linkedin.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="exemple")
public class CustomEndpoint {
	
   @ReadOperation
   public ExempleEndpoint getExempleEndpoint() {
	   ExempleEndpoint exempleEndpoint = new ExempleEndpoint();
	   exempleEndpoint.message = "Mon nouvel actuator";
	   return exempleEndpoint;
   }
	
	
	
	public class ExempleEndpoint {
		private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

}

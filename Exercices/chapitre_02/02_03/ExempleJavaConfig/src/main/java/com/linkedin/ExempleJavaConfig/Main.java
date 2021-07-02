package com.linkedin.ExempleJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main 
{
    public static void main( String[] args )
    {
      ApplicationContext contexte = new AnnotationConfigApplicationContext(ApplicationConfig.class);
      

      
    }
}

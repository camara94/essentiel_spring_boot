package com.linkedin.ExempleJavaConfig;

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
 public A a() {
    return new A();
  }
  
  @Bean
  public B b() {
    return new B();
  }
  
  @Bean
  public C c() {
    return new C(a, b);
  }

}

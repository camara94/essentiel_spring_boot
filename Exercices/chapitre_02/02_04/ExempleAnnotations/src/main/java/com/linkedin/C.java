package com.linkedin;

import org.springframework.stereotype.Repository;

@Repository
public class C {

  public C(A a, B b) {
    System.out.println("Creation C");
  }
  
  

}

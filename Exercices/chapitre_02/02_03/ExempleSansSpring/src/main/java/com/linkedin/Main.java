package com.linkedin;


public class Main {

  public static void main(String[] args) throws Exception {  
    
    A a = new A();
    B b = new B();
    new C(a, b);
  
  }

}

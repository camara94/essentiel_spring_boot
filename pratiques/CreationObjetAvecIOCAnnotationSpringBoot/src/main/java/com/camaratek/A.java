package com.camaratek;

import org.springframework.stereotype.Component;

@Component
public class A {
	public A() {
		System.out.println( "Création d'Objet avec spring IOC Annotation A" );
	}
}

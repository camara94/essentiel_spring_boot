package com.camaratek;

import org.springframework.stereotype.Repository;

@Repository
public class C {
	public C(A a, B b) {
		System.out.println( "Cr�ation d'Objet avec spring IOC Annotation C" );
	}
}

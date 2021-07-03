package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("log")
public class LogProperties {
	private String nom;
	private String prenom;
	private String age;
	private String status;
	private String niveau;
	private String universite;
	private String ville;
	private String pays;
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getUniversite() {
		return universite;
	}

	public void setUniversite(String universite) {
		this.universite = universite;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	/*@Override
	public String toString( ) {
		return "Je suis " + this.nom + " " + this.prenom + "\n" +
			   this.status + " " + this.niveau + " à l'"+
			   this.universite + "\net j'habite à " + this.ville + " en " +
			   this.pays;
	}*/
	
	
}

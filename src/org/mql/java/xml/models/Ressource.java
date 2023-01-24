package org.mql.java.xml.models;

public class Ressource {
	private String nom;

	public Ressource() {
		super();
	}

	public Ressource(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Ressource [nom=" + nom + "]";
	}
}

package org.mql.java.xml.dom;

import java.util.Vector;

import org.mql.java.xml.models.Ressource;

public class RacinFile {
	private String chemin; 
	private Vector<Ressource> ressources;
	public RacinFile() {
		super();
	}
	public RacinFile(String chemin, Vector<Ressource> ressources) {
		super();
		this.chemin = chemin;
		this.ressources = ressources;
	}
	public String getChemin() {
		return chemin;
	}
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}
	public Vector<Ressource> getRessources() {
		return ressources;
	}
	public void setRessources(Vector<Ressource> ressources) {
		this.ressources = ressources;
	}
	@Override
	public String toString() {
		return "RacinFile [chemin=" + chemin + ", ressources=" + ressources + "]";
	}
	
	public void addRessource(Ressource ressource) {
		ressources.add(ressource);
	}
}

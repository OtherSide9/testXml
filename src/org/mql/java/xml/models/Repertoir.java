package org.mql.java.xml.models;

import java.util.Vector;

public class Repertoir extends Ressource{
	private Vector<Ressource> ressources;
	public Repertoir(String name) {
		super(name);
		setRessources(new Vector<>());
	}
	public Vector<Ressource> getRessources() {
		return ressources;
	}
	public void setRessources(Vector<Ressource> ressources) {
		this.ressources = ressources;
	}
	public void addRessource(Ressource ressource) {
		ressources.add(ressource);
	}
	@Override
	public String toString() {
		return "Repertoir [ressources=" + ressources + "]";
	}


}

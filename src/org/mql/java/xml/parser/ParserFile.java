package org.mql.java.xml.parser;

import java.io.File;
import java.util.Vector;

import org.mql.java.dao.LinkedList;

public class ParserFile {
	
	private String chemin; 
	private LinkedList<String> list;
	public ParserFile(String chemin,String arbre) {
		list=new LinkedList<>();
		File f=new File(chemin);
		if(f.isDirectory())list.setFile(false);
		else list.setFile(true);
		File [] lf=f.listFiles();
		if(lf!=null) {
		for(File fich:lf) {
			if(fich.getName().charAt(0)!='.') {
			if(fich.isDirectory()) {
				
				list.add(fich.getName(),false);
				System.out.println(arbre+fich.getName());
				ParserFile pf=new ParserFile(fich.getAbsolutePath(),arbre+arbre);
				LinkedList<String> le=list.lastItem();
				le.setSousList(pf.getList());
			}
			else {
				
				System.out.println(arbre+fich.getName());
				list.add(fich.getName(),true);
			}
			}
		}
		}
	}
	public LinkedList<String> getList() {
		return list;
	}
	public void setList(LinkedList<String> list) {
		this.list = list;
	}
	
	

}

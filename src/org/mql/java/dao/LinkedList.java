package org.mql.java.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LinkedList<T> implements List<T> {
	private T value;
	private LinkedList<T> next;
	private LinkedList<T> sousList;
	private boolean file;
	public static int counter = 0;

	public LinkedList() {
		value = null;
		next = null;
		setSousList(null);
	}

	public LinkedList(T value, boolean b) {
		this.value = value;
		next = null;
		file=b;
		setSousList(null);
	}

	public void add(T item, boolean b) {
		if (isEmpty()) {value = item;file=b;}
		else if (next == null) next = new LinkedList<T>(item,b);
		else next.add(item,b);
	}


	public T get(int index) {
		counter++;
		if (index == 0) return value;
		else if (next != null) return next.get(index - 1);
		else return null;
	}

	public int size() {
		System.out.println("size");
		if (isEmpty()) return 0;
		else if (next == null) return 1;
		else return next.size() + 1;
	}
	public LinkedList<T> lastItem() {
		
		if (isEmpty()) return null;
		else if (next == null) return this;
		else return next.lastItem();
	}

	public T remove(int index) {
		if (isEmpty()) return null;
		if (index == 0) {
			T removed = value;
			if (next == null) {
				value = null;
			}
			else {
				value = next.value;
				next = next.next;
			}
			return removed;
		}
		else if (index == 1) {
			if (next == null) return null;
			T removed = next.value;
			next = next.next;
			return removed;
		}
		else if (next != null) return next.remove(index - 1);
		else return null;
	}

	public boolean isEmpty() {
		return (value == null && next == null);
	}

	public LinkedList<T> getSousList() {
		return sousList;
	}

	public void setSousList(LinkedList<T> sousList) {
		this.sousList = sousList;
	}

	public void affiche(String arbre) {
		// TODO Auto-generated method stub
		if (isEmpty()) return ;
		else if (next == null) {
			System.out.println(arbre+value);
			if(sousList!=null)sousList.affiche(arbre+arbre);
		}
		else {
			System.out.println(arbre+value);
			if(sousList!=null)sousList.affiche(arbre+arbre);
			 next.affiche(arbre);
		}
	}
	public String toXML(String arbre) {
		// TODO Auto-generated method stub
		if (isEmpty()) return "";
		else if (next == null) {
			if(file==true) {
				String s=arbre+"<File>"+value+"</File>\n";
				return s;
			}else {
			String s=arbre+"<"+value+">\n";
			
			if(sousList!=null)s+=sousList.toXML("\t"+arbre);
			s+=arbre+"</"+value+">\n";
			return s;
			}
		}
		else {
			if(file==true) {
				String s=arbre+"<File>"+value+"</File>\n";
				return s+=next.toXML(arbre);
			}else {
			String s="";
			s+=arbre+"<"+value+">\n";
			if(sousList!=null)s+=sousList.toXML("\t"+arbre);
			s+=arbre+"</"+value+">\n";
			 s+=next.toXML(arbre);
			 return s;
			}
		}
	}
	public void toFileXML(String fileName) throws IOException {
		File f=new File("c:\\xml\\fichxml.xml");
		String s=toXML("");
		FileWriter fw=new FileWriter(f);
		fw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		fw.write("<Arbre>\n");
		fw.write(s);
		fw.write("</Arbre>\n");
		fw.close();
	}

	public boolean isFile() {
		return file;
	}

	public void setFile(boolean file) {
		this.file = file;
	}

	
}

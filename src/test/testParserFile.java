package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.mql.java.dao.LinkedList;
import org.mql.java.xml.parser.ParserFile;

public class testParserFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ParserFile pf=new ParserFile("C:\\Java\\JDBC-Java\\","-");
		LinkedList<String> list=pf.getList();
		System.out.println("********************");
		list.affiche("-");
		System.out.println("********************");
		list.toFileXML("c:\\xml\\fichxml.xml");
	
		
		
	}

}

package Archivos;

import java.io.*;

public class FileModifier {

		/*
		 * Ejercicio 1
		 */
	public static void readFile(String filename) {
		
	
		try{
			FileInputStream fis = new FileInputStream(filename);
			PrintStream ps = new PrintStream(filename);
			FileReader fr = new FileReader(filename);
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		
		readFile("textfile.txt");
	
	}



}

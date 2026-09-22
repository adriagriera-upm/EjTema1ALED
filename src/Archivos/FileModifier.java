package Archivos;

import java.io.*;
import java.util.Scanner;

public class FileModifier {

	/*
	 * Ejercicio 1
	 */
	public static void readFile(String filename) {
		
	
		try{
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String linea;
			while ((linea =br.readLine()) != null) {
			    System.out.println(linea);
			}
			br.close();
	
			
		} catch (Exception e) {
			System.out.println("Archivo no detectado");
		}
	}
	
	public static void saveFloatArray(String filename, float[] newfloat) {
	    try{
	    	BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
	        for (float f : newfloat) {
	            bw.write(Float.toString(f));
	            bw.write(", ");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
		
	public static void main(String[] args) {
		/*
		 *Ejercicio 1 y 2
		 */
		float[] newf = {1,3,4,6,63,13,5,32,4};
		saveFloatArray("textfile.txt",newf);
		readFile("textfile.txt");
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
	
	}
	



}

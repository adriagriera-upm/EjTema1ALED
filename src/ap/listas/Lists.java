package ap.listas;

import java.util.*;

public class Lists {
	
	public static void main(String[] args) {
	
	/*
	 * Ejercicio 1
	 */
	Scanner sc = new Scanner(System.in);
	Set<Measurement> measurements = new HashSet<Measurement>();
	try {
		for(int j=0; j<2;j++) {
			float[] channels = new float[4];
			for(int i=0; i<4;i++) {
				channels[i]=sc.nextFloat();
			}
			measurements.add(new Measurement(channels));
		}
		sc.close();
	
	}catch(Exception e){
		System.out.println("Las muestras no pueden ser iguales");
	}
	
	
	
	
	}
}
	


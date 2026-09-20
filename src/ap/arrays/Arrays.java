package ap.arrays;

import java.math.*;

public class Arrays {
	
	/*
	 * Ejercicio 21
	 */
	public static int outliersCounter(float[] array) {
		double average = 0;
		for(int i=0; i<array.length;i++) {
			average+=array[i];
		}
		average = average/array.length;
		double dev = 0;
		for(int j=0; j<array.length;j++) {
			dev+=Math.pow(average-array[j], 2)/array.length;
		}
		dev=Math.sqrt(dev);
		int outliernum = 0;
		for(int k=0;k<array.length;k++){
			if(array[k] > dev+2) {
				outliernum++;
			}
		}
		return outliernum;
	}
	
	/*
	 * Ejercicio 18
	 */
	public static float[] ventanaDeslizante(float[] array, int tamventana) {
		float average = 0;
		float[] newarray = new float[array.length-tamventana-1];
		int contador = 0;
		for(int i=0; i<array.length;i++) {
			if((i+1)%tamventana==0) { //Caso reinicia ventana
				average+= array[i];
				newarray[contador]=average/tamventana;
				average = 0;
				contador++;
			} else {
				average+= array[i];	
			}	
		}
		return newarray;
	}
	
	/*
	 * Ejercicio 19
	 */
	public static int[] Subsample(int[] sample, int sslevel){
		int contador = 0;
		if((sslevel+sample.length)%2 == 0) {
			int[] newsample1 = new int[sample.length/sslevel];
				for(int i=0; i<sample.length;i++) {
					if((i+1)%sslevel == 1) {
						newsample1[contador]=sample[i];
						contador++;
					} 
				
				}
				return newsample1;	
		} else {
			int[] newsample2 = new int[(sample.length+1)/sslevel];
				for(int i=0; i<sample.length;i++) {
					if((i+1)%sslevel == 1) {
						newsample2[contador]=sample[i];
						contador++;
					}
				}
			return newsample2;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * Ejercicio 18
		 */
		float[] array2 = {2,4,8,2,6,0,7,1};
		float[] array3 = ventanaDeslizante(array2,2);
		
		/*
		 * Ejercicio 19
		 */
		int[] array4 = {2,4,8,2,6,0,7,1};
		array4 = Subsample(array4,2);
		
		/*
		 * Ejercicio 21
		 */
		float[] array = {1,3,7,34,8,6,16};
		System.out.println(outliersCounter(array));
		
		/*
		 * Ejercicio 3
		 */
		int[] mod16 = new int[300];
		for(int i=0; i<mod16.length;i++) {
			mod16[i]= (i+1)%16;
		}
		
		/*
		 * Ejercicio 4
		 */
		char[] mod16v2 = new char[300];
		for(int i=0; i<mod16.length;i++) {
			if((i+1)%16 >= 10) {
				mod16v2[i]= Character.forDigit((i+1)%16, 16);
				mod16v2[i]=Character.toUpperCase(mod16v2[i]);
			} else {
			
			mod16v2[i]= Character.forDigit((i+1)%16,10);
			}
		}
		
		
		/*
		 * Ejercicio 6
		 */
		float[][] floatmatrix = {{1,2,3},
								 {4,5,6},
								 {7,8,9}};
		float[] valormax = new float[floatmatrix.length];
			for(int i=0;i<floatmatrix.length;i++) {
				for(int j=0;j<floatmatrix[i].length;j++) {
					if(floatmatrix[i][j] >= valormax[i]) {
					valormax[i]=floatmatrix[i][j];
					}
				}
		
			}
		}
}

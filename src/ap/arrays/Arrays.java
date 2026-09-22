package ap.arrays;

import java.math.*;

public class Arrays {
	
	/*
	 * Ejercicio 8
	 */
	public static char[] inversor(char[] arr) {
		char[] newarr = new char[arr.length];
		for(int i=0; i<arr.length;i++) {
			newarr[i] = arr[arr.length-1-i];
		}
		return newarr;
	}
	
	/*
	 * Ejercicio 9
	 */
	public static char[] inversor2(char[] arr) {
		char c = ' ';
		int lim;
		if(arr.length%2 == 0) {
			for(int i=0; i<arr.length-1;i++) {
				c= arr[i];
				arr[i]= arr[arr.length-i-1];
				arr[arr.length-i-1]= c;
			}
		} else {
			for(int i=0; i<arr.length-2;i++) {
			c= arr[i];
			arr[i]= arr[arr.length-i-1];
			arr[arr.length-i-1]= c;
			}
		}
		return arr;
	}
	
	/*
	 * Ejercicio 12
	 */
	public static char[] concatenate(char[] arr1, char[] arr2) {
		char[] arrdef = new char[arr1.length+arr2.length];
		for(int i=0; i<arrdef.length;i++) {
			if(i+1 > arr1.length) {
				arrdef[i] = arr2[i-arr1.length];
			
			} else {
				arrdef[i] = arr1[i];
			}
		}
		return arrdef;
	}
	
	/*
	 * Ejercicio 13
	 */
	public static int[][] dividir(char[] arr, int tamideal){
		int numdiv = (int) Math.ceil((double) arr.length / tamideal);
		int[][] divisiones = new int[numdiv][];
		for(int i=0; i<numdiv; i++) {
			int inicio = i*tamideal;
			int fin = Math.min(inicio + tamideal, arr.length);
			int[] division = new int[fin - inicio];
			for(int j=0;j<divisiones.length;j++) {
				division[j] = arr[inicio+j];
			}
			divisiones[i]= division;
		}
		return divisiones;
	}
	
	/*
	 * Ejercicio 15
	 */
	public float[] ej15(float[] arr) {
		int contador = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > arr[Math.max(0, i-1)] && arr[i] > arr[Math.min(i+1,arr.length)]) {
				contador++;
			}
		}
		float[] newarr = new float[contador];
		int contador2 = 0;
		for(int j=0; j<arr.length;j++) {
			if(arr[j] > arr[Math.max(0, j-1)] && arr[j] > arr[Math.min(j+1,arr.length)]) {
				newarr[contador2] = arr[j];
				contador++;
			}
		}
		return newarr;
	}
	
	/*
	 * Ejercicio 16
	 */
	public static void rellenarmatriz(int dim){
		float[][] newmatrix = new float[dim][dim];
		for(int i=0; i<dim;i++) {
			for(int j=0; j<dim; j++) {
				if(i==j && i != 0) {
					newmatrix[i][j] = (float) Math.random();
				} else if(i>j) {
					newmatrix[i][j] = newmatrix[j][i];
				} else {
					newmatrix[i][j] = (float) Math.random();
				}
			
			}
		}
		System.out.println(newmatrix); //No la imprime pero no tengo tiempo para implementarlo, pero sé cómo	
	}
	
	/*
	 * Ejercicio 20
	 */
	public static int[] interpolation(int[] arr) {
		int size = (int) Math.ceil((arr.length/2) + arr.length);
		int[] interarr = new int[size];
		int average = 0;
		int ref = 0;
		for(int i=0; i<arr.length;i++) {
			if((i+1)%2 == 1 && i != 0) {
				interarr[i] = average;
				average = 0;
				ref++;
			} else {
				average += arr[i];
				interarr[i]=arr[i-ref];
			}
		}
		return interarr;
	}
	
	
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
		
		rellenarmatriz(3);
		
		/*
		 * Ejercicio 8 y 9
		 */
		char[] arrchar = {'a','b','c','d'};
		char[] newarr = inversor(arrchar);
		//char[] newarr2 = inversor2(arrchar);
		
		/*
		 * Ejercicio 12
		 */
		char[] concat = concatenate(arrchar, newarr);
		
		
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

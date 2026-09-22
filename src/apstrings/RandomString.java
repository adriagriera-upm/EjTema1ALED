package apstrings;

import java.util.*;

public class RandomString {

	/*
	 * Ejercicio 2
	 */
	public static int veceschar(char c, String s) {
		char[] arr = s.toCharArray();
		int contador = 0;
		for(char c1 : arr) {
			if(c1 == c) {
				contador++;
			}
		}
		return contador;
	}
		
	/*
	 * Ejercicio 5
	 */
	public static int vecesstring(String det, String s) {
		char[] detarr = det.toCharArray();
		char[] s1 = s.toCharArray();
		int veces = 0;
		int index = 0;
		for(int i=0; i<detarr.length;i++) {
			if(detarr[i] == s1[index]) {
				index++;
			} else if(detarr[i] == s1[index] && index==s1.length){
				veces++;
				index = 0;
			}
		}
		return veces;	
	}
	
	/*
	 * Ejercicio 7
	 */
	public static boolean isDecimal(String s) {
	    char[] s1 = s.toCharArray();
	    int contadorcomas = 0;
	    int contadorpuntos = 0;
	    
	    for (char c : s1) {
	        switch (c) {
	            case ',':
	                contadorcomas++;
	                break;
	            case '.':
	                contadorpuntos++;
	                break;
	            default:
	                if (!Character.isDigit(c)) {
	                    return false;
	                }
	                break;
	        }
	    }
	    
	    return ((contadorpuntos == 1 && contadorcomas == 0) || (contadorpuntos == 0 && contadorcomas == 1));
	}
	
	
	/*
	 * Ej 10
	 */
	public static boolean isPalindrome(String secuencia) {
		String nospace = secuencia.replace(" ", "");
		String reversed = new StringBuilder(nospace).reverse().toString();
		System.out.println(reversed);
		System.out.println(nospace);
		return (nospace.equals(reversed));
	}
	
	public static void main(String[] args){
		
		/*
		 * Ej 1
		 */
		String s = "0 es la nota que voy a sacar";
		char[] carr = s.toCharArray();
		for(char c : carr ) {
			if(Character.isDigit(c)) {
				System.out.println(c);
				break;
			}
		}
		/*
		 * Ej 10
		 */
		System.out.println(RandomString.isPalindrome("dabale arroz a la zorra el abad"));
		
		/*
		 * Ejercicio 3
		 */
		String space = "Adiós        ";
		System.out.println(space.trim());
		
		/*
		 * Ejercicio 4
		 */
		String s1 = "hola";
		String s2 = s1.toUpperCase();
		String s3 = s2.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		/*
		 * Ejercicio 9
		 */
		String scad = "jorge";
		String alreves = new StringBuilder(scad).reverse().toString();
		System.out.println(alreves);
		
	}

	
}
	
	

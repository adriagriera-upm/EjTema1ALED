package apstrings;

import java.util.*;

public class RandomString {

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
		System.out.println(RandomString.isPalindrome("dabale arroz a la zorra el abad"));
		
	
	}

	
}
	
	

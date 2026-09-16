package apstrings.repaso;
import java.util.*;

public class RandomString {
	
	/*
	 * Ej 10
	 */
	
	public static boolean isPalindrome(String secuencia) {
		String s1 = secuencia.substring(0,secuencia.length()/2);
		String s2 = secuencia.substring(secuencia.length()/2);
		List sec2 = new ArrayList<>();
		for(int i=0;i<s2.length();i++) {
			sec2.add(s2.indexOf(s2.length()-i));
		//TODO completar método ej 10
		return true;
		}
		
		
		
		
		
	}
	


	



}



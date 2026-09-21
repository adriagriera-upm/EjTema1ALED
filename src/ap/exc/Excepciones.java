package ap.exc;

public class Excepciones {
	
	/*
	 * Ejercicio 1
	 */
	public float[] conversor(String[] arr) {
		
		try {
			float[] newarr = new float[arr.length];
			for(int i=0; i<arr.length;i++) {
				newarr[i]= (float) Integer.parseInt(arr[i]);
				}
			return newarr;
		
		} catch(Exception e) {
			System.out.println("Algún valor del array no es válido");
			return null;
		}
	}
	
	/*
	 * Ejercicio 2
	 */
	
}

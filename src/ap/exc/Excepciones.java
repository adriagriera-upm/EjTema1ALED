package ap.exc;

public class Excepciones {
	
	/*
	 * Ejercicio 1
	 */
	public static float[] conversor(String[] arr) {
		
		try {
			float[] newarr = new float[arr.length];
			for(int i=0; i<arr.length;i++) {
				newarr[i]= (float) Integer.parseInt(arr[i]);
				}
			return newarr;
		
		} catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Algún valor del array no es válido");
			return null;
		} finally {
			
		}
	}
	
	public static void main(String[] args) {
			try{
				String[] arr = {"2","3","453","562","5","as"};
				float[] newarr = conversor(arr);
			} finally {
				System.out.println("Lo siento mucho, tendría que repetir FPRG");
			}
			
			
	
		
		
	}
	/*
	 * Ejercicio 5
	 */
	
	
}

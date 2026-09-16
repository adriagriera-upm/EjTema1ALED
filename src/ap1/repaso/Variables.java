package ap1.repaso;

public class Variables {
	public static void main(String[] args) {
		
		/**
		 * Ej 1
		 */
		short diasAno=365;
		char horaDias=24;
		char minporHora=60;
		char segMin=minporHora;
		
		int segAno=diasAno*horaDias*minporHora*segMin;
		
		System.out.println(segAno);
		
		/**
		 * Ej 3
		 */
		int suma=0;
		int contador=0;
		for(int i=1;i<101;i++) {
			if(i%5==0) {
				suma+= i;
				contador++;
				System.out.println("Múltiplo de 5 número " + contador + ": " + i);
				}
				
			}
		System.out.println(suma);
		
	
	}
	
		
}


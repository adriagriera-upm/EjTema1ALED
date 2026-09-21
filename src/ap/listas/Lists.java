package ap.listas;

import java.util.*;

public class Lists {
	
	/*
	 * Ejercicio 14 arrays
	 */
	public static List<Float> normlist(List<Float> lista){
		float valormax = -1;
		for(int i =0; i<lista.size();i++) {
			if(Math.abs(lista.get(i)) >= Math.abs(valormax)) {
				valormax = Math.abs(lista.get(i));
			}
		}
		List<Float> newlist = new ArrayList<Float>();
		for(int j=0; j<lista.size();j++) {
			newlist.add(lista.get(j)/valormax);
		}
		return newlist;
	}
	
	/*
	 * Ejercicio 17
	 */
	public static List<Float> umbral(List<Float> lista, float umbral){
		List<Float> newlista = new ArrayList<Float>();
		for(float valor : lista) {
			if(valor<=umbral) {
				newlista.add(valor);
			}
		}
		return newlista;	
	}
	
	
	
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
	
	/*
	 * Ejercicio 14 arrays
	 */
	List<Float> lista = new ArrayList<Float>();
	for(float i = 0; i<14; i+=2) {
		lista.add(i);
	}
	lista.add((float) -34);
	List<Float> listanorm = normlist(lista);
	System.out.println(listanorm);
	
	/*
	 * Ejercicio 17 arrays
	 */
	List<Float> lista2 = lista;
	List<Float> listaumbral= umbral(lista2,6);
	System.out.println(listaumbral);
	
	}
}
	


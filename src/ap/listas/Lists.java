package ap.listas;

import java.util.*;

public class Lists {
	
	
	/*
	 * Ej 6
	 */
	public static Measurement[] toArray(Set<Measurement> m) {
		
		Measurement[] marr = new Measurement[m.size()];
		int i = 0;
		for(Measurement m1 : m) {
			marr[i]= m1;
			i++;
		}
		return marr;
	}
	
	/*
	 * Ej 7
	 */
	public static Set<Measurement> combSet(Set<Measurement> m1, Set<Measurement> m2){
		Set<Measurement> combSet = new HashSet<Measurement>();		
		for(Measurement m : m1) {
			combSet.add(m);
		}
		for(Measurement me : m2) {
			combSet.add(me);
		}
		return combSet;
	}
	
	/*
	 *Ej 8
	 */
	public static Set<Measurement> eliminaFloats(Set<Measurement> set){
		Set<Measurement> newset = new HashSet<Measurement>();
		for(Measurement m : set) {
			Set<Float> channels = new HashSet<Float>();
			for(int i=0; i<m.numChannels();i++){
				channels.add(m.getChannel(i));
			}
			List<Float> newch = new ArrayList<Float>(channels);
			Measurement m1 = new Measurement(newch);
			newset.add(m1);
		}
		return newset;
	}
	
	/*
	 * Ej 4 y 5 modificando una de las líneas (hice el 3 sin darme cuenta xd)
	 */
	public static Set<Measurement>  entredos(Set<Measurement> listam){
		Scanner sc = new Scanner(System.in);
		float min = sc.nextFloat();
		float max = sc.nextFloat();
		try {
			Set<Measurement> newset = new HashSet<Measurement>();
			for(Measurement m : listam) {
				for(int i = 0; i<m.numChannels();i++) {
					if(m.getChannel(i) > min && m.getChannel(i) < max) {
						listam.remove(m);
					}
				}
			}
			return listam;
		} catch(Exception e){
			System.out.println("Valores min y max no válidos");
			return null;
		}	
	}
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
	
	
	
	
/*
 * MAIN
 */
	
	public static void main(String[] args) {
		
		
		
		List<Float> l = new ArrayList<Float>();
		int i = 0;
		while(i< 10) {
			l.add((float) Math.random());
			i++;
		}
		
		Measurement m = new Measurement(l);
		String c = m.toString();
		System.out.println(c);
	/*
	 * Ejercicio 1
	 */
	Scanner sc = new Scanner(System.in);
	Set<Measurement> measurements = new HashSet<Measurement>();
	try {
		for(int j=0; j<2;j++) {
			List<Float> channels = new ArrayList<Float>();
			for(int j1=0; j1<4;j1++) {
				channels.add(j1, sc.nextFloat());
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
	for(float j = 0; i<14; i+=2) {
		lista.add(j);
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

	


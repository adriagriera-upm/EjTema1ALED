package ap5.repaso;

import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Ejercicio 1
		 */
		Punto3D p1 = new Punto3D(12,13,18);
		Punto3D p2 = new Punto3D(8,14,0);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		/*
		 * Ejercicio 2
		 */
		MyDate hoy = new MyDate(19,9,2025);
		System.out.println(hoy.toString());
		hoy.setYear(2026);
		System.out.println(hoy.toString());
		
		/*
		 * Ejercicio 5
		 */
		List<Empleado> empresa = new ArrayList<>();
		
		int numjefes=2;
		int numempleados=15;
		int numviajantes=5;
		
		for(int i=0;i<numjefes;i++) {
			empresa.add(new Jefe());
			System.out.println("El salario del jefe número " + (i+1) + " es " + empresa.get(i).calcularyMostrarSalario());
		}
		
		for(int j=0;j<numempleados;j++) {
			empresa.add(new Empleado());
			System.out.println("El salario del empleado número " + (j+1) + " es " + empresa.get(j+numjefes).calcularyMostrarSalario());
			
		}
		
		for(int k=0;k<numviajantes;k++) {
			empresa.add(new Viajante());
			System.out.println("El salario del viajante número " + (k+1) + " es " + empresa.get(k+numjefes+numempleados).calcularyMostrarSalario());
			
		}
	}
}

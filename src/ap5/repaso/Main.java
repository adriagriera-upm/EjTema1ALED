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
		MyDate hoy;
		try {
			hoy = new MyDate(31,2,2025);
			System.out.println(hoy.toString());
			hoy.setYear(2026);
			System.out.println(hoy.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
		
		/*
		 *Ejercicio 6
		 */
		List<CuentaBancaria> listaCuentas = new ArrayList<CuentaBancaria>();
		
		CuentaBancaria cuentaNormal = new CuentaBancaria("Jorgina",20261206,67,2342);
		CuentaPlazoFijo cuentaFija = new CuentaPlazoFijo("Carlangos",20252203,42,536,20302203);
		CuentaVIP cuentaVIP = new CuentaVIP("Albania",20262301,80,5540,-200);
		try {
			cuentaNormal.retirarDinero(20);
			cuentaFija.transferenciaCuenta(25, cuentaNormal);
			cuentaVIP.retirarDinero(5600);
			cuentaNormal.ingresarDinero(400);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		listaCuentas.add(cuentaNormal);
		listaCuentas.add(cuentaFija);
		listaCuentas.add(cuentaVIP);
		
		
		

	}
}

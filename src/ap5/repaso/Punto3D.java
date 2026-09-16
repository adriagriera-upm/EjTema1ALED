package ap5.repaso;

public class Punto3D {
		
	
	//Aunque los ejemplos de puntos sean enteros, se usan doubles como atributo porque las coordenadas reales no suelen serlo
	private double coordX;
	private double coordY;
	private double coordZ;
	
	public Punto3D() {
		this.coordX=0;
		this.coordY=0;
		this.coordZ=0;
	}
	
	public Punto3D(double coordX, double coordY, double coordZ) {
		this.coordX=coordX;
		this.coordY=coordY;
		this.coordZ=coordZ;
		
	}
	
	public String toString() {
		
		String info = "Las coordenadas de este punto son: (" + coordX + "," + coordY + "," + coordZ + ")";
		return info;
	}
	
	
	

	


}

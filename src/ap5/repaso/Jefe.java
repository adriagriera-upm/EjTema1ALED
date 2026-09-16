package ap5.repaso;


public class Jefe extends Empleado {
	
	private int sueldoBase=1000;
	private int antiguedad;
	
	@Override
	public int calcularyMostrarSalario(){
		double random = Math.random()*10;
		antiguedad= (int) random;
		return (sueldoBase+500*this.antiguedad);
	}
	

	
}

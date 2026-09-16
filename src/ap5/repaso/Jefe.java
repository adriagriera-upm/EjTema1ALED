package ap5.repaso;


public class Jefe extends Empleado {
	
	private int sueldoBase=1000;
	private int antiguedad;
	
	@Override
	public int calcularyMostrarSalario(){
		this.antiguedad = (int) Math.random()*10;
		return (sueldoBase+500*this.antiguedad);
	}
	

	
}

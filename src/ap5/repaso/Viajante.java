package ap5.repaso;

public class Viajante extends Empleado{
	
	private int sueldoBase=1000;
	private int numViajes;
	
	@Override
	public int calcularyMostrarSalario(){
		double random = Math.random()*10;
		numViajes= (int) random;
		return (this.sueldoBase+300*this.numViajes);
	}
	
	

}

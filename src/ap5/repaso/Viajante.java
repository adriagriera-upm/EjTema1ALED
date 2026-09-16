package ap5.repaso;

public class Viajante extends Empleado{
	
	private int sueldoBase=1000;
	private int numViajes;
	
	@Override
	public int calcularyMostrarSalario(){
		this.numViajes= (int) Math.random()*10;
		return (this.sueldoBase+300*this.numViajes);
	}
	
	

}

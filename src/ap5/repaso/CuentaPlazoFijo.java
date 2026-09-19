package ap5.repaso;

public class CuentaPlazoFijo extends CuentaBancaria{

	private int fechaVencimiento;
	
	
	public CuentaPlazoFijo(String titular, int fechaApertura, int numeroCuenta, float saldo, int fechaVencimiento) {
		super(titular, fechaApertura, numeroCuenta, saldo);
		this.fechaVencimiento=fechaVencimiento;
	}
	
	public void retirarDinero(int dineroRetirado, int fechaActual) throws Exception {
		if(dineroRetirado > this.saldo) {
			throw new Exception("El dinero que se quiere retirar es mayor que el saldo en la cuenta.");
		} else if(fechaActual > fechaVencimiento){
			throw new Exception("Tarjeta caducada");
		}
		
		else {
			this.saldo = (float) (this.saldo-(1.05*dineroRetirado));	
		}
	}
	
	public void ingresarDinero(int dineroIngresado) {
		this.saldo += dineroIngresado;
	}
	
	public void transferenciaCuenta(int dineroTransferido, CuentaBancaria cuentaTransferida) throws Exception {
		if(dineroTransferido > this.saldo) {
			throw new Exception("El dinero que se quiere transferir es mayor que el que se tiene en la cuenta.");
		}
		
		this.saldo = this.saldo-dineroTransferido;
		cuentaTransferida.saldo += dineroTransferido;
	}

}

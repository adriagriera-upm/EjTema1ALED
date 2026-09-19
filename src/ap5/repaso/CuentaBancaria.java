package ap5.repaso;

public class CuentaBancaria {
	
	private String titular;
	private int fechaApertura;
	private int numeroCuenta;
	protected float saldo;
	
	public CuentaBancaria(String titular, int fechaApertura, int numeroCuenta, float saldo) {
		this.titular=titular;
		this.fechaApertura=fechaApertura;
		this.numeroCuenta=numeroCuenta;
		this.saldo=saldo;
		
	}
	
	public void retirarDinero(int dineroRetirado) throws Exception {
		if(dineroRetirado > saldo) {
			throw new Exception("El dinero que se quiere retirar es mayor que el saldo en la cuenta.");
		} else {
			saldo = saldo-dineroRetirado;	
		}
	}
	
	public void ingresarDinero(int dineroIngresado) {
		saldo += dineroIngresado;
	}
	
	public void transferenciaCuenta(int dineroTransferido, CuentaBancaria cuentaTransferida) throws Exception {
		if(dineroTransferido > saldo) {
			throw new Exception("El dinero que se quiere transferir es mayor que el que se tiene en la cuenta.");
		}
		
		this.saldo = saldo-dineroTransferido;
		cuentaTransferida.saldo += dineroTransferido;
	}
	

}

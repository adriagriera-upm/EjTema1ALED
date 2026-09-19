package ap5.repaso;

public class CuentaVIP extends CuentaBancaria {
	
	private float maxsaldonegativo;

	public CuentaVIP(String titular, int fechaApertura, int numeroCuenta, float saldo, float maxsaldonegativo) {
		super(titular, fechaApertura, numeroCuenta, saldo);
		this.maxsaldonegativo=maxsaldonegativo;
	}
	
	@Override
	public void retirarDinero(int dineroRetirado) throws Exception {
		if(dineroRetirado < maxsaldonegativo) {
			throw new Exception("El dinero que se quiere retirar es mayor que el saldo negativo permitido en la cuenta.");
		} else {
			this.saldo = this.saldo-dineroRetirado;	
		}
	}
	
	public void ingresarDinero(int dineroIngresado) {
		this.saldo += dineroIngresado;
	}
	
	@Override
	public void transferenciaCuenta(int dineroTransferido, CuentaBancaria cuentaTransferida) throws Exception {
		if(dineroTransferido > maxsaldonegativo) {
			throw new Exception("El dinero que se quiere transferir es mayor que el saldo negativo permitido en la cuenta.");
		}
		
		this.saldo = this.saldo-dineroTransferido;
		cuentaTransferida.saldo += dineroTransferido;
	}
	

}
	
	


package cuentabancaria;

public class Cuenta {

	
	public double mostrarSaldo(){
		return this.getSaldo();
	}
	
	public boolean sumarMonto(double monto){ 
		if(monto <= 0)
			return false;
		this.setSaldo(this.getSaldo() + monto);
		return true;
	}
	
	public double restarMonto(double monto){
		this.setSaldo(this.getSaldo() - monto);
		return this.getSaldo();
	 }
	
	//Constructores
	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
    
	public Cuenta ()
	{
		this(0);
	}
	// Getters & Setters
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	private int numero;
	private double saldo;
	
}

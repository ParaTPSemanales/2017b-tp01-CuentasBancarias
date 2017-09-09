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
	
	public boolean restarMonto(double monto){
		if (monto<this.getSaldo()) {
			this.setSaldo(this.getSaldo() - monto);
			return true;
			}	
		return false;
	 }
	
	public boolean transferir(double monto, Cuenta cuentaDestino){

		   if(!this.restarMonto(monto))
			return false;

		  cuentaDestino.sumarMonto(monto);
			return true;
		}
	//Constructores
	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
		this.numero = ++ asignadorNumero;
	}
    
	public Cuenta ()
	{
		this(0);
		this.numero = ++ asignadorNumero;
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
	
	private static int asignadorNumero = 0;
	private int numero;
	private double saldo;
	
}

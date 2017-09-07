package cuentabancaria;

public class Cuenta {

	
	public double mostrarSaldo()
	{
		return this.getSaldo();
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

package cuentabancariatest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cuentabancaria.Cuenta;
import org.junit.Assert;

public class CuentaTest {

	Cuenta cuenta;
	double monto;
	
	@Before
	public void setUp(){
	 cuenta = new Cuenta();
	}
	
	@Test
	public void queMontoInicieEnCeroPorDefecto(){
		Assert.assertTrue(cuenta.mostrarSaldo() == 0);
		
	}
	@Test
	public void montoInicialMayorACero(){   
		monto = 130;
		Cuenta otraCuenta = new Cuenta(monto);
		Assert.assertTrue(otraCuenta.mostrarSaldo() == monto);
		
	}
	
	@Test 
	public void queSumeMontoACuenta(){
		monto = 100;
		double saldoFinal = monto + cuenta.mostrarSaldo();
		cuenta.sumarMonto(monto);
		Assert.assertTrue( cuenta.mostrarSaldo() == saldoFinal);
		
	}
	
	@Test
	public void queSumeMontoMayorACero(){
		monto = -1500;
		Assert.assertTrue(!cuenta.sumarMonto(monto));
	}

	@Test 
	 public void queResteMontoACuenta(){
	 monto = 100;
	 double saldoFinal =cuenta.mostrarSaldo() -  monto ;
	 Assert.assertTrue(cuenta.restarMonto(monto) == saldoFinal);	
	 }


}

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
	public void setUp()
	{
	 cuenta = new Cuenta();
	}
	
	@Test
	public void queMontoInicieEnCeroPorDefecto()
	{
		Assert.assertTrue(cuenta.mostrarSaldo() == 0);
		
	}

}

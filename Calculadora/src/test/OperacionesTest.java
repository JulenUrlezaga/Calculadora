package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import operaciones.Operaciones;

class OperacionesTest {

	@Test
	void testSumar() {
		Operaciones operaciones=new Operaciones();
		int numero1 = 3,numero2 = 5;
		int resultado = operaciones.sumar(numero1,  numero2);
		assertEquals(resultado, 8);
	}

	@Test
	void testRestar() {
		Operaciones operaciones=new Operaciones();
		int numero1 = 3,numero2 = 5;
		int resultado = operaciones.restar(numero1,  numero2);
		assertEquals(resultado, -2);
	}

	@Test
	void testMultiplicar() {
		Operaciones operaciones=new Operaciones();
		int numero1 = 3,numero2 = 5;
		int resultado = operaciones.multiplicar(numero1,  numero2);
		assertEquals(resultado, 15);
	}

	@Test
	void testDividir() {
		Operaciones operaciones=new Operaciones();
		int numero1 = 3,numero2 = 5;
		int resultado = operaciones.dividir(numero1,  numero2);
		assertEquals(resultado, 0);
	}

	@Test
	void testResto() {
		Operaciones operaciones=new Operaciones();
		int numero1 = 3,numero2 = 5;
		int resultado = operaciones.resto(numero1,  numero2);
		assertEquals(resultado, 3);
	}

}

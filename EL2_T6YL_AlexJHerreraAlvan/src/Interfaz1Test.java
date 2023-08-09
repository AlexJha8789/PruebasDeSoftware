import static org.junit.Assert.*;

import org.junit.Test;

public class Interfaz1Test {

	@Test
	public void test1IC() {
		double resultado =Interfaz1.calcularIC(99.9, 10);
		double esperado = 999.0; // Valor correcto 999.0
		assertEquals(esperado, resultado, 1);
		
	}
	
	@Test
	public void test2IC() {
		double resultado =Interfaz1.calcularIC(99.9, 10);
		double esperado = 500.0; // Valor correcto 999.0
		assertEquals(esperado, resultado, 1);
		
	}
	
	@Test
	public void test1ID() {
		double resultado = Interfaz1.calcularID(999.0, 10);
		double esperado = 199.8; // Valor correcto 199.8
		assertEquals(esperado, resultado, 1);
	}
	
	@Test
	public void test2ID() {
		double resultado = Interfaz1.calcularID(999.0, 10);
		double esperado = 300.8; // Valor correcto 199.8
		assertEquals(esperado, resultado, 1);
	}
	
	@Test
	public void test1IP() {
		double resultado = Interfaz1.calcularIP(999.0, 199.8);
		double esperado = 799.2; // Valor correcto 799.2
		assertEquals(esperado, resultado, 1);
	}
	
	@Test
	public void test2IP() {
		double resultado = Interfaz1.calcularIP(999.0, 199.8);
		double esperado = 600.2; // Valor correcto 799.2
		assertEquals(esperado, resultado, 1);
	}
	
	@Test
	public void test1obsequio() {
		double resultado = Interfaz1.calcularObsequio(799.2, 10);
		double esperado = 20; // Valor correcto 20
		assertEquals(esperado, resultado, 1);
	}
	
	@Test
	public void test2obsequio() {
		double resultado = Interfaz1.calcularObsequio(799.2, 10);
		double esperado = 10; // Valor correcto 20
		assertEquals(esperado, resultado, 1);
	}

}

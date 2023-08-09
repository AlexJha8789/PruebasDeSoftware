import static org.junit.Assert.*;

import org.junit.Test;

public class Interfaz2Test {

	@Test
	public void test1IC() {
		double resultado=Interfaz2.calcularIC(19.9, 10);
		double esperado=199.0;  //valor correcto  199.0
		assertEquals(esperado,resultado,1);
		
	}
	
	/*@Test
	public void test2IC() {
		double resultado=Interfaz2.calcularIC(19.9, 10);
		double esperado=100.0;  //valor correcto  199.0
		assertEquals(esperado,resultado,1);
		
	}*/
	
	@Test
	public void test1ID(){
		double resultado=Interfaz2.calcularID(199.0, 10);
		double esperado=18.905;  // valor correcto 18.905
		assertEquals(esperado,resultado,1);
	}
	
	@Test
	public void test1IP(){
		double resultado=Interfaz2.calcularIP(199.0, 18.905);
		double esperado=180.095;  // valor correcto 180.095
		assertEquals(esperado,resultado,1);
	}
	
	@Test
	public void test1obsequio(){
		double resultado=Interfaz2.calcularObsequio(180.095, 10);
		int esperado=20;  // valor correcto 20
		assertEquals(esperado,resultado,1);
	}

}

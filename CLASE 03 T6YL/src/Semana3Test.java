import static org.junit.Assert.*;

import org.junit.Test;

public class Semana3Test {

	@Test
	public void test1() {
		
		assertFalse(Semana3.Bisiesto(2023));// es falso
	}
	
	@Test
	public void test2() {
		
		assertTrue(Semana3.Bisiesto(2024));// es verdadero
	}
	
	@Test
	public void test3(){
		
		assertFalse(Semana3.ExisteTriangulo(1,2, 17));
	}
	
	@Test
	public void test4(){
		
		assertTrue(Semana3.ExisteTriangulo(3,4, 5));
	}
	
	@Test
	public void test5(){
		double esperado=110.0;  //valor correcto 110.0
		double resultado=Semana3.StarBucks(1, 100.0);
		
		assertEquals(esperado,resultado,1);// el uno es un numero cualquiera, puedes poner otro no altera. el equals pide tres parametros no mas
	}
	
	@Test
	public void test6(){
		double esperado=125.0;  //valor correcto 125.0
		double resultado=Semana3.StarBucks(2, 100.0);
		
		assertEquals(esperado,resultado,1);// el uno es un numero cualquiera, puedes poner otro no altera. el equals pide tres parametros no mas
	}
	
	@Test
	public void test7(){
		double esperado=80.0;  //valor correcto 80.0
		double resultado=Semana3.StarBucks(0, 100.0);
		
		assertEquals(esperado,resultado,1);// el uno es un numero cualquiera, puedes poner otro no altera. el equals pide tres parametros no mas
	}
	
	@Test
	public void test8(){
		double esperado=1000.0;  //valor correcto  1000.0
		double resultado=Interfaz1.calcularIC(20, 50.0);
		assertEquals(esperado,resultado,1);
	}
	
	@Test
	public void test9(){
		double esperado=239.0;  //valor correcto  239.0
		double resultado=Interfaz2.calcularIC(10, 23.9);
		assertEquals(esperado,resultado,1);
	}

	

}

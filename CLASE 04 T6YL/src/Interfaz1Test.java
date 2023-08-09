import static org.junit.Assert.*;

import org.junit.Test;

public class Interfaz1Test {

	@Test
	public void test1jb() {
		double resultado=Interfaz1.calcularJB(10000);
		double esperado=2400.0; //valor correcto es 2400.0
		assertEquals(esperado,resultado,1);
		
	}
	
	/*@Test
	public void test2jb(){
		double resultado=Interfaz1.calcularJB(10000);
		double esperado=4400.0;  //valor correcto es 2400.0
		assertEquals(esperado,resultado,1);
	}*/
	
	@Test
	public void test1ar(){
		double resultado=Interfaz1.CalcularAR(10000);
		double esperado=3600.0; //valor correct es 3600.0
		assertEquals(esperado,resultado,1);
	}
	
	/*@Test
	public void test2ar(){
		double resultado=Interfaz1.CalcularAR(10000);
		double esperado=1600.0; //valor correct es 3600.0
		assertEquals(esperado,resultado,1);
	}*/
	
	@Test
	public void test1lb(){
		double resultado=Interfaz1.CalcularLB(3600.0);
		double esperado=1620.0; //valor correct es 1620.0
		assertEquals(esperado,resultado,1);
	}
	
	/*@Test
	public void test2lb(){
		double resultado=Interfaz1.CalcularLB(3600.0);
		double esperado=1000.0; //valor correct es 1620.0
		assertEquals(esperado,resultado,1);
	}*/
	
	@Test
	public void test1bds(){
		double resultado=Interfaz1.CalcularBDS(1620.0, 3600.0);
		double esperado=1044.0;  //valor correcto es 1044.0
		assertEquals(esperado,resultado,1);
	}
	
	/*@Test
	public void test2bds() {
		double resultado = Interfaz1.CalcularBDS(1620.0, 3600.0);
		double esperado = 844.0; // Valor correcto 1044.0
		assertEquals(esperado, resultado, 1);
	}*/
	
	@Test
	public void test1jd(){
		double resultado=Interfaz1.CalcularJD(2400.0, 1044.0);
		double esperado=861.0; // Valor correcto 861.0
		assertEquals(esperado,resultado,1);
	}
	
	/*@Test
	public void test2jd() {
		double resultado = Interfaz1.calcularJD(2400.0, 1044.0);
		double esperado = 261.0; // Valor correcto 861.0
		assertEquals(esperado, resultado, 1);
	}*/
	
	@Test
	public void test1CA(){
		double resultado=Interfaz1.CalcularCA(10000, 3600.0, 1620.0, 2400.0, 1044.0, 861.0);
		double esperado=475.0; // Valor correcto 475.0
		assertEquals(esperado,resultado,1);
	}
	
	/*@Test
	public void test2CA(){
		double resultado=Interfaz1.CalcularCA(10000, 3600.0, 1620.0, 2400.0, 1044.0, 861.0);
		double esperado=4075.0; // Valor correcto 475.0
		assertEquals(esperado,resultado,1);
	}*/

}

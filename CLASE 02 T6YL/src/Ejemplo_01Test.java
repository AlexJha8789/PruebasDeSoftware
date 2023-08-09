import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Ejemplo_01Test {

	@Test
	public void sumatest() {
		int resultado = Ejemplo_01.suma(10, 5);
		Assert.assertEquals(15, resultado);
	}
	@Test
	public void restatest() {
		int resultado1 = Ejemplo_01.resta(10, 5);
		Assert.assertEquals(5, resultado1);
	}
	@Test
	public void multiplicatest() {
		int resultado2 = Ejemplo_01.multiplica(10, 5);
		Assert.assertEquals(50, resultado2);
	}
	@Test
	public void dividetest() {
		int resultado3 = Ejemplo_01.divide(10, 5);
		Assert.assertEquals(2, resultado3);
	}
	@Test
	public void potenciatest() {
		double resultado4 = Ejemplo_01.potencia(10, 5);
		Assert.assertEquals(100000.0, resultado4);
	}
	
	@Test
	public void areatest() {
		double resultado5 = Ejemplo_01.areacirculo(10);
		Assert.assertEquals(314.16, resultado5);
	}
	
	@Test
	public void perimetrotest() {
		double resultado6 = Ejemplo_01.perimetrocirculo(10);
		Assert.assertEquals(62.832, resultado6);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	
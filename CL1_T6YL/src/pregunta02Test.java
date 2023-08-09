import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class pregunta02Test {

	@Test
	public void Ballontest() {
		
		double resultado = pregunta02.Ballon(100000.0);
		Assert.assertEquals(24000.0, resultado);
	}
	
	@Test
	public void Rodrigueztest() {
		
		double resultado = pregunta02.Rodriguez(100000.0);
		Assert.assertEquals(36000.0, resultado);
	}
	
	@Test
	public void Butrontest() {
		
		double resultado = pregunta02.Butron(36000.0);
		Assert.assertEquals(16200.0,resultado);
	}
	
	@Test
	public void DaSilvatest() {
		
		double resultado = pregunta02.DaSilva(16200.0, 36000.0);
		Assert.assertEquals(10440.0,resultado);
	}
	
	@Test
	public void Dezatest() {
		
		double resultado = pregunta02.Deza(24000.0, 10440.0);
		Assert.assertEquals(8610.0,resultado);
	}
	
	@Test
	public void Ascuestest() {
		
		double resultado = pregunta02.Ascues(24000.0, 36000.0, 16200.0, 10440.0, 8610.0);
		Assert.assertEquals(4750.0,resultado);
	}
	
	

}

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class Interfaz2Test {

	@Test
	public void test1digitoMasRepetido() {
		
		int resultado = Interfaz2.calcularDigitoMasRepetido(new BigInteger("256928842658"));
		int esperado = 2; // Valor correcto 2
		assertEquals(esperado, resultado, 1);
	}
	
	@Test
	public void test2digitoMasRepetido() {
		
		int resultado = Interfaz2.calcularDigitoMasRepetido(new BigInteger("256928842658"));
		int esperado = 8; // Valor correcto 2
		assertEquals(esperado, resultado, 1);
	}

}

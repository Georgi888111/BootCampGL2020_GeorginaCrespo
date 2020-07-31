package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EjercicioForTest {

	EjercicioFor ejercicio = new EjercicioFor();

	@Test
	@DisplayName(value = "Ejercicio 1.7")
	void test() {
		System.out.println("Ejercicio 1.7");
		ejercicio.setNumero1(5);
		boolean resultado = ejercicio.cicloFor(ejercicio.getNumero1());
		assertTrue(resultado, "Esta variable no es true");
		ejercicio.setNumero1(2);
		boolean resultado2 = ejercicio.cicloFor(ejercicio.getNumero1());
		assertFalse(resultado2, "Esta variable no es false");
	}

}

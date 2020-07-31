package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumaTest {
	Suma suma = new Suma();

	@Test
	@DisplayName(value = "Ejercicio 1.6")
	void test() {
		System.out.println("Ejercicio 1.6");
		suma.setNumero1(10);
		suma.setNumero2(20);
		int esperado = 30;
		int result = suma.suma(suma.getNumero1(), suma.getNumero2());
		assertEquals(esperado, result);

	}

}

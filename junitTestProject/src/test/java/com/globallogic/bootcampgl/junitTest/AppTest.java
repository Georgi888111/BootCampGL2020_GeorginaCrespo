package com.globallogic.bootcampgl.junitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest {

//Ejercicio 1.1
	@Test

	void test() {
		System.out.println("Ejercicio 1.1");
		assertEquals("Test", "Test");
	}

	// Ejercicio 1.2
	@Test

	public void test2() {
		System.out.println("Ejercicio 1.2");
		String variable1 = "Variable";
		String variable2 = "Variable";
		String variable3 = "Int";
		assertEquals(variable1, variable2);
		assertNotEquals(variable1, variable3);
		// Modificacion para ejercicio 1.5
		// String variable1 = "Variable";
		// String variable2 = "Int";
		// String variable3 = "Int";
		// assertEquals(variable1, variable2);
		// assertNotEquals(variable2, variable3);

	}

	// Ejercicio 1.3

	@Test

	public void test3() {

		System.out.println("Ejercicio 1.3");
		assertTrue(25 > 12);
		assertFalse(25 > 27);
//Modificacion para ejercicio 1.5
		// assertTrue(25<12);
		// assertFalse(25<27);
	}

	// Ejercicio 1.4
	@Test

	public void test4() {
		System.out.println("Ejercicio 1.4");
		Long numero = null;
		assertNull(numero);
		numero = 1L;
		assertNotNull(numero);
//Modificacion para ejercicio 1.5
		// Long numero = 1L;
		// assertNull(numero);
		// numero=null;
		// assertNotNull(numero);
	}

}

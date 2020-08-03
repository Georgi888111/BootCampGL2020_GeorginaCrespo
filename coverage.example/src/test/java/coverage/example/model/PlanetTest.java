package coverage.example.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlanetTest {

	Planet planet = new Planet();
	@Test
	void test() {
		
		String name = "Marte";
		planet.setName(name);
		assertEquals(name, planet.getName());
	}
	
	void toStringTest(){
	   
	    // this test checks that the String has "first="
	    // followed by only alphabetic characters
		assertEquals("Planet [name=" + planet.getName() + "]", planet.toString());
	}

}

package coverage.example.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class StarTest {

	Star star = new Star();
	@Test
	void testName() {
	String name = "Sol";
	star.setName(name);
	assertEquals(name, star.getName());
	
	}
	
	@Test
	void testColor() {
	String color = "Amarillo";
	star.setColor(color);
	assertEquals(color, star.getColor());
	
	}
	@Test
	void testPlanetList() {
	List<Planet> planetas = new ArrayList<Planet>();
	Planet planet = new Planet();
	String name = "Marte";
	planet.setName(name);
	planetas.add(planet);
	star.setPlanets(planetas);
	assertEquals(name,star.getPlanets().get(0).getName());
	
	
	}
	
	

}

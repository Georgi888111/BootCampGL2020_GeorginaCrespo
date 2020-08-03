package coverage.loteria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

class LoteriaTest {

	
	@Test
	void test() {
		float pozo = 12;
		int bole = 2;
		CartonGenerator carton = new CartonGenerator();
		Loteria loteria = new Loteria(pozo,bole,carton);
		
		assertEquals(pozo, loteria.getPozo());
		assertEquals(bole, loteria.getBoletos());
		
		
	}

}

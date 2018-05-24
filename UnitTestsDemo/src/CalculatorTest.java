import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private static Calculator calc;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
	}

	@Test
	void Addition_should_return_postive_when_postives_are_supplied() {
		
		calc.setA(3);
		calc.setB(6);
		int expected  = 9;
		int actual = calc.add();
		assertEquals(expected,actual);
		assertTrue(actual> 0);
	}
	
	@Test
	void Addition_should_return_negative_when_negatives_are_supplied() {
		
		calc.setA(-3);
		calc.setB(-6);
		int expected  = -9;
		int actual = calc.add();
		assertEquals(expected,actual);
		assertTrue(actual <0);
	}
	
	
	
	

}

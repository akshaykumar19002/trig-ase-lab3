package trig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import excpetions.InvalidInputException;

public class FactorialTest {

	@Test
	public void testFactorial1() throws InvalidInputException {
		int number = 5;
		assertEquals(120, Trigonometry.factorial(number));
	}
	
	@Test
	public void testInvalidFactorial2() throws InvalidInputException {
		int number = -100;
		assertThrows(InvalidInputException.class, () -> Trigonometry.factorial(number));
	}
	
}

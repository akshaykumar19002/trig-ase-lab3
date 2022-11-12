package trig;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import excpetions.InvalidAngleException;

public class ConvertToRadianTest {

	@Test
	public void convertToRadian1() throws InvalidAngleException {
		double angle = 50;
		assertEquals(0.872, Trigonometry.convertToRadian(angle), 0.001);
	}
	
	@Test
	public void convertToRadian2() throws InvalidAngleException {
		double angle = 100;
		assertEquals(1.745, Trigonometry.convertToRadian(angle), 0.001);
	}
	
}

package trig;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrigonometryTest {

	@Test
	public void testFirstQuadrant() {
		int angle = 40;
		double angleInRadian = angle * Math.PI/180;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	}
	
}

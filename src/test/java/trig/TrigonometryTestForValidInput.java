package trig;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import excpetions.InvalidAngleException;
import excpetions.InvalidInputException;

public class TrigonometryTestForValidInput {

	@Test
	public void testSine() throws InvalidAngleException, InvalidInputException {
		int angle = 0;
		double angleInRadian = angle * Math.PI/180;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
		
		angle = 70;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
		
		angle = 120;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
		angle = 150;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
		angle = 210;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
		
		angle = 300;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
		angle = 330;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
	}
	
	@Test
	public void testCosine() throws InvalidAngleException, InvalidInputException {
		int angle = 0;
		double angleInRadian = angle * Math.PI/180;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
		
		angle = 70;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
		
		angle = 120;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
		angle = 150;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
		angle = 210;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
		
		angle = 300;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
		angle = 330;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
	}
	
	@Test
	public void testTangent() throws InvalidAngleException, InvalidInputException {
		int angle = 0;
		double angleInRadian = angle * Math.PI/180;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
		
		angle = 70;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
		
		angle = 120;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
		angle = 150;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
		angle = 210;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
		
		angle = 300;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	
		angle = 330;
		angleInRadian = angle * Math.PI/180;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angle, Trigonometry.TypeOfAngle.DEGREE), 0.001);
	}
	
	@Test
	public void testSineInRadian() throws InvalidAngleException, InvalidInputException {
		double angleInRadian = 0;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
		
		angleInRadian = 0.174;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
		
		angleInRadian = 1.745;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 2.617;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 3.316;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 4.014;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 5.759;
		assertEquals(Math.sin(angleInRadian), Trigonometry.sin(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
		
	}
	
	@Test
	public void testCosineInRadian() throws InvalidAngleException, InvalidInputException {
		double angleInRadian = 0;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
		
		angleInRadian = 0.174;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 1.745;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 2.617;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 3.316;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 4.014;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 5.759;
		assertEquals(Math.cos(angleInRadian), Trigonometry.cos(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	}
	
	@Test
	public void testTangentInRadian() throws InvalidAngleException, InvalidInputException {
		double angleInRadian = 0;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
		
		angleInRadian = 0.174;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 1.745;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 2.617;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 3.316;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 4.014;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	
		angleInRadian = 5.759;
		assertEquals(Math.tan(angleInRadian), Trigonometry.tan(angleInRadian, Trigonometry.TypeOfAngle.RADIAN), 0.001);
	}
}

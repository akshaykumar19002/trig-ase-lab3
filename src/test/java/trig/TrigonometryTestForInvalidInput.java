package trig;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import excpetions.InvalidAngleException;
import excpetions.InvalidInputException;

public class TrigonometryTestForInvalidInput {

	@Test
	public void testInvalidSine() throws InvalidAngleException, InvalidInputException {
		final double angle1 = -10;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.sin(angle1, Trigonometry.TypeOfAngle.DEGREE));
		
		final double angle2 = 370;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.sin(angle2, Trigonometry.TypeOfAngle.DEGREE));	
	}
	
	@Test
	public void testInvalidCosine() throws InvalidAngleException {
		final double angle1 = -10;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.cos(angle1, Trigonometry.TypeOfAngle.DEGREE));
		
		final double angle2 = 370;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.cos(angle2, Trigonometry.TypeOfAngle.DEGREE));
	}
	
	@Test
	public void testInvalidTangent() throws InvalidAngleException {
		final double angle1 = -10;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.tan(angle1, Trigonometry.TypeOfAngle.DEGREE));
		
		final double angle2 = 370;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.tan(angle2, Trigonometry.TypeOfAngle.DEGREE));
	}
	
	@Test
	public void testInvalidSineInRadian() throws InvalidAngleException {
		final double angleInRadian1 = -0.174533;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.sin(angleInRadian1, Trigonometry.TypeOfAngle.RADIAN));
		
		final double angleInRadian2 = 6.457;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.sin(angleInRadian2, Trigonometry.TypeOfAngle.RADIAN));
	}
	
	@Test
	public void testInvalidCosineInRadian() throws InvalidAngleException {
		final double angleInRadian1 = -0.174533;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.cos(angleInRadian1, Trigonometry.TypeOfAngle.RADIAN));
		
		final double angleInRadian2 = 6.457;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.cos(angleInRadian2, Trigonometry.TypeOfAngle.RADIAN));
	}
	
	@Test
	public void testInvalidTangentInRadian() throws InvalidAngleException {
		final double angleInRadian1 = -0.174533;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.tan(angleInRadian1, Trigonometry.TypeOfAngle.RADIAN));
		
		final double angleInRadian2 = 6.457;
		assertThrows(InvalidAngleException.class, () -> Trigonometry.tan(angleInRadian2, Trigonometry.TypeOfAngle.RADIAN));
	}
	
}

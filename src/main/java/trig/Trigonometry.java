package trig;

import excpetions.InvalidAngleException;
import excpetions.InvalidInputException;

public class Trigonometry {

	public static enum TypeOfAngle {
		RADIAN,
		DEGREE
	}
	
	public static double factorial(int n) throws InvalidInputException {
		if (n < 0) {
			throw new InvalidInputException();
		}
		double factorial = 1;
		for (int j = 2; j <= n; j++) {
			factorial *= j;
		}
		return factorial;
	}
	
	public static double convertToRadian(double angle) {
		return angle * Math.PI/180;
	}
	
	public static double sin(double angle, TypeOfAngle type) throws InvalidAngleException, InvalidInputException {
		if (type == TypeOfAngle.DEGREE)
			angle = convertToRadian(angle);
		if (angle < 0 || angle > 6.283)
			throw new InvalidAngleException();
		int n = 10;
		int i; 
		double result = 0;
		for (i = 0; i <= n; i++) {
			result += Math.pow(-1.0, i) * Math.pow(angle, 2*i+1)/factorial(2 * i + 1);
		}
		return result;
	}
	
	public static double cos(double angle, TypeOfAngle type) throws InvalidAngleException, InvalidInputException {
		if (type == TypeOfAngle.DEGREE)
			angle = convertToRadian(angle);
		if (angle < 0 || angle > 6.283)
			throw new InvalidAngleException();
		int n = 10;
		int i;
		double result = 0;
		
		for (i = 0; i<=n; i++) {
			result += Math.pow(-1.0, i) * Math.pow(angle, 2*i)/factorial(2 * i);
		}
		return result;
	}
	
	public static double tan(double angle, TypeOfAngle type) throws InvalidAngleException, InvalidInputException {
		return sin(angle, type)/cos(angle, type);
	}
	
}

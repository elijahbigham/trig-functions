package greenham.trigfunctions;

public class TrigFunctions {
	
	//Approximates the sine function to high precision using a Taylor series
	public double sine(double angle) {
		int runs = 30;
		double output = 0.0;
		int sign = 1;
		for(int i = 1; i < runs; i+=2) {
			output += ((Math.pow(angle,i))/(factorial(i))) * sign;
			sign *= -1;
		}
		return output;
	}
	
	//Need a more efficient algorithm for finding factorial of x
	private int factorial(int x) {
		int output = 1;
		if (x == 0) {
			return output;
			}
		for(int i = x; i > 0; i--) {
			output *= i;
			
		}
		return output;
	}
}

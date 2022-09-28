package greenham.trigfunctions;

public class TrigFunctions {
	public double sine(double angle) {
		double output = 0.0;
		int negation = 1;
		for(int i = 1; i < 11; i+=2) {
			output += ((Math.pow(angle,i))/(factorial(i))) * negation;
			negation *= -1;
		}
		return output;
	}
	
	//Can this be more efficient? Perhaps just use the java library
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

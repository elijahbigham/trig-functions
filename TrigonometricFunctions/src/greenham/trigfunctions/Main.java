package greenham.trigfunctions;
import java.lang.Math;
public class Main {
	public static void main (String[] args) {
		
		//This tests the sine function by comparing the calculate of sin(pi/3) to the known value, (3^1/2)/2
		TrigFunctions myTrig = new TrigFunctions();
		System.out.println(myTrig.sine(Math.PI/3));
		System.out.println(Math.sqrt(3) / 2);
	}
}

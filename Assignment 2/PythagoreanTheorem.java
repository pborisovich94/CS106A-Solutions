import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute Pythagorean theorem."); // Welcome message
		
		int a = readInt("a: "); // Declare and initialize variable with number that user print
		int b = readInt("b: ");	// Declare and initialize variable with number that user print
		double c = Math.sqrt(((double)a * (double)a) + ((double)b) * (double)b); // Use Math.sqrt method to calculate
		
		println("c = " + c); // Print result to user
	}
}

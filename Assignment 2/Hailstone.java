import acm.program.*;

public class Hailstone extends ConsoleProgram {
	
	public void run() {
		
		int n = readInt("Enter a number: "); 	// Here we get number that user entered
		int stepsCounter = 0; 					// This variable stores a number of steps before reaching 1
		
		while (n != 1) {											// Repeat the loop until we reach 1
			if (n % 2 == 0) { 										// If the remainder equals 0, number is even
				println (n + " is even, so I take half: " + n / 2);
				n = (n / 2);
				stepsCounter = stepsCounter + 1;
			}
			else {													// If the remainder equals 1, number is odd
				println (n + " is odd, so I make 3n+1: " + (3 * n + 1));
				n = (3 * n + 1);
				stepsCounter = stepsCounter + 1;
			}
		}
		println ("The process took " + stepsCounter + " to reach 1"); // Final message
	}	
}
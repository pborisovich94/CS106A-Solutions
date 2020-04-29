import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL = 0; // Declare a constant and initialize it with value 0
	
	public void run() {
		
		int min; // Declare variable that will store minimal number
		int max;	// Declare variable that will store maximal number
		int n;	// Declare variable that will store a number that user entered 
		
		println("This program finds the largest and smallest numbers."); // Welcome message
		
		/* Pre-condition: n variable is empty. We asking for user to enter a number, that will be
		 * stored in this variable.
		 * Post-condition: 1.If n equals SENTINEL, then print a message, that user entered nothing.
		 * 2. If user entered first number that bigger then SENTINEL and second number is equals SENTINEL, then print that
		 * min and max equals to first number that user entered.
		 */
//		n = readInt("?: "); // Initialize variable with number that user enter
//		if (n == SENTINEL) { 
//			println("You entered nothing");
//		}
//		min = n; // Initialize variable with the first number that user print
//		max = n; 	// Initialize variable with the first number that user print
		
		
		/* Pre-condition: We got first number that user entered and it's not equal to SENTINEL. This number is
		 * stored in min and max variables.
		 * Post-condition: 1.If second number that user entered is not equals to SENTINEL, then compare it with
		 * min. If entered number is smaller and NOT equals to SENTINEL, then give to a variable min
		 * new value. If entered number is bigger than min, jump to the next if statement. If entered number is
		 * bigger then max and NOT equals to SENTINEL, then give to a variable max new value.
		 * If entered number > min and < max - do nothing.
		 * When entered number equals SENTINEL, break the while loop and print results.
		 */
		n = readInt("?: ");
		min = n;
		max = n;
		
		while (n != SENTINEL) { 
			
			
			min = (n < min)? n : min;
			max = (n < max)? n : max;
			
			n = readInt ("?: "); //	Requests user to print next number
			
//			if (n < min) { // Compare new number to the smallest number
//				if (n != SENTINEL) {
//					min = n;
//				} 
//			}
//			
//			if (n > max) { // Compare new number to the largest number
//				if (n != SENTINEL) {
//					max = n;
//				}
//			}
			
//			if (n == SENTINEL) { // Compare new number to the SENTINEL
//				break; // Stop the while loop
//			}
		}
		println ("smallest: " + min);
		println ("largest: " + max);
		
	}
}
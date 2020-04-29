/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.SuperKarel;

public class MidpointFindingKarel extends SuperKarel {
	/*
	 * Karel counts the amount of move along the line, then divides
	 * it by two.
	 */
	public void run() {
		findMidPoint();
		putBeeper();
	}
		
	/* 
	 * This command makes Karel count the length of the line.
	 * come to the midpoint.
	 */	
	private void findMidPoint() {
		
		/* Karel counts the length of the line. */
		int x = 1;
		while (frontIsClear()) {
			move();
			x++;
		}
		
		/* Karel calculates the midpoint. */
		int y = x/2;
		turnAround();
		
		/* Karel moves to the midpoint. */
		for (int i=0; i<y; i++) {
			move();
		}
		turnAround();
	}
}

/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.SuperKarel;

public class CheckerboardKarel extends SuperKarel {

	/*
	 * Karel puts the beepers in a checkerboard style, one row
	 * at a time.
	 */
	public void run() {
		/* 
		 * This part of the run() method is invoked if the world is
		 * at least two lines wide.
		 */
		if (frontIsClear()) {
			putCheckersInTheRow();
			turnLeft();
			while (frontIsClear()) {
				repositionForRowToWest();
				putCheckersInTheRow();
				turnRight();
				if (frontIsClear()) {
					repositionForRowToEast();
					putCheckersInTheRow();
					turnLeft();
				}
			}
		}
		/*
		 * This part of the run() method is invoked is the world is 
		 * only one street wide.	
		 */
		else {
			turnLeft();
			putBeeper();
			while (frontIsClear()) {
				moveToNextCorner();
			}
		}
	}
	
	/*
	 * Pre-condition: Karel stays at the very eastern or western
	 * point of the street, facing East (if staying at the western
	 * point) or facing West (if staying at the eastern point).
	 * Post-condition: Karel ends up at the end of the street, facing
	 * North.
	 */
	public void putCheckersInTheRow() {
		checkPreviousBeeperLocation();
		putBeeper();
		while (frontIsClear()) {
			moveToNextCorner();
		}
	}
	
	/* 
	 * Pre-condition: Karel stays at the corner of the street, 
	 * facing East or West, where beeper is present already.
	 * Post-condition: Karel ends up at the end of the street, 
	 * having it covered with beepers.
	 */
	public void moveToNextCorner() {
		if (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			}	
		}
	}
	
	/*
	 * Pre-condition: Karel stays at the very eastern or western
	 * point of the street, facing East (if staying at the western
	 * point) or facing West (if staying at the eastern point).
	 * Post-condition: Karel ends up at the same corner if a beeper
	 * has to be put or at the next corner of the street, if it has
	 * to be put there.
	 */
	public void checkPreviousBeeperLocation() {
		if (facingEast()) {
			turnRight();
			checkTheWesternBeeper();
		} else {
			turnLeft();
			checkTheEasternBeeper();
		}
	}
	/*
	 * Pre-condition: Karel stays at the most western point of the 
	 * street, facing South.
	 * Post-condition: Karel ends at the same corner if a beeper has
	 * to be put there, or moves to the next corner.
	 */
	public void checkTheWesternBeeper() {
		if (frontIsClear()) {
			move();
			if (beepersPresent()) {
				turnAround();
				move();
				turnRight();
				if (frontIsClear()) {
					move();
				} //else {
					//turnLeft();
					//move();
					//turnRight();
				//}
			} else {
				turnAround();
				move();
				turnRight();
			}
		} else {
			turnLeft();
		}
	}
	/*
	 * Pre-condition: Karel stays at the most eastern point of the 
	 * street, facing South.
	 * Post-condition: Karel ends at the same corner if a beeper has
	 * to be put there, or moves to the next corner.
	 */
	public void checkTheEasternBeeper() {
		move();
		if (beepersPresent()) {
			turnAround();
			move();
			turnLeft();
			if (frontIsClear()) {
				move();
			} //else {
				//turnRight();
				//move();
				//turnLeft();
			//}
		} else {
			turnAround();
			move();
			turnLeft();
		}
	}
	/* 
	 * Makes Karel move to the next row while being at the very 
	 * eastern corner of the current street.
	 */
	public void repositionForRowToWest() {
		move();
		turnLeft();
	}
	/* 
	 * Makes Karel move to the next row while being at the very 
	 * western corner of the current street.
	 */
	public void repositionForRowToEast() {
		move();
		turnRight();
	}
}
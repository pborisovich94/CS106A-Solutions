/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.Karel;

public class CollectNewspaperKarel extends Karel {
	/*
	 * Pre-condition: Karel starts at the most north-western corner
	 * of the house, facing East.
	 * Post-condition: Karel ends at the same corner, facing East,
	 * after picking up the beeper.
	 */
	public void run() {
		goOut();
		pickBeeper();
		comeBack();
	}
	/*
	 * Pre-condition: Karel starts at the most north-western corner
	 * of the house, facing East. The house can be of any size, but
	 * the exit must be exactly in the eastern wall and not adjacent
	 * to the northern wall.
	 * Post-condition: Karel end at the corner with the beeper, 
	 * facing East.
	 */
	private void goOut() {
		moveToWall();
		moveToExit();
		comeToBeeper();
	}
	/*
	 * This makes Karel move along the line until he faces a wall. 
	 */
	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
	}
	/*
	 * Pre-condition: Karel faces the wall, the exit is in the same
	 * wall, to the right of Karel.
	 * Post-condition: Karel ends up just in front of the exit,
	 * facing it.
	 */
	private void moveToExit() {
		turnRight();
		while (leftIsBlocked()) {
			move();
		}
		turnLeft();
	}
	
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	private void comeToBeeper() {
		while (noBeepersPresent()) {
			move();
		}
	}
	/*
	 * Pre-condition: Karel is staying at the same corner, where
	 * the beeper has been present, facing East.
	 */
	private void comeBack() {
		turnAround();
		comeInside();
		comeToPlace();
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
	/*
	 * Pre-condition: Karel stays on the same line where the entrance
	 * is, facing it.
	 * Post-condition: Karel ends up inside the house, facing the
	 * wall just opposite the entrance.
	 */
	private void comeInside() {
		while (frontIsClear()) {
			move();
		}
	}
	/*
	 * Pre-condition: Karel faces the wall and his starting point
	 * is to the right of him in the corner of the house.
	 * Post-condition: Karel ends up in the corner to the right of
	 * him, facing the opposite direction.
	 */
	private void comeToPlace() {
		turnRight();
		while (frontIsClear()) {
			move();
		}
		turnRight();
	}
	
}
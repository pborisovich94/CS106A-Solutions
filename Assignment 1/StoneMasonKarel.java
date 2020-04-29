/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.SuperKarel;

public class StoneMasonKarel extends SuperKarel {
	/*
	 * As Karel starts exactly at the first column, he repairs it
	 * and moves to the next column if there is no wall immediately
	 * after the column. 
	 */
	public void run() {
		repairColumn();
		while (frontIsClear()) {
			moveToNextColumn();
			repairColumn();
		}
	}
	/*
	 * Pre-condition: Karel stays at the crossing of the first street
	 * and the avenue, which is supposed to have a column, facing
	 * East.
	 * Post-condition: Karel comes back to the same crossing facing
	 * East again.
	 */
	private void repairColumn() {
		putAllStones();
		comeBack();
	}
	/*
	 * Pre-condition: Karel stays at the crossing of the first street
	 * and the avenue, which is supposed to have a column, facing
	 * East.
	 * Post-condition: Karel ends up at the very last street of
	 * the column, facing the floor (North).
	 */
	private void putAllStones() {
		turnLeft();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		} 
		if (noBeepersPresent()) {
				putBeeper();	
		}
	}
	/*
	 * Pre-condition: Karel stays at the very last street of
	 * the column, facing the floor (North).
	 * Post-condition: Karel ends up at the first street of
	 * the column, facing East.
	 */
	private void comeBack() {
		turnAround();
		moveToWall();
		turnLeft();
	}
	/*
	 * Makes Karel move until he faces the wall.
	 */
	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
	}
	/*
	 * Pre-condition: Karel stays at the crossing of the first
	 * street and column, facing East. As far as columns are
	 * exactly four units apart, he makes four moves.
	 * Post-condition: Karel stays at the crossing of the first
	 * street and next column, facing East.
	 */
	private void moveToNextColumn() {
		for (int i=0; i<4; i++) {
			move();
		}
	}
}

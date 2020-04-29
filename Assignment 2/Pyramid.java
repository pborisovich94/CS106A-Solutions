import acm.graphics.*;
import acm.program.*;
import java.awt.*; // Abstract Window Toolkit

public class Pyramid extends GraphicsProgram {

	// Declare and initialize constants for width, height and base number of bricks
	private static final int BRICK_WIDTH = 35;
	private static final int BRICK_HEIGHT = 20;
	private static final int BRICKS_IN_BASE = 40;
	
	public void run() {
		buildPyramid();
	}
	
	/* Pre-condition: We have empty canvas.
	 * Post-condition: We have build a pyramid starting with number of bricks that stores in BRICKS_IN_BASE constant
	 * and finishes with one brick at the top.
	 */
	private void buildPyramid() {
		
		/* Begin for loop that starts counting rows from 0, checks if the row number is less than BRICKS_IN_BASE 
		 * and if so, it creates the next line
		 */
		for(int rowNumber = 0; rowNumber < BRICKS_IN_BASE; rowNumber++) {
			int bricksInRow = BRICKS_IN_BASE - rowNumber; // Get a number of bricks in row (first will be 14, second - 13)
			
			for(int brickNumber = 0; brickNumber < bricksInRow; brickNumber++) {
				// Find out the center, find out starting point based on center, adding a brick
				int xCoordinate = (getWidth() / 2) - (BRICK_WIDTH * bricksInRow) / 2 + brickNumber * BRICK_WIDTH;
				int yCoordinate = getHeight() - BRICK_HEIGHT * (rowNumber + 1);
				
				GRect brick = new GRect(xCoordinate, yCoordinate, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
		}
	}
}

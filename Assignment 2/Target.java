import acm.graphics.*;
import acm.program.*;
import java.awt.*; // Abstract Window Toolkit

public class Target extends GraphicsProgram {
	
	// Declare and initialize constants for circles radiuses
	private static final int BIG_CIRCLE_RADIUS = 72;
	private static final int MID_CIRCLE_RADIUS = (int) (72 * 0.65);
	private static final int SMALL_CIRCLE_RADIUS = (int) (72 * 0.3);
	
	
	/* Pre-condition: We have empty canvas.
	 * Post-condition: We have big filled red circle, filled white circle (that smaller then red) and red
	 * filled circle (that smaller then white) in the middle of the canvas.
	 */
	public void run() {
		addBigCircle();
		addMidCircle();
		addSmallCircle();
	}
	
	private void addBigCircle() {
		GOval bigCircle = new GOval(getWidth() / 2 - BIG_CIRCLE_RADIUS, getHeight() / 2 - BIG_CIRCLE_RADIUS, BIG_CIRCLE_RADIUS * 2, BIG_CIRCLE_RADIUS * 2); // Declare GOval variable and initialize it with new object
		bigCircle.setColor(Color.RED); // Set red border color of our GOval
		bigCircle.setFilled(true);	// Set that GOval needs to be filled
		bigCircle.setFillColor(Color.RED); // Set that GOval needs to be filled with red color
		add(bigCircle);	// Put GOval on canvas
	}
	
	private void addMidCircle() {
		GOval midCircle = new GOval(getWidth() / 2 - MID_CIRCLE_RADIUS, getHeight() / 2 - MID_CIRCLE_RADIUS, MID_CIRCLE_RADIUS * 2, MID_CIRCLE_RADIUS * 2);
		midCircle.setColor(Color.WHITE);	// Set white border color of our GOval
		midCircle.setFilled(true);	// Set that GOval needs to be filled
		midCircle.setFillColor(Color.WHITE);	// Set that GOval needs to be filled with white color
		add(midCircle);	// Put GOval on canvas
		
	}
	
	private void addSmallCircle() {
		GOval smallCircle = new GOval(getWidth() / 2 - SMALL_CIRCLE_RADIUS, getHeight() / 2 - SMALL_CIRCLE_RADIUS, SMALL_CIRCLE_RADIUS * 2, SMALL_CIRCLE_RADIUS * 2);
		smallCircle.setColor(Color.RED);	// Set red border color of our GOval
		smallCircle.setFilled(true);	// Set that GOval needs to be filled
		smallCircle.setFillColor(Color.RED);	// Set that GOval needs to be filled with red color
		add(smallCircle);	// Put GOval on canvas
	}
}
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	// Declare and initialize constants for width and height of boxes
	private static final int BOX_WIDTH = 180;
	private static final int BOX_HEIGHT = 50;
	
	/* Pre-condition: We have empty canvas.
	 * Post-condition: We have 4 boxes with labels and 3 lines at the canvas.
	 */
	public void run() {
		drawProgramBox();
		drawGraphicsLine();
		drawGraphicsBox();
		drawConsoleLine();
		drawConsoleBox();
		drawDialogLine();
		drawDialogBox();
	}
	
	// Adding a Program Box with label 'Program' on canvas
	private void drawProgramBox() {
		double xBoxCoordinate = (getWidth() - BOX_WIDTH) / 2;
		double yBoxCoordinate = (getHeight() - BOX_HEIGHT) / 3;
		GRect box = new GRect(xBoxCoordinate, yBoxCoordinate, BOX_WIDTH, BOX_HEIGHT);
		add(box);
		
//		double xLabelCoordinate = ((BOX_WIDTH - label.getWidth()) / 2);
//		double yLabelCoordinate = (BOX_HEIGHT - label.getAscent() * 1.5);
//		GLabel label = new GLabel("Program", xBoxCoordinate + xLabelCoordinate, yBoxCoordinate + yLabelCoordinate);
//		add(label);
		
		GLabel label = new GLabel("Program");
		double xLabelCoordinate = ((BOX_WIDTH - label.getWidth()) / 2);
		double yLabelCoordinate = (BOX_HEIGHT - label.getAscent() * 1.5);
		add(label, xBoxCoordinate + xLabelCoordinate, yBoxCoordinate + yLabelCoordinate);
//		label.setLocation(xBoxCoordinate + xLabelCoordinate, yBoxCoordinate + yLabelCoordinate);
	}
	
	private void drawGraphicsLine() {
		// Find middle of the bottom of the Program Box
		double x0 = getWidth() / 2;
		double y0 = getHeight() / 2.5;
		
		//Find middle of the top of the Graphics Box
		double x1 = getWidth() / 2 - 2.5 * (BOX_WIDTH / 2);
		double y1 = (getHeight() / 2) + (BOX_HEIGHT * 0.5);
		
		GLine line = new GLine (x0, y0, x1, y1);
		add(line);
	}
	
	// Adding a Graphics Box with label 'GraphicsProgram' on canvas
	private void drawGraphicsBox() {
		double xBoxCoordinate = (getWidth() - BOX_WIDTH) / 9; 
		double yBoxCoordinate = (getHeight() + BOX_HEIGHT) / 2;
		GRect box = new GRect(xBoxCoordinate, yBoxCoordinate, BOX_WIDTH, BOX_HEIGHT);
		add(box);
		
		GLabel label = new GLabel("GraphicsProgram");
		add(label);
		double xLabelCoordinate = ((BOX_WIDTH - label.getWidth()) / 2);
		double yLabelCoordinate = (BOX_HEIGHT - label.getAscent() * 1.5);
		label.setLocation(xBoxCoordinate + xLabelCoordinate, yBoxCoordinate + yLabelCoordinate);
	}
	
	private void drawConsoleLine() {
		// Find middle of the bottom of the Program Box
		double x0 = getWidth() / 2;
		double y0 = getHeight() / 2.5;
		
		//Find middle of the top of the Console Box
		double x1 = getWidth() / 2;
		double y1 = (getHeight() / 2) + (BOX_HEIGHT * 0.5);
		
		GLine line = new GLine (x0, y0, x1, y1);
		add(line);
	}
	
	// Adding a Console Box with label 'ConsoleProgram' on canvas
	private void drawConsoleBox() {
		double xBoxCoordinate = (getWidth() - BOX_WIDTH) / 2; 
		double yBoxCoordinate = (getHeight() + BOX_HEIGHT) / 2;
		GRect box = new GRect(xBoxCoordinate, yBoxCoordinate, BOX_WIDTH, BOX_HEIGHT);
		add(box);
		
		GLabel label = new GLabel("ConsoleProgram");
		add(label);
		double xLabelCoordinate = ((BOX_WIDTH - label.getWidth()) / 2);
		double yLabelCoordinate = (BOX_HEIGHT - label.getAscent() * 1.5);
		label.setLocation(xBoxCoordinate + xLabelCoordinate, yBoxCoordinate + yLabelCoordinate);
	}
	
	private void drawDialogLine() {
		// Find middle of the bottom of the Program Box
		double x0 = getWidth() / 2;
		double y0 = getHeight() / 2.5;
		
		//Find middle of the top of the Dialog Box
		double x1 = getWidth() / 2 + 2.5 * (BOX_WIDTH / 2);
		double y1 = (getHeight() / 2) + (BOX_HEIGHT * 0.5);
		
		GLine line = new GLine (x0, y0, x1, y1);
		add(line);
	}
	
	// Adding a Dialog Box with label 'DialogProgram' on canvas
	private void drawDialogBox() {
		double xBoxCoordinate = (getWidth() - BOX_WIDTH) / 9 * 8; 
		double yBoxCoordinate = (getHeight() + BOX_HEIGHT) / 2;
		GRect box = new GRect(xBoxCoordinate, yBoxCoordinate, BOX_WIDTH, BOX_HEIGHT);
		add(box);
		
		GLabel label = new GLabel("DialogProgram");
		add(label);
		double xLabelCoordinate = ((BOX_WIDTH - label.getWidth()) / 2);
		double yLabelCoordinate = (BOX_HEIGHT - label.getAscent() * 1.5);
		label.setLocation(xBoxCoordinate + xLabelCoordinate, yBoxCoordinate + yLabelCoordinate);
	}
}


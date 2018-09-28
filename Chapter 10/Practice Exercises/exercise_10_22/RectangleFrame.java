package exercise_10_22;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

/**
 * Change the RectangleComponent for the mouse listener program in Section 10.10 so that a new rectangle is added to the component
 * whenever the mouse is clicked. Hint: keep an ArrayList<Rectangle> and draw all rectangles in the paintComponent method.
 * 
 * @author Mayuresh
 *
 */
public class RectangleFrame extends JFrame
{
	// Instance Variables
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	private RectangleComponent scene;
	
	// Inner class
	class MousePressListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent event)
		{
			int x = event.getX();
			int y = event.getY();
			
			scene.addRectangleTo(x, y);
		}
	}
	
	// Constructors
	/**
	 * Constructs a rectangle frame
	 */
	public RectangleFrame()
	{
		scene = new RectangleComponent();
		add(scene);
		
		MouseAdapter listener = new MousePressListener();
		scene.addMouseListener(listener);
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	// Methods
}

package project9;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

/**
 * Write a program that allows the user to specify a triangle with three mouse presses. After the
 * first mouse press, draw a small dot. After the second mouse press, draw a line joining the first
 * two points. After the third mouse press, draw the entire triangle. The fourth mouse press erases
 * the old triangle and starts a new one.
 * 
 * @author Mayuresh
 *
 */
public class TriangleFrame extends JFrame
{
	// Instance Variables
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 600;
	
	private TriangleComponent scene;
	
	// Constructors
	/**
	 * Constructs a frame to hold the triangle
	 */
	public TriangleFrame()
	{
		scene = new TriangleComponent();
		add(scene);
		
		MouseAdapter listener = new MousePressListener();
		scene.addMouseListener(listener);
		
		setTitle("Draw A Triangle");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocation(400, 200);
	}
	// Methods
	
	// Inner Classes
	class MousePressListener extends MouseAdapter
	{
		private int mousePressCount = 0;
		
		public void mousePressed(MouseEvent event)
		{
			mousePressCount++;
			
			if(mousePressCount == 1 || mousePressCount == 2)
			{
				scene.addPoint(event.getX(), event.getY());
			}
			else if(mousePressCount == 3)
			{
				scene.addPoint(event.getX(), event.getY());
				scene.getTriangle();
			}
			else
			{
				scene.resetPoints();
				scene.resetTriangle();
				
				// Removes the triangle after the fourth click
				scene.repaint();
				
				mousePressCount = 0;
			}
		}
	}
}

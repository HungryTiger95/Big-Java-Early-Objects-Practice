package project18;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class CircleFrame extends JFrame
{
	// Instance Variables
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 600;
		
	private CircleComponent scene;
	
	// Constructors
	/**
	 * Constructs a circle frame with instructions on how to set up the JFrame
	 */
	public CircleFrame()
	{
		scene = new CircleComponent();
		add(scene);
		
		MouseAdapter mousePressListener = new MousePressListener();
		scene.addMouseListener(mousePressListener);
		
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
			
			if(mousePressCount == 1)
			{
				scene.addCenter(event.getX(), event.getY());
			}
			else if(mousePressCount == 2)
			{
				scene.addRadius(event.getX(), event.getY());
				scene.getCircle();
			}
			else
			{
				scene.resetData();
				scene.resetCircle();
				
				scene.repaint();
				
				mousePressCount = 0;
			}
		}
	}
}

package interface_example_10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class RectangleFrame extends JFrame
{
	private RectangleComponent scene;
	
	class MousePressListener implements MouseListener
	{
		public void mousePressed(MouseEvent event)
		{
			int x = event.getX();
			int y = event.getY();
			
			scene.moveRectangleTo(x, y);
		}
		
		public void mouseReleased(MouseEvent event)
		{
			
		}
		
		public void mouseClicked(MouseEvent event)
		{
			
		}
		
		public void mouseEntered(MouseEvent event)
		{
			
		}
		
		public void mouseExited(MouseEvent event)
		{
			
		}
	}
	
	public RectangleFrame()
	{
		scene = new RectangleComponent();
		add(scene);
		
		MouseListener listener = new MousePressListener();
		scene.addMouseListener(listener);
		
		setSize(500, 500);
	}
}

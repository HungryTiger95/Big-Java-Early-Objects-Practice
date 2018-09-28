package interface_example_10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * If you write programs that show drawings, and you want users to manipulate the drawings with
 * a mouse, then you need to process mouse events. A mouse listener must implement the MouseListener
 * interface, which contains the following five methods:
 * 
 * 		public interface MouseListener
 * 		{
 * 			// Called when a mouse button has been pressed on a component
 * 			void mousePressed(MouseEvent event);
 * 		
 * 			// Called when a mouse button has been released on a component
 * 			void mouseReleased(MouseEvent event);
 * 
 * 			// Called when a mouse button has been clicked on a component
 * 			void mouseClicked(MouseEvent event);
 * 
 * 			// Called when the mouse enters a component
 * 			void mouseEntered(MouseEvent event);
 * 
 * 			// Called when the mouse exits a component
 * 			void mouseExited(MouseEvent event);
 * 		}
 * 
 * 		MouseListener listener = new MyMouseListener();
 * 		component.addMouseListener(listener);
 * 
 * @author Mayuresh
 *
 */
public class RectangleComponent extends JComponent
{
	private Rectangle box;
	
	public RectangleComponent()
	{
		box = new Rectangle(100, 100, 50, 60);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g2.draw(box);
	}
	
	public void moveRectangleTo(int dx, int dy)
	{
		box.setLocation(dx, dy);
		repaint();
	}
}

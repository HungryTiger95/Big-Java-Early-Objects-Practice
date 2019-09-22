import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * Graphics E3.14
 * 
 * Write a program that fills the window with a large ellipse, with a black outline and
 * filled with your favorite color. The ellipse should touch the window boundaries,
 * even if the window is resized. Call the getWidth and getHeight methods of the
 * JComponent class in the paintComponent method.
 * 
 * @author Mayuresh
 *
 */

public class WindowEllipseComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover 2D Graphics
		Graphics2D g2 = (Graphics2D) g;
		
		// Initialize Shapes
		Ellipse2D.Double ellipse = new Ellipse2D.Double(10,10, getWidth() - 20, getHeight() - 20);
		
		// Draw Shapes
		g2.draw(ellipse);
		g2.setColor(Color.red);
		g2.fill(ellipse);
	}
}

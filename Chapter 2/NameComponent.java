import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * Graphics 2.19
 * 
 * Write a graphics program that draws your name in red, contained inside a blue
 * rectangle. Provide a class NameViewer and a class NameComponent.
 * 
 * @author Mayuresh
 *
 */

public class NameComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(80, 130, 90, 30);
		g2.setColor(Color.blue);
		g2.fill(box);
		
		g2.setColor(Color.red);
		g2.drawString("Mayuresh", 100, 150);
		
		
	}
}

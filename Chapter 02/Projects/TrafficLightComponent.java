import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * Graphics P2.12
 * 
 * Write a graphical program that draws a traffic light.
 * 
 * @author Mayuresh
 *
 */
public class TrafficLightComponent extends JComponent
{
	public void paint(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Rectangle
		Rectangle box = new Rectangle(190, 50, 100, 280);
		g2.setColor(Color.BLACK);
		g2.fill(box);
		
		// Red Light
		Ellipse2D.Double red = new Ellipse2D.Double(200, 60, 80, 80);
		g2.setColor(Color.RED);
		g2.fill(red);
		
		// Yellow Light
		Ellipse2D.Double yellow = new Ellipse2D.Double(200, 150, 80, 80);
		g2.setColor(Color.YELLOW);
		g2.fill(yellow);
		
		// Green Light
		Ellipse2D.Double green = new Ellipse2D.Double(200, 240, 80, 80);
		g2.setColor(Color.GREEN);
		g2.fill(green);
	}
	
	
}

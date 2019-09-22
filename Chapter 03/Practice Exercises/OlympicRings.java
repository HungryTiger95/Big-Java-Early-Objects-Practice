import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Graphics E3.21
 * 
 * Write a program that displays the Olympic rings.
 * Color the rings in the Olympic colors. Provide
 * classes OlympicRing, OlympicRingComponent, and OlympicRingViewer.
 * 
 * @author Mayuresh
 *
 */
public class OlympicRings
{
	// Instance Variables
	private int xPosition, yPosition;
	
	// Constructors
	public OlympicRings(int x, int y)
	{
		this.xPosition = x;
		this.yPosition = y;
	}
	// Methods
	public void draw(Graphics2D g2)
	{
		Ellipse2D.Double outerRing = new Ellipse2D.Double(xPosition, yPosition, 80, 80);
		Ellipse2D.Double innerRing = new Ellipse2D.Double(xPosition + 5, yPosition + 5, 70, 70);
		
		g2.draw(outerRing);
		g2.draw(innerRing);
	}
	
	public void moveTo(int x, int y)
	{
		this.xPosition = x;
		this.yPosition = y;
	}
}

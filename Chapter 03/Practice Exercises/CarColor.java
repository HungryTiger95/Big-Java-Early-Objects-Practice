import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Graphics E3.18/ Graphics E3.19
 * 
 * Change the Car viewer program from Section 3.8 to make the cars appear in different
 * colors. Each Car object should store its own color. Supply modified Car and CarComponent classes
 * 
 * @author Mayuresh
 *
 */
public class CarColor
{
	// Instance Variables
	private int xTop, yTop;
	private String size;
	private Color col;
	
	// Constructors
	/**
	 * Constructs a car
	 * @param xPosition x position.
	 * @param yPosition y position.
	 * @param size size multiplier. Cannot be 0. Default size is 1.
	 * @param color color of the car.
	 */
	public CarColor(int xPosition, int yPosition, Color color)
	{
		this.xTop = xPosition;
		this.yTop = yPosition;
		this.col = color;	
	}
	
	// Methods
	/**
	 * Draws the car.
	 * @param g2 the graphics content
	 */
	public void draw(Graphics2D g2)
	{
		Rectangle body = new Rectangle(xTop, yTop + 10, 60, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xTop + 10, yTop + 20, 10, 10);
		Ellipse2D.Double backTire = new Ellipse2D.Double(xTop + 40, yTop + 20, 10, 10);
		
		// The bottom of the front windsheild
		Point2D.Double r1 = new Point2D.Double((xTop + 10), (yTop + 10));
		
		// The front of the roof
		Point2D.Double r2 = new Point2D.Double((xTop + 20), yTop);
		
		// The rear of the roof
		Point2D.Double r3 = new Point2D.Double((xTop + 40), yTop);
		
		// The bottom of the rear windshield
		Point2D.Double r4 = new Point2D.Double((xTop + 50), (yTop + 10));
		
		// Make lines from the above points
		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
		
		Polygon RoofWindshield = new Polygon();
		RoofWindshield.addPoint((int) r1.getX(), (int) r1.getY());
		RoofWindshield.addPoint((int) r2.getX(), (int) r2.getY());
		RoofWindshield.addPoint((int) r3.getX(), (int) r3.getY());
		RoofWindshield.addPoint((int) r4.getX(), (int) r4.getY());
		
		g2.setColor(col);
		
		g2.fill(body);
		g2.fill(frontTire);
		g2.fill(backTire);
		g2.fillPolygon(RoofWindshield);
		//g2.draw(frontWindshield);
		//g2.draw(roofTop);
		//g2.draw(rearWindshield);
	}
}

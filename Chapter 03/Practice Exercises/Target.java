import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Graphcis E3.15
 * 
 * Draw a shooting target - a set of concentric rings in alternating black and white colors.
 * Hint: Fill a black circle, then fill a smaller white circle on top, and so on. You program
 * should be composed of classes Target, TargetCOmponent, and TargetViewer.
 * 
 * @author Mayuresh
 *
 */
public class Target
{
	private double xLeft;
	private double yTop;
	private double height;
	private double width;
	
	/**
	 * Constructs a target with given x, y, width, and height
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param width width of target
	 * @param height height of target
	 */
	public Target(int x, int y, double width, double height)
	{
		xLeft = x;
		yTop = y;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Draws the target
	 * @param g2 the graphics context
	 */
	public void draw(Graphics2D g2)
	{
		// Create the Shapes
		Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft, yTop, width, height);
		
		xLeft = xLeft + width * .125;
		yTop = yTop + height * .125;
		width = width * 0.75;
		height = height * 0.75;
		Ellipse2D.Double circle2 = new Ellipse2D.Double(xLeft, yTop, width, height);
		
		xLeft = xLeft + width * .125;
		yTop = yTop + height * .125;
		width = width * 0.75;
		height = height * 0.75;
		Ellipse2D.Double circle3 = new Ellipse2D.Double(xLeft, yTop, width, height);
		
		xLeft = xLeft + width * .125;
		yTop = yTop + height * .125;
		width = width * 0.75;
		height = height * 0.75;
		Ellipse2D.Double circle4 = new Ellipse2D.Double(xLeft, yTop, width, height);
		
		xLeft = xLeft + width * .30;
		yTop = yTop + height * .30;
		width = width * 0.40;
		height = height * 0.40;
		Ellipse2D.Double bullseye = new Ellipse2D.Double(xLeft, yTop, width, height);
		
		// Draw the shapes
		g2.setColor(Color.red);
		g2.fill(circle1);
		
		g2.setColor(Color.white);
		g2.fill(circle2);
		
		g2.setColor(Color.red);
		g2.fill(circle3);
		
		g2.setColor(Color.white);
		g2.fill(circle4);
		
		g2.setColor(Color.red);
		g2.fill(bullseye);
	}
}

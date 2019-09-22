import java.awt.Rectangle;

/**
 * Write an AreaTester program that constructs a Rectangle object and then computes and prints
 * its area. Use tbe getWidth and getHeight methods. Also print the expected answer
 * 
 * @author Mayuresh
 *
 */

public class AreaTester
{
	public static void main (String[] args)
	{
		double area;
		
		Rectangle rectangle = new Rectangle (5, 10, 20, 20);
		
		area = rectangle.getWidth() * rectangle.getHeight();
		
		System.out.println("Expected Area: 400");
		System.out.println("Area: " + area);
	}
}

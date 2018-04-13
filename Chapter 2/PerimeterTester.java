import java.awt.Rectangle;

/**
 * Testing E2.2
 * 
 * Write a PerimeterTester program that constructs a Rectangle object and then
 * computes and prints its perimeter. Use the getWidth and getHeight methods. Also print
 * the expected answer.
 * 
 * @author Mayuresh
 *
 */

public class PerimeterTester
{
	public static void main (String[] args)
	{
		double perimeter;
		
		Rectangle box = new Rectangle(10, 10, 5, 10);
		
		perimeter = (2 * box.getWidth()) + (2 * box.getHeight());
		
		System.out.println("Expected: 30");
		
		System.out.println("Perimeter: " + perimeter);
	}
}

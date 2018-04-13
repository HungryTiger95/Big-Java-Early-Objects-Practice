import java.awt.Rectangle;

/**
 * P2.3
 * 
 * The intersection method computes the intersection of two rectangles - that is, the rectangle
 * that would be formed by two overlapping rectangles if they were drawn. Call the method as:
 * 
 * 			Rectangle r3 = r1.intersection(r2);
 * 
 * Write a program IntersectionPrinter that constructs two rectangle objects, prints them, and
 * then prints the rectangle object that describes the intersection. Then the program should
 * print the result of the intersection method when the rectangles do not overlap. Add a comment
 * to your program that explains how you can tell whether the resulting rectangle is empty.
 * 
 * @author Mayuresh
 *
 */

public class IntersectionPrinter
{
	public static void main (String[] args)
	{
		Rectangle r1 = new Rectangle(10, 10, 50, 100);
		Rectangle r2 = new Rectangle(35, 60, 100, 50);
		
		System.out.println("Rectangle 1: " + r1);
		System.out.println("Rectangle 2: " + r2);
		
		Rectangle r3 = r1.intersection(r2);
		System.out.println("Rectangle 3: " + r3);
	}
}

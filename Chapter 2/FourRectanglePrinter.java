import java.awt.Rectangle;

/**
 * P2.1
 * 
 * Write a program called FourRectanglePrinter that constructs a Rectangle
 * object, prints its location by calling System.out.println(box), and then
 * translates and prints it three more times, so that, if the rectangles were
 * drawn, they would form one large rectangle.
 * 
 * @author Mayuresh
 *
 */

public class FourRectanglePrinter
{
	public static void main (String[] args)
	{
		Rectangle box = new Rectangle(50, 50, 50, 50);
		System.out.println(box);
		
		box.translate(100, 0);
		System.out.println(box);
		
		box.translate(0, 100);
		System.out.println(box);
		
		box.translate(-100, 0);
		System.out.println(box);
	}
}

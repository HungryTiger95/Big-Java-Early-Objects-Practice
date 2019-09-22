package exercise_10;

import org.junit.Test;
import org.junit.Assert;

public class BetterRectangleTester
{
	BetterRectangle box = new BetterRectangle(10, 10, 50, 20);
	
	@Test
	public void testPerimeter()
	{	
		double perimeter = box.getPerimeter();
		double expected = 140;
		
		Assert.assertEquals(expected, perimeter, 0.01);
	}
	
	@Test
	public void testArea()
	{
		double area = box.getArea();
		double expected = 1000;
		
		Assert.assertEquals(expected, area, 0.01);
	}
}

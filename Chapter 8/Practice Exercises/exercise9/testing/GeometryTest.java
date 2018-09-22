package exercise9.testing;

import java.awt.geom.Ellipse2D;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Assert;
import org.junit.Test;

import exercise9.Geometry;

public class GeometryTest
{
	NumberFormat formatter = new DecimalFormat("#0.00");
	
	@Test
	public void testPerimeter()
	{
		Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 30, 40);
		
		double perimeter = Geometry.perimeter(ellipse);
		
		Assert.assertEquals(110.52, Double.valueOf(formatter.format(perimeter)), .001);
	}
	
	@Test
	public void testArea()
	{
		Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 30, 40);
		
		double area = Geometry.area(ellipse);
		
		Assert.assertEquals(942.48, Double.valueOf(formatter.format(area)), .001);
	}
}

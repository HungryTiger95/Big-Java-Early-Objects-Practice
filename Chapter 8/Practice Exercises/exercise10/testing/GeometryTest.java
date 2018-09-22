package exercise10.testing;

import java.awt.geom.Point2D;

import org.junit.Assert;
import org.junit.Test;

import exercise10.Geometry;

public class GeometryTest
{
	@Test
	public void testSlope()
	{
		Point2D.Double p = new Point2D.Double(3, 1);
		Point2D.Double q = new Point2D.Double(9,-4);
		
		double slope = Geometry.slope(p, q);
		double expected = -0.833;
		
		Assert.assertEquals(expected, slope, .01);
	}
	
	@Test
	public void testAngle()
	{
		Point2D.Double p = new Point2D.Double(3, 1);
		Point2D.Double q = new Point2D.Double(9,-4);
		
		double slope = Geometry.angle(p, q);
		double expected = 320.19;
		
		Assert.assertEquals(expected, slope, .01);
	}
}

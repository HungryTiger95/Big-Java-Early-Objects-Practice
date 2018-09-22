package exercise11.testing;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

import org.junit.Assert;
import org.junit.Test;

import exercise11.Geometry;

public class GeometryTest
{
	@Test
	public void testIsInside()
	{
		// Point on the boundary of ellipse
		Point2D.Double p1 = new Point2D.Double(-10, 0);
		
		// Point inside the ellipse
		Point2D.Double p2 = new Point2D.Double(5, -6);
		
		// Point outside the ellipse
		Point2D.Double p3 = new Point2D.Double(8, 6);
		
		Ellipse2D.Double e = new Ellipse2D.Double(0, 0, 20, 16);
		
		boolean onBoundary = Geometry.isInside(p1, e);
		boolean inside = Geometry.isInside(p2, e);
		boolean outside = Geometry.isInside(p3, e);
		
		Assert.assertEquals(false, onBoundary);
		Assert.assertEquals(true, inside);
		Assert.assertEquals(false, outside);
	}
	
	@Test
	public void testIsOnBoundary()
	{
		// Point on the boundary of ellipse
		Point2D.Double p1 = new Point2D.Double(-10, 0);
		
		// Point inside the ellipse
		Point2D.Double p2 = new Point2D.Double(5, -6);
		
		// Point outside the ellipse
		Point2D.Double p3 = new Point2D.Double(8, 6);
		
		Ellipse2D.Double e = new Ellipse2D.Double(0, 0, 20, 16);
		
		boolean onBoundary = Geometry.isOnBoundary(p1, e);
		boolean inside = Geometry.isOnBoundary(p2, e);
		boolean outside = Geometry.isOnBoundary(p3, e);
		
		Assert.assertEquals(true, onBoundary);
		Assert.assertEquals(false, inside);
		Assert.assertEquals(false, outside);		
	}
}

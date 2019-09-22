package exercise6.geometrytest;

import org.junit.Test;
import org.junit.Assert;

import exercise6.Cylinder;

public class CylinderTest
{
	@Test
	public void testCylinderVolume()
	{
		Cylinder cylinder  = new Cylinder(5, 5);
		
		double volume = cylinder.getVolume();
		double expected = 392.7;
		
		Assert.assertEquals(expected, volume, Math.E);
	}
	
	@Test
	public void testCylinderSurface()
	{
		Cylinder cylinder = new Cylinder(5, 5);
		
		double surfaceA = cylinder.getSurfaceArea();
		double expected = 314.16;
		
		Assert.assertEquals(expected, surfaceA, Math.E);
	}
}

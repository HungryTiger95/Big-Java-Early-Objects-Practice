package exercise6.geometrytest;

import org.junit.Assert;
import org.junit.Test;

import exercise6.Cone;

public class ConeTest
{
	@Test
	public void testConeVolume()
	{
		Cone cone = new Cone(5, 5);
		
		double volume = cone.getVolume();
		double expected = 130.9;
		
		Assert.assertEquals(expected, volume, Math.E);
	}
	
	@Test
	public void testConeSurface()
	{
		Cone cone = new Cone(5, 5);
		
		double surfaceA = cone.getSurfaceArea();
		double expected = 189.61;
		
		Assert.assertEquals(expected, surfaceA, Math.E);
	}
}

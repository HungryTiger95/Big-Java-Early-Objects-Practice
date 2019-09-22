package exercise6.geometrytest;

import org.junit.Assert;
import org.junit.Test;

import exercise6.Sphere;

public class SphereTest
{
	@Test
	public void testSphereVolume()
	{
		Sphere sphere = new Sphere(5);
		
		double volume = sphere.getVolume();
		double expected = 523.6;
		
		Assert.assertEquals(expected, volume, Math.E);
	}
	@Test
	public void testSphereSurface()
	{
		Sphere sphere = new Sphere(5);
		
		double surfaceA = sphere.getSurfaceArea();
		double expected = 314.16;
		
		Assert.assertEquals(expected, surfaceA, Math.E);
	}
}

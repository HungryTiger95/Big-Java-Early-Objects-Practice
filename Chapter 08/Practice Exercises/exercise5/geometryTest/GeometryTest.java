package exercise5.geometryTest;

import org.junit.Assert;
import org.junit.Test;

import exercise5.Geometry;

public class GeometryTest
{
	private double height = 5;
	private double radius = 5;
	
	@Test
	public void testCubeVolume()
	{
		double computedVolume = Geometry.cubeVolume(height);
		double expected = 125.00;
		
		Assert.assertEquals(expected, computedVolume, Math.E);
	}
	
	@Test
	public void testCubeSurface()
	{
		double computedSurface = Geometry.cubeSurface(height);
		double expected = 150.00;
		
		Assert.assertEquals(expected, computedSurface, Math.E);
	}
	
	@Test
	public void testSphereVolume()
	{
		double computedVolume = Geometry.sphereVolume(radius);
		double expected = 523.6;
		
		Assert.assertEquals(expected, computedVolume, Math.E);
	}
	
	@Test
	public void testSpereSurface()
	{
		double computedSurface = Geometry.sphereSurface(radius);
		double expected = 314.16;
		
		Assert.assertEquals(expected, computedSurface, Math.E);
	}
	
	@Test
	public void testCylinderVolume()
	{
		double computedVolume = Geometry.cylinderVolume(radius, height);
		double expected = 392.7;
		
		Assert.assertEquals(expected, computedVolume, Math.E);
	}
	
	@Test
	public void testCylinderSurface()
	{
		double computedSurface = Geometry.cylinderSurface(radius, height);
		double expected = 314.16;
		
		Assert.assertEquals(expected, computedSurface, Math.E);
	}
	
	@Test
	public void testConeVolume()
	{
		double computedVolume = Geometry.coneVolume(radius, height);
		double expected = 130.9;
		
		Assert.assertEquals(expected, computedVolume, Math.E);
	}
	
	@Test
	public void testConeSurface()
	{
		double computedSurface = Geometry.coneSurface(radius, height);
		double expected = 189.61;
		
		Assert.assertEquals(expected, computedSurface, Math.E);
	}
}

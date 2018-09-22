package exercise6.geometrytest;

import org.junit.Assert;
import org.junit.Test;

import exercise6.Cube;

public class CubeTest
{
	@Test
	public void testCubeVolume()
	{
		Cube cube = new Cube(5);
		
		double volume = cube.getVolume();
		double expected = 125.00;
		
		Assert.assertEquals(expected, volume, Math.E);
	}
	
	@Test
	public void testCubeSurface()
	{
		Cube cube = new Cube(5);
		
		double surfaceA = cube.getSurfaceArea();
		double expected = 150.00;
		
		Assert.assertEquals(expected, surfaceA, Math.E);
	}
}

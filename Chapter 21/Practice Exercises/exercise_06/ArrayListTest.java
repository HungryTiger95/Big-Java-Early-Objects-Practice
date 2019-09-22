package exercise_06;

import java.awt.Rectangle;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListTest
{
	@Test
	public void testInitialCapacity()
	{
		ArrayList<Rectangle> rectList = new ArrayList<>();
		Assert.assertEquals(10, rectList.getInternalArraySize());
		
		rectList = new ArrayList<>(40);
		Assert.assertEquals(40, rectList.getInternalArraySize());
	}
	
	@Test
	public void testSize()
	{
		ArrayList<Rectangle> rectList = new ArrayList<>();
		Assert.assertEquals(0, rectList.size());
		
		rectList.addLast(new Rectangle(10, 10, 100, 100));
		rectList.addLast(new Rectangle(20, 20, 100, 100));
		Assert.assertEquals(2, rectList.size());
	}
	
	@Test
	public void testGet1()
	{
		ArrayList<Rectangle> rectList = new ArrayList<>();
		rectList.addLast(new Rectangle(10, 10, 100, 100));
		rectList.addLast(new Rectangle(20, 20, 100, 100));
		
		Assert.assertEquals(10, rectList.get(0).getX(), 0.001);
		Assert.assertEquals(10, rectList.get(0).getY(), 0.001);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testGet2()
	{
		ArrayList<Rectangle> rectList = new ArrayList<>();
		rectList.addLast(new Rectangle(10, 10, 100, 100));
		rectList.addLast(new Rectangle(20, 20, 100, 100));
		rectList.addLast(new Rectangle(30, 30, 100, 100));
		rectList.addLast(new Rectangle(40, 40, 100, 100));
		rectList.addLast(new Rectangle(50, 50, 100, 100));
		rectList.addLast(new Rectangle(60, 60, 100, 100));
		
		Assert.assertEquals(10, rectList.get(0).getX(), 0.001);
		Assert.assertEquals(10, rectList.get(0).getY(), 0.001);
		
		Assert.assertEquals(20, rectList.get(1).getX(), 0.001);
		Assert.assertEquals(20, rectList.get(1).getY(), 0.001);
		
		Assert.assertEquals(30, rectList.get(2).getX(), 0.001);
		Assert.assertEquals(30, rectList.get(2).getY(), 0.001);
		
		Assert.assertEquals(40, rectList.get(3).getX(), 0.001);
		Assert.assertEquals(40, rectList.get(3).getY(), 0.001);
		
		Assert.assertEquals(50, rectList.get(4).getX(), 0.001);
		Assert.assertEquals(50, rectList.get(4).getY(), 0.001);
		
		Assert.assertEquals(60, rectList.get(5).getX(), 0.001);
		Assert.assertEquals(60, rectList.get(5).getY(), 0.001);
		
		Assert.assertEquals(70, rectList.get(6).getX(), 0.001);
		Assert.assertEquals(70, rectList.get(6).getY(), 0.001);
	}
	
	@Test
	public void testSet()
	{
		ArrayList<Rectangle> rectList = new ArrayList<>();
		rectList.addLast(new Rectangle(10, 10, 100, 100));
		rectList.addLast(new Rectangle(20, 20, 100, 100));
		rectList.addLast(new Rectangle(30, 30, 100, 100));
		rectList.addLast(new Rectangle(40, 40, 100, 100));
		rectList.addLast(new Rectangle(50, 50, 100, 100));
		rectList.addLast(new Rectangle(60, 60, 100, 100));
		
		rectList.set(2, new Rectangle(50, 50, 100, 100));
		rectList.set(5, new Rectangle(100, 100, 100, 100));
		
		Assert.assertEquals(10, rectList.get(0).getX(), 0.001);
		Assert.assertEquals(10, rectList.get(0).getY(), 0.001);
		
		Assert.assertEquals(20, rectList.get(1).getX(), 0.001);
		Assert.assertEquals(20, rectList.get(1).getY(), 0.001);
		
		Assert.assertEquals(50, rectList.get(2).getX(), 0.001);
		Assert.assertEquals(50, rectList.get(2).getY(), 0.001);
		
		Assert.assertEquals(40, rectList.get(3).getX(), 0.001);
		Assert.assertEquals(40, rectList.get(3).getY(), 0.001);
		
		Assert.assertEquals(50, rectList.get(4).getX(), 0.001);
		Assert.assertEquals(50, rectList.get(4).getY(), 0.001);
		
		Assert.assertEquals(100, rectList.get(5).getX(), 0.001);
		Assert.assertEquals(100, rectList.get(5).getY(), 0.001);
	}
	
	@Test
	public void testRemove() throws InterruptedException
	{
		ArrayList<Rectangle> rectList = new ArrayList<>();
		rectList.addLast(new Rectangle(10, 10, 100, 100));
		rectList.addLast(new Rectangle(20, 20, 100, 100));
		rectList.addLast(new Rectangle(30, 30, 100, 100));
		rectList.addLast(new Rectangle(40, 40, 100, 100));
		rectList.addLast(new Rectangle(50, 50, 100, 100));
		rectList.addLast(new Rectangle(60, 60, 100, 100));
		
		rectList.remove(2);
		rectList.remove(4);
		
		Assert.assertEquals(4, rectList.size());
		
		Assert.assertEquals(10, rectList.get(0).getX(), 0.001);
		Assert.assertEquals(10, rectList.get(0).getY(), 0.001);
		
		Assert.assertEquals(20, rectList.get(1).getX(), 0.001);
		Assert.assertEquals(20, rectList.get(1).getY(), 0.001);
		
		Assert.assertEquals(40, rectList.get(2).getX(), 0.001);
		Assert.assertEquals(40, rectList.get(2).getY(), 0.001);
		
		Assert.assertEquals(50, rectList.get(3).getX(), 0.001);
		Assert.assertEquals(50, rectList.get(3).getY(), 0.001);
	}
	
	@Test
	public void testAdd()
	{
		ArrayList<Rectangle> rectList = new ArrayList<>();
		rectList.addLast(new Rectangle(10, 10, 100, 100));
		rectList.addLast(new Rectangle(20, 20, 100, 100));
		rectList.addLast(new Rectangle(30, 30, 100, 100));
		rectList.addLast(new Rectangle(40, 40, 100, 100));
		rectList.addLast(new Rectangle(50, 50, 100, 100));
		rectList.addLast(new Rectangle(60, 60, 100, 100));
		
		rectList.add(3, new Rectangle(100, 100, 100, 100));
		rectList.add(5, new Rectangle(110, 110, 100, 100));
		
		Assert.assertEquals(8, rectList.size());
		
		Assert.assertEquals(10, rectList.get(0).getX(), 0.001);
		Assert.assertEquals(10, rectList.get(0).getY(), 0.001);
		
		Assert.assertEquals(20, rectList.get(1).getX(), 0.001);
		Assert.assertEquals(20, rectList.get(1).getY(), 0.001);
		
		Assert.assertEquals(30, rectList.get(2).getX(), 0.001);
		Assert.assertEquals(30, rectList.get(2).getY(), 0.001);
		
		Assert.assertEquals(100, rectList.get(3).getX(), 0.001);
		Assert.assertEquals(100, rectList.get(3).getY(), 0.001);
		
		Assert.assertEquals(40, rectList.get(4).getX(), 0.001);
		Assert.assertEquals(40, rectList.get(4).getY(), 0.001);
		
		Assert.assertEquals(110, rectList.get(5).getX(), 0.001);
		Assert.assertEquals(110, rectList.get(5).getY(), 0.001);
		
		Assert.assertEquals(50, rectList.get(6).getX(), 0.001);
		Assert.assertEquals(50, rectList.get(6).getY(), 0.001);
		
		Assert.assertEquals(60, rectList.get(7).getX(), 0.001);
		Assert.assertEquals(60, rectList.get(7).getY(), 0.001);
	}
	
	@Test
	public void testGrow()
	{
		ArrayList<Rectangle> rectList = new ArrayList<>();
		rectList.addLast(new Rectangle(10, 10, 100, 100));
		rectList.addLast(new Rectangle(20, 20, 100, 100));
		rectList.addLast(new Rectangle(30, 30, 100, 100));
		rectList.addLast(new Rectangle(40, 40, 100, 100));
		rectList.addLast(new Rectangle(50, 50, 100, 100));
		rectList.addLast(new Rectangle(60, 60, 100, 100));
		rectList.addLast(new Rectangle(70, 70, 100, 100));
		rectList.addLast(new Rectangle(80, 80, 100, 100));
		rectList.addLast(new Rectangle(90, 90, 100, 100));
		rectList.addLast(new Rectangle(100, 100, 100, 100));
		rectList.addLast(new Rectangle(110, 110, 100, 100));
		rectList.addLast(new Rectangle(120, 120, 100, 100));
		rectList.addLast(new Rectangle(130, 130, 100, 100));
		rectList.addLast(new Rectangle(140, 140, 100, 100));
		
		Assert.assertEquals(14, rectList.size());
		Assert.assertEquals(20, rectList.getInternalArraySize());
	}
}

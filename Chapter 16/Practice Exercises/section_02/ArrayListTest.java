package section_02;

import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class ArrayListTest
{
	@Test
	public void testConstructor()
	{
		ArrayList list = new ArrayList();
		Assert.assertEquals(0, list.size());
		Assert.assertEquals(10, list.getElementsArraySize());
		
		System.out.println("Test 1: " + list.toString());
	}
	
	@Test
	public void testSize()
	{
		ArrayList list = new ArrayList();
		Random gen = new Random();
		
		for(int i = 0; i < 15; i++)
		{
			list.add(i, gen.nextInt(25) + 1);
		}
		
		Assert.assertEquals(15, list.size());
		Assert.assertEquals(20, list.getElementsArraySize());
		
		System.out.println("Test 2: " + list.toString());
	}

	@Test
	public void testGet()
	{
		ArrayList list = new ArrayList();
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		
		Assert.assertEquals(6, list.get(5));
		System.out.println("Test 3: " + list.toString());
	}
	
	@Test
	public void testSet()
	{
		ArrayList list = new ArrayList();
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		
		int num = 12;
		list.set(3, num);
		
		Assert.assertEquals(12, list.get(3));
		System.out.println("Test 4: " + list.toString());
	}
	
	@Test
	public void testRemove()
	{
		ArrayList list = new ArrayList();
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		
		Assert.assertEquals(6, list.get(4));
		Assert.assertEquals(5, list.size());
		System.out.println("Test 5: " + list.toString());
	}
}

package exercise_10;

import org.junit.Test;
import org.junit.Assert;

public class ListTest
{
	@Test
	public void testRemoveLast()
	{
		ArrayList list = new ArrayList();
		
		int val = 10;
		for(int i = 0; i < 15; i++)
		{
			list.addLast(val);
			val += 10;
		}
		System.out.println(list.printInternalArray());
		
		int element = (int) list.removeLast();
		
		Assert.assertEquals(20, list.getInternalArraySize());
		Assert.assertEquals(14, list.size());
		Assert.assertEquals(150, element);
	}
	
	@Test
	public void testRemoveLast2()
	{
		ArrayList list = new ArrayList();
		
		int val = 10;
		for(int i = 0; i < 50; i++)
		{
			list.addLast(val);
			val += 10;
		}
		System.out.println(list.printInternalArray());
		
		for(int i = 50; i > 10; i--)
		{
			list.removeLast();
		}
		System.out.println(list.printInternalArray());
		
		Assert.assertEquals(10, list.size());
		Assert.assertEquals(40, list.getInternalArraySize());
	}
}

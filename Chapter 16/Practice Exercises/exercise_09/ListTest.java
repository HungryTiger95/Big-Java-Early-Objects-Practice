package exercise_09;

import org.junit.Test;
import org.junit.Assert;

import java.util.ListIterator;

public class ListTest
{
	@Test
	public void testIterator()
	{
		ArrayList list = new ArrayList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		
		ListIterator iter = list.listIterator();
		
		System.out.print("Iter Test: \n");
		while(iter.hasNext())
		{
			int val = (int) iter.next();
			System.out.print("[" + val + "]");
		}
		System.out.println("\n");
	}

	@Test
	public void testNextIterator()
	{
		ArrayList list = new ArrayList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		
		ListIterator iter = list.listIterator();
		
		iter.next();
		int val1 = (int) iter.next();
		
		Assert.assertEquals(20, val1);
		
		iter.next();
		iter.next();
		int val2 = (int) iter.next();
		
		Assert.assertEquals(50, val2);
	}
	
	@Test
	public void testPreviousIterator()
	{
		ArrayList list = new ArrayList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		
		ListIterator iter = list.listIterator();
		
		while(iter.hasNext())
		{
			iter.next();
		}
		
		// Iter is now at the end
		iter.previous();
		iter.previous();
		int val1 = (int) iter.previous();
		
		Assert.assertEquals(30, val1);
		Assert.assertEquals(20, iter.previous());
		Assert.assertEquals(10, iter.previous());
	}
	
	@Test
	public void testNextIndex()
	{
		ArrayList list = new ArrayList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		
		ListIterator iter = list.listIterator();
		
		for(int i = 0; i < 3; i++)
		{
			iter.next();
		}
		
		Assert.assertEquals(3, iter.nextIndex());
		Assert.assertEquals(1, iter.previousIndex());
		
		iter.next();
		
		Assert.assertEquals(4, iter.nextIndex());
		Assert.assertEquals(2, iter.previousIndex());
	}
	
	@Test
	public void testRemove()
	{
		ArrayList list = new ArrayList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		
		ListIterator iter = list.listIterator();
		
		for(int i = 0; i < 3; i++)
		{
			iter.next();
		}
		
		iter.remove();
		
		ListIterator iter2 = list.listIterator();
		System.out.print("Remove Test: \n");
		while(iter2.hasNext())
		{
			int val = (int) iter2.next();
			System.out.print("[" + val + "]");
		}
		System.out.println("\n");
		
		Assert.assertEquals(40, list.get(2));
		Assert.assertEquals(5, list.size());
	}
	
	@Test
	public void testSet()
	{
		ArrayList list = new ArrayList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		
		ListIterator iter = list.listIterator();
		
		for(int i = 0; i < 3; i++)
		{
			iter.next();
		}
		
		iter.set(300);
		
		ListIterator iter2 = list.listIterator();
		System.out.print("Set Test: \n");
		while(iter2.hasNext())
		{
			int val = (int) iter2.next();
			System.out.print("[" + val + "]");
		}
		System.out.println("\n");
		
		Assert.assertEquals(300, list.get(2));
		Assert.assertEquals(6, list.size());
	}
	
	@Test
	public void testAdd()
	{
		ArrayList list = new ArrayList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		
		ListIterator iter = list.listIterator();
		
		for(int i = 0; i < 3; i++)
		{
			iter.next();
		}
		
		iter.add(25);
		
		ListIterator iter2 = list.listIterator();
		System.out.print("Add Test: \n");
		while(iter2.hasNext())
		{
			int val = (int) iter2.next();
			System.out.print("[" + val + "]");
		}
		System.out.println("\n");
		
		Assert.assertEquals(25, list.get(2));
		Assert.assertEquals(7, list.size());
	}
}

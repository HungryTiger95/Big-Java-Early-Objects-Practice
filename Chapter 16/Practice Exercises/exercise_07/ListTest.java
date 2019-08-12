package exercise_07;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

public class ListTest
{
	@Test
	public void testLinkedList()
	{
		LinkedList list = new LinkedList();
		Random gen = new Random();
		
		for(int i = 0; i < 10; i++)
		{
			int num = gen.nextInt(10) + 1;
			list.addFirst(num);
		}
		
		System.out.println("First Test: " + list.toString());
		
		Assert.assertEquals(10, list.getSize());
	}
	
	@Test
	public void testListIterator()
	{
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);
		list.addFirst(60);
		
		ListIterator iter = list.getListIterator();
		int num1 = (int) iter.next();
		int num2 = (int) iter.next();
		int num3 = (int) iter.next();
		
		Assert.assertEquals(50, num2);
		Assert.assertEquals(40, num3);
		Assert.assertEquals(60, num1);
	}
	
	@Test
	public void testListIteratorAdd()
	{
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);
		list.addFirst(60);
		
		//System.out.println("Third Test: " + list.toString());
		
		ListIterator iter = list.getListIterator();
		
		int loop = 0;
		while(iter.hasNext())
		{
			if(loop == 2)
			{
				iter.add(100);
			}
			else
			{
				iter.next();
			}
			
			loop++;
		}
		
		System.out.println("Third Test: " + list.toString());
	}
	
}

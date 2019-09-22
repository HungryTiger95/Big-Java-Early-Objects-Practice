package exercise_04;

import java.awt.Rectangle;
import java.util.Random;

import org.junit.Test;
import org.junit.Assert;

public class SizeTest
{
	@Test
	public void testSize()
	{
		MyLinkedList list = new MyLinkedList();
		list.addFirst(new Rectangle(10, 10, 10, 10));
		list.addFirst(new Rectangle(20, 20, 20, 20));
		list.addFirst(new Rectangle(30, 30, 30, 30));
		list.addFirst(new Rectangle(40, 40, 40, 40));
		list.addFirst(new Rectangle(50, 50, 50, 50));
		list.addFirst(new Rectangle(60, 60, 60, 60));
		
		Assert.assertEquals(6, list.size());
	}
	
	@Test
	public void testSizeRandom()
	{
		MyLinkedList list = new MyLinkedList();
		
		for(int i = 0; i < 15; i++)
		{
			Random gen = new Random();
			
			int n = gen.nextInt(100) + 1;
			list.addFirst(n);
		}
		
		System.out.println("Random Linked List Size: " + list.size());
		System.out.println(list.toString());
		
		Assert.assertEquals(15, list.size());
	}
}

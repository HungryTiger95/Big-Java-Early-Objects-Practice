package exercise_06;

import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class ListTest
{
	@Test
	public void testUno()
	{
		MyLinkedList list = new MyLinkedList();
		Random gen = new Random();
		
		for(int i = 0; i < 15; i++)
		{
			list.addFirst(gen.nextInt(30) + 1);
		}
		list.removeFirst();
		
		System.out.println("List Size: " + list.size());
		System.out.println(list.toString());
		
		Assert.assertEquals(14, list.size());
	}

	@Test
	public void testDos()
	{
		MyLinkedList list = new MyLinkedList();
		Random gen = new Random();
		
		list.addFirst(gen.nextInt(30) + 1);
		list.addFirst(gen.nextInt(30) + 1);
		list.addFirst(gen.nextInt(30) + 1);
		list.addFirst(gen.nextInt(30) + 1);
		list.addFirst(gen.nextInt(30) + 1);
		
		for(int i = 0; i < 2; i++)
		{
			list.removeFirst();
		}
		
		System.out.println("List Size: " + list.size());
		System.out.println(list.toString());
		
		Assert.assertEquals(3, list.size());
	}
}

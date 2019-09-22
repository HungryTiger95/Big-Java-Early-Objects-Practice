package exercise_05;

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
		System.out.println("List Size: " + list.size());
		System.out.println(list.toString());
		
		Assert.assertEquals(15, list.size());
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
		
		System.out.println("List Size: " + list.size());
		System.out.println(list.toString());
		
		Assert.assertEquals(5, list.size());
	}
}

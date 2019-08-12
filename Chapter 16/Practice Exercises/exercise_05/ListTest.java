package exercise_05;

import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

/**
 * Solve Exercise 4 recursively by calling a recursive helper method
 * 
 * 		private static int size(Node start)
 * 
 * Hint: if start is null, then the size is 0. Otherwise, it is one larger than
 * the size of start.next.
 * 
 * @author Mayuresh
 *
 */
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

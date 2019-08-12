package exercise_06;

import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

/**
 * Add an instance varible currentSize to our implementation of the LinkedList class.
 * Modify the add, addLast, and remove methods of both the linked list and the list
 * iterator to update the currentSize variable so that it contains the correct size.
 * Change the size method of Exercise 4 so that it simply returns the value of this
 * instance variable.
 * 
 * @author Mayuresh
 *
 */
public class ListTest
{
	private Random gen = new Random();
	
	@Test
	public void testUno()
	{
		MyLinkedList list = new MyLinkedList();
		
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

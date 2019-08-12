package exercise_01;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseTest
{
	@Test
	public void testMyReverse()
	{
		LinkedList list = new LinkedList();
		
		list.addFirst("Ananya");
		list.addFirst("Aarohi");
		list.addFirst("Payal");
		list.addFirst("Nidhi");
		list.addFirst("Anika");
		
		String[] e1 = {"Anika", "Nidhi", "Payal", "Aarohi", "Ananya"};
		Assert.assertEquals(Arrays.asList(e1), list.toArray());
		
		list.reverse();;
		
		String[] e2 = {"Ananya", "Aarohi", "Payal", "Nidhi", "Anika"};
		Assert.assertEquals(Arrays.asList(e2), list.toArray());
	}
	
	@Test
	public void testMyReverse2()
	{
		LinkedList list = new LinkedList();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		
		// Print out the Original Linked List
		Object[] expected = {5, 4, 3, 2, 1};
		Assert.assertEquals(Arrays.asList(expected), list.toArray());

		list.reverse();

		// Print out the Reversed Linked List
		Object[] otherExpected = {1, 2, 3, 4, 5};
		Assert.assertEquals(Arrays.asList(otherExpected), list.toArray());
	}
	
	@Test
	public void testBetterReverse()
	{
		LinkedList list = new LinkedList();

		list.addFirst("Ananya");
		list.addFirst("Aarohi");
		list.addFirst("Payal");
		list.addFirst("Nidhi");
		list.addFirst("Anika");

		String[] e1 = {"Anika", "Nidhi", "Payal", "Aarohi", "Ananya"};
		Assert.assertEquals(Arrays.asList(e1), list.toArray());

		list.betterReverse();

		String[] e2 = {"Ananya", "Aarohi", "Payal", "Nidhi", "Anika"};
		Assert.assertEquals(Arrays.asList(e2), list.toArray());
	}
	
	@Test
	public void testBetterReverse2()
	{
		LinkedList list = new LinkedList();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		
		// Print out the Original Linked List
		Object[] expected = {5, 4, 3, 2, 1};
		Assert.assertEquals(Arrays.asList(expected), list.toArray());

		list.betterReverse();

		// Print out the Reversed Linked List
		Object[] otherExpected = {1, 2, 3, 4, 5};
		Assert.assertEquals(Arrays.asList(otherExpected), list.toArray());
	}
}

package exercise_14;

import org.junit.Test;
import org.junit.Assert;

public class QueueTest
{
	@Test
	public void testLastToFirst()
	{
		Queue q = new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		
		Assert.assertEquals(10, q.getFirst());
		Assert.assertEquals(90, q.getLast());
		Assert.assertEquals(9, q.getCurrentSize());
		System.out.println("Original: " + q.toString());
		
		q.lastToFirst();
		Assert.assertEquals(90, q.getFirst());
		Assert.assertEquals(80, q.getLast());
		System.out.println("Last To First 1: " + q.toString());
		
		q.lastToFirst();
		Assert.assertEquals(80, q.getFirst());
		Assert.assertEquals(70, q.getLast());
		System.out.println("Last To First 2: " + q.toString());
		
		q.firstToLast();
		Assert.assertEquals(90, q.getFirst());
		Assert.assertEquals(80, q.getLast());
		System.out.println("First To Last 1: " + q.toString());
	}
}

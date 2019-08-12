package exercise_13;

import org.junit.Test;
import org.junit.Assert;

public class QueueTest
{
	@Test
	public void testFirstToLast()
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
		
		Assert.assertEquals(9, q.getCurrentSize());
		Assert.assertEquals(10, q.getFirst());
		Assert.assertEquals(90, q.getLast());
		System.out.println("Original: " + q.toString());
		
		q.firstToLast();
		
		Assert.assertEquals(9, q.getCurrentSize());
		Assert.assertEquals(20, q.getFirstNodeRef().data);
		Assert.assertEquals(30, q.getFirstNodeRef().next.data);
		Assert.assertEquals(10, q.getLastNodeRef().data);
		System.out.println("First-to-Last: " + q.toString());
		
		q.firstToLast();
		
		Assert.assertEquals(9, q.getCurrentSize());
		Assert.assertEquals(30, q.getFirstNodeRef().data);
		Assert.assertEquals(40, q.getFirstNodeRef().next.data);
		Assert.assertEquals(20, q.getLastNodeRef().data);
		System.out.println("First-to-Last2: " + q.toString());
	}
	
	@Test
	public void testIterator()
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
		
		Assert.assertEquals(9, q.getCurrentSize());
		Assert.assertEquals(10, q.getFirst());
		Assert.assertEquals(90, q.getLast());
		
		// Simply Iterate through the queue
		MyQueueIterator iter = q.queueIterator();
		
		int actualVal = 10;
		while(iter.hasNext())
		{
			int val = (int) iter.next();
			Assert.assertEquals(actualVal, val);
			
			actualVal += 10;
		}
	}
	
	@Test
	public void testIteratorAdd()
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
		
		// Prelim tests
		Assert.assertEquals(9, q.getCurrentSize());
		Assert.assertEquals(10, q.getFirst());
		Assert.assertEquals(90, q.getLast());
		
		// Iterate through the first 3 elements in the queue and assert
		MyQueueIterator iter = q.queueIterator();
		Object obj1 = iter.next();
		Object obj2 = iter.next();
		Object obj3 = iter.next();
		
		Assert.assertEquals(10, obj1);
		Assert.assertEquals(20, obj2);
		Assert.assertEquals(30, obj3);
		
		// Add a new object in the middle of the queue
		iter.add(100);
		
		// Assert that the size increased
		Assert.assertEquals(10, q.getCurrentSize());
		
		// Iterate through again and print the queue, the new object should show up
		MyQueueIterator iter2 = q.queueIterator();
		while(iter2.hasNext())
		{
			System.out.println(iter2.next());
		}
		System.out.println();
	}
}

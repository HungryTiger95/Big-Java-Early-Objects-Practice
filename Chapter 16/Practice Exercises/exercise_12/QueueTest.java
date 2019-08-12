package exercise_12;

import org.junit.Test;
import org.junit.Assert;

public class QueueTest
{
	@Test
	public void testRemove()
	{
		Queue q = new Queue();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		Object obj = q.remove();
		Assert.assertEquals(10, obj);
	}
	
	@Test
	public void testAdd()
	{
		Queue q = new Queue();
		
		Assert.assertEquals(true, q.isEmpty());
		Assert.assertEquals(0, q.getCurrentSize());
		
		q.add(10);
		
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(1, q.getCurrentSize());
	}
	
	@Test
	public void testSuite()
	{
		Queue q = new Queue();
		
		Assert.assertEquals(true, q.isEmpty());
		Assert.assertEquals(0, q.getCurrentSize());
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(3, q.getCurrentSize());
		Assert.assertEquals(10, q.getFirst());
		Assert.assertEquals(30, q.getLast());
		
		q.add(40);
		q.add(50);
		q.add(60);
		
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(6, q.getCurrentSize());
		Assert.assertEquals(10, q.getFirst());
		Assert.assertEquals(60, q.getLast());
		
		Object obj1 = q.remove();
		Object obj2 = q.remove();
		
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(4, q.getCurrentSize());
		Assert.assertEquals(30, q.getFirst());
		Assert.assertEquals(60, q.getLast());
		
		Assert.assertEquals(10, obj1);
		Assert.assertEquals(20, obj2);
	}
}

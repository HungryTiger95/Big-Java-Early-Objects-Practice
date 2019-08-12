package section_03;

import org.junit.Test;
import org.junit.Assert;

public class CircularQueueArrayDemo
{
	@Test
	public void firstTest()
	{
		CircularQueueArray q = new CircularQueueArray();
		
		int val = 10;
		for(int i = 1; i <= 5; i++)
		{
			q.add(val * i);
		}
		
		Assert.assertEquals(5, q.getCurrentSize());
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		
		int testVal = 10;
		while(!q.isEmpty())
		{
			Assert.assertEquals(testVal, q.remove());
			testVal += 10;
		}
	}
	
	@Test
	public void secondTest()
	{
		CircularQueueArray q = new CircularQueueArray();
		
		int val = 10;
		for(int i = 1; i <= 10; i++)
		{
			q.add(val * i);
		}
		
		Assert.assertEquals(true, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(10, q.getCurrentSize());
		
		int testVal = 10;
		while(!q.isEmpty())
		{
			Assert.assertEquals(testVal, q.remove());
			testVal += 10;
		}
	}
	
	@Test
	public void thirdTest()
	{
		CircularQueueArray q = new CircularQueueArray();
		
		int val = 10;
		for(int i = 1; i <= 11; i++)
		{
			q.add(val * i);
		}
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(11, q.getCurrentSize());
		
		int testVal = 10;
		while(!q.isEmpty())
		{
			Assert.assertEquals(testVal, q.remove());
			testVal += 10;
		}
	}
	
	@Test
	public void fourthTest()
	{
		CircularQueueArray q = new CircularQueueArray();
		
		int val = 10;
		for(int i = 1; i <= 5; i++)
		{
			q.add(val * i);
		}
		
		Assert.assertEquals(5, q.getCurrentSize());
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		
		// Remove two elements
		Assert.assertEquals(10, q.remove());
		Assert.assertEquals(20, q.remove());
		
		Assert.assertEquals(3, q.getCurrentSize());
		
		// Test Sizes
		int testVal = 30;
		while(!q.isEmpty())
		{
			Assert.assertEquals(testVal, q.remove());
			testVal += 10;
		}
	}
}

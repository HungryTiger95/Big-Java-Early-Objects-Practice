package exercise_15;

import org.junit.Test;

import java.util.NoSuchElementException;

import org.junit.Assert;

public class CircularQueueArrayTest
{
	@Test
	public void testFirstToLast1()
	{
		CircularQueueArray q = createQueue(0);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(true, q.isEmpty());
		Assert.assertEquals(0, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 1);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast2()
	{
		CircularQueueArray q = createQueue(1);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(1, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 2);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast3()
	{
		CircularQueueArray q = createQueue(2);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(2, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 3);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast4()
	{
		CircularQueueArray q = createQueue(3);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(3, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 4);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast5()
	{
		CircularQueueArray q = createQueue(4);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(4, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 5);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast6()
	{
		CircularQueueArray q = createQueue(5);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(5, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 6);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast7()
	{
		CircularQueueArray q = createQueue(6);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(6, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 7);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast8()
	{
		CircularQueueArray q = createQueue(7);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(7, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 8);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast9()
	{
		CircularQueueArray q = createQueue(8);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(8, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 9);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast10()
	{
		CircularQueueArray q = createQueue(9);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(9, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 10);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast11()
	{
		CircularQueueArray q = createQueue(10);
		
		Assert.assertEquals(true, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(10, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 11);
		System.out.println("===================================================================");
	}
	
	@Test
	public void testFirstToLast12()
	{
		CircularQueueArray q = createQueue(11);
		
		Assert.assertEquals(false, q.isFull());
		Assert.assertEquals(false, q.isEmpty());
		Assert.assertEquals(11, q.getCurrentSize());
		
		try
		{
			q.firstToLast();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("-----Cannot Perform Action-----");
		}
		
		// Print out the array
		printTest(q, 12);
		System.out.println("===================================================================");
	}
	// Static Methods used to make testing cases concise
	static CircularQueueArray createQueue(int size)
	{
		CircularQueueArray q = new CircularQueueArray();

		int val = 10;
		for(int i = 1; i <= size; i++)
		{
			q.add(val);
			val += 10;
		}
		
		return q;
	}
	
	static void printTest(CircularQueueArray q, int testNum)
	{
		System.out.println("TEST:" + testNum);
		String s = "";
		while(!q.isEmpty())
		{
			s += "[" + q.remove() + "]";
		}
		System.out.println("Circular Array: " + s);
		System.out.println("Internal Array: " + q.printInternalArray());
	}
}

package exercise_11;

import org.junit.Test;

import java.util.NoSuchElementException;

import org.junit.Assert;

public class MyStackTest
{
	@Test
	public void testConstructor()
	{
		MyStack stack = new MyStack();
		
		// This object should have two things to initialize
		// I will validate these with this test
		Assert.assertEquals(10, stack.getInternalArray().length);
		Assert.assertEquals(0, stack.getCurrentSize());
	}
	
	@Test
	public void testPus1()
	{
		MyStack stack = new MyStack();
		stack.push(10);
		
		Assert.assertEquals(10, stack.getInternalArray().length);
		Assert.assertEquals(1, stack.getCurrentSize());
	}
	
	@Test
	public void testPush2()
	{
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		
		Assert.assertEquals(10, stack.getInternalArray().length);
		Assert.assertEquals(2, stack.getCurrentSize());
	}
	
	@Test
	public void testPush3()
	{
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		Assert.assertEquals(10, stack.getInternalArray().length);
		Assert.assertEquals(4, stack.getCurrentSize());
	}
	
	@Test
	public void testPush4()
	{
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		Assert.assertEquals(10, stack.getInternalArray().length);
		Assert.assertEquals(8, stack.getCurrentSize());
	}
	
	@Test
	public void testPush5()
	{
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		Assert.assertEquals(10, stack.getInternalArray().length);
		Assert.assertEquals(9, stack.getCurrentSize());
	}
	
	@Test
	public void testPush6()
	{
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		Assert.assertEquals(20, stack.getInternalArray().length);
		Assert.assertEquals(10, stack.getCurrentSize());
	}
	
	@Test
	public void testPush7()
	{
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		stack.push(110);
		Assert.assertEquals(20, stack.getInternalArray().length);
		Assert.assertEquals(11, stack.getCurrentSize());
	}
	
	@Test
	public void testPop()
	{
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(50);
		
		int val = (int) stack.pop();
		Assert.assertEquals(4, stack.getCurrentSize());
		Assert.assertEquals(50, val);
	}
	
	@Test
	public void testIsEmpty()
	{
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		
		Assert.assertEquals(2, stack.getCurrentSize());
		Assert.assertEquals(false, stack.isEmpty());
		
		stack.pop();
		stack.pop();
		
		Assert.assertEquals(0, stack.getCurrentSize());
		Assert.assertEquals(true, stack.isEmpty());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testPopV2()
	{
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		
		int val = (int) stack.pop();
		Assert.assertEquals(1, stack.getCurrentSize());
		Assert.assertEquals(20, val);
		
		int val2 = (int) stack.pop();
		Assert.assertEquals(0, stack.getCurrentSize());
		Assert.assertEquals(10, val2);
		
		// Should be an empty stack
		Assert.assertEquals(true, stack.isEmpty());
		
		// Try to pop an element off
		stack.pop();
	}
	
	@Test
	public void testGrow()
	{
		MyStack stack = new MyStack();
		
		for(int i = 1; i <= 9; i++)
		{
			int val = i * 10;
			stack.push(val);
		}
		Assert.assertEquals(9, stack.getCurrentSize());
		Assert.assertEquals(10, stack.getInternalArray().length);
		
		stack.push(110);
		
		Assert.assertEquals(10, stack.getCurrentSize());
		Assert.assertEquals(20, stack.getInternalArray().length);
	}
	
	@Test
	public void testShrink()
	{
		MyStack stack = new MyStack();
		
		for(int i = 1; i <= 150; i++)
		{
			int val = i * 10;
			stack.push(val);
		}
		Assert.assertEquals(150, stack.getCurrentSize());
		Assert.assertEquals(160, stack.getInternalArray().length);
		
		// Remove 50 elements at a time
		for(int i = 0; i < 50; i++)
		{
			stack.pop();
		}
		Assert.assertEquals(100, stack.getCurrentSize());
		Assert.assertEquals(160, stack.getInternalArray().length);
		
		for(int i = 0; i < 50; i++)
		{
			stack.pop();
		}
		Assert.assertEquals(50, stack.getCurrentSize());
		Assert.assertEquals(160, stack.getInternalArray().length);
		
		for(int i = 0; i < 15; i++)
		{
			stack.pop();
		}
		Assert.assertEquals(35, stack.getCurrentSize());
		Assert.assertEquals(80, stack.getInternalArray().length);
	}
}

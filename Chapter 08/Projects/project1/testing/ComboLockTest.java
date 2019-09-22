package project1.testing;

import org.junit.Assert;
import org.junit.Test;

import project1.ComboLock;

public class ComboLockTest
{
	ComboLock lock = new ComboLock(10, 32, 8);
	
	@Test
	public void testReset()
	{	
		lock.turnLeft(25);
		
		lock.reset();
		Assert.assertEquals(0, lock.getCurrentPosition());
	}
	
	@Test
	public void testTurnLeft()
	{
		lock.turnLeft(20);
		Assert.assertEquals(20, lock.getCurrentPosition());
		
		lock.turnLeft(30);
		Assert.assertEquals(10, lock.getCurrentPosition());
		
	}
	
	@Test
	public void testTurnRight()
	{	
		lock.turnRight(12);
		Assert.assertEquals(28, lock.getCurrentPosition());
		
		lock.turnRight(39);
		Assert.assertEquals(29, lock.getCurrentPosition());
	}
	
	@Test
	public void testOpen()
	{
		lock.turnRight(30);
		
		lock.turnLeft(22);
		
		lock.turnRight(24);
		
		boolean khul = lock.open();
		
		Assert.assertEquals(true, khul);
	}
}

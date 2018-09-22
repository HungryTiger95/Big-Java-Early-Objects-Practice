package exercise17;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest
{
	@Test
	public void testAddScores()
	{
		Student mayuresh = new Student(5);
		
		mayuresh.addScore(80);
		mayuresh.addScore(90);
		mayuresh.addScore(79);
		mayuresh.addScore(100);
		mayuresh.addScore(88);
		double expectedScores[] = {80, 90, 79, 100, 88};
		
		Assert.assertArrayEquals(expectedScores, mayuresh.getScores(), 0);
	}
	
	@Test
	public void testSum()
	{
		Student mayuresh = new Student(5);
		
		mayuresh.addScore(80);
		mayuresh.addScore(90);
		mayuresh.addScore(79);
		mayuresh.addScore(100);
		mayuresh.addScore(88);
		
		double expectedSum = 437;
		
		Assert.assertEquals(expectedSum, mayuresh.sum(), 0);
	}
	
	@Test
	public void testMinimum()
	{
		Student mayuresh = new Student(5);
		
		mayuresh.addScore(80);
		mayuresh.addScore(90);
		mayuresh.addScore(79);
		mayuresh.addScore(100);
		mayuresh.addScore(88);
		
		double expectedMinimum = 79;
		
		Assert.assertEquals(expectedMinimum, mayuresh.getMinimum(), 0);
	}
}

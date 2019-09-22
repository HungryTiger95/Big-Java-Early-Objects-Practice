package exercise8.testing;

import org.junit.Assert;
import org.junit.Test;

import exercise8.Student;

public class StudentTest
{
	@Test
	public void testAddScore()
	{
		Student mayo = new Student(100, "Mayo");

		mayo.addScore(23.8);
		mayo.addScore(84.2);
		mayo.addScore(98.8);
		mayo.addScore(48.2);
		mayo.addScore(99.8);
		mayo.addScore(100.0);
		
		Assert.assertEquals(23.8, mayo.getScoreAt(0), .001);
		Assert.assertEquals(48.2, mayo.getScoreAt(3), .001);
		Assert.assertEquals(98.8, mayo.getScoreAt(2), .001);
		Assert.assertEquals(100.0, mayo.getScoreAt(5), .001);
	}
	
	@Test
	public void testSum()
	{
		Student mayo = new Student(100, "Mayo");
		
		mayo.addScore(23.8);
		mayo.addScore(84.2);
		mayo.addScore(98.8);
		mayo.addScore(48.2);
		mayo.addScore(99.8);
		mayo.addScore(100.0);
		
		double sum = mayo.sum();
		
		Assert.assertEquals(454.8, sum, .001);
	}
	
	@Test
	public void testMin()
	{
		Student mayo = new Student(100, "Mayo");
		
		mayo.addScore(23.8);
		mayo.addScore(84.2);
		mayo.addScore(98.8);
		mayo.addScore(48.2);
		mayo.addScore(99.8);
		mayo.addScore(100.0);
		
		double minimum = mayo.minimum();
		
		Assert.assertEquals(23.8, minimum, .001);
	}
	
	@Test
	public void testFinalScore()
	{
		Student mayo = new Student(100, "Mayo");
		
		mayo.addScore(23.8);
		mayo.addScore(84.2);
		mayo.addScore(98.8);
		mayo.addScore(48.2);
		mayo.addScore(99.8);
		mayo.addScore(100.0);
		
		double finalScore = mayo.finalScore();
		
		Assert.assertEquals(431.00, finalScore, .001);
	}
	
	@Test
	public void testGetName()
	{
		Student mayo = new Student(100, "Mayo");
		
		String name = mayo.getName();
		
		Assert.assertEquals("Mayo", name);
	}
}

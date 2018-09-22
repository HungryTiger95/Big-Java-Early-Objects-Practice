package exercise8.testing;

import org.junit.Test;

import exercise8.GradeBook;
import exercise8.Student;

import java.util.Arrays;

import org.junit.Assert;

public class GradeBookTest
{
	@Test
	public void testAddStudent()
	{
		GradeBook book = new GradeBook();
		
		Student mayo = new Student(100, "Mayo");
		Student arju = new Student(100, "Arju");
		
		book.addStudent(mayo);
		book.addStudent(arju);
		
		Assert.assertEquals("Mayo", book.getStudentAt(0).getName());
		Assert.assertEquals("Arju", book.getStudentAt(1).getName());
	}
	
	@Test
	public void testGetSumOfScores()
	{
		GradeBook book = new GradeBook();
		
		Student mayo = new Student(100, "Mayo");
		Student arju = new Student(100, "Arju");
		
		book.addStudent(mayo);
		book.addStudent(arju);
		
		book.getStudentAt(0).addScore(100.0);
		book.getStudentAt(0).addScore(94.3);
		book.getStudentAt(0).addScore(89.0);
		book.getStudentAt(0).addScore(79.9);
		book.getStudentAt(0).addScore(80.0);
		
		book.getStudentAt(1).addScore(95.2);
		book.getStudentAt(1).addScore(99.0);
		book.getStudentAt(1).addScore(84.9);
		book.getStudentAt(1).addScore(91.8);
		book.getStudentAt(1).addScore(88.8);
		
		double sum1 = 100.0 + 94.3 + 89.0 + 79.9 + 80.0;
		double sum2 = 95.2 + 99.0 + 84.9 + 91.8 + 88.8;
		
		double calcSum1 = book.getSumOfScores(0);
		double calcSum2 = book.getSumOfScores(1);
		
		Assert.assertEquals(sum1, calcSum1, .001);
		Assert.assertEquals(sum2, calcSum2, .001);
	}
	
	@Test
	public void testGetMinimumScore()
	{
		GradeBook book = new GradeBook();
		
		Student mayo = new Student(100, "Mayo");
		Student arju = new Student(100, "Arju");
		
		book.addStudent(mayo);
		book.addStudent(arju);
		
		book.getStudentAt(0).addScore(100.0);
		book.getStudentAt(0).addScore(94.3);
		book.getStudentAt(0).addScore(89.0);
		book.getStudentAt(0).addScore(79.9);
		book.getStudentAt(0).addScore(80.0);
		
		book.getStudentAt(1).addScore(95.2);
		book.getStudentAt(1).addScore(99.0);
		book.getStudentAt(1).addScore(84.9);
		book.getStudentAt(1).addScore(91.8);
		book.getStudentAt(1).addScore(88.8);
		
		double min1 = 79.9;
		double min2 = 84.9;
		double[] min3 = {79.9, 84.9};
		
		double calcMin1 = book.getMinimumScores(0);
		double calcMin2 = book.getMinimumScores(1);
		double[] calcMin3 = book.getMinimumScores();
		
		Assert.assertEquals(min1, calcMin1, .001);
		Assert.assertEquals(min2, calcMin2, .001);
		Assert.assertEquals(Arrays.toString(min3), Arrays.toString(calcMin3));
	}
}

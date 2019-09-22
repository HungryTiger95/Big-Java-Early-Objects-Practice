package exercise_09.testing;

import exercise_09.Pair;

import static org.junit.Assert.assertEquals;

import java.awt.Rectangle;

import org.junit.Test;

public class PairTest
{
	@Test
	public void testPairConstructor()
	{
		Pair<Integer, String> p = new Pair<>(1, "Java");
		assertEquals(1, p.getKey().intValue());
		assertEquals("Java", p.getValue());
	}
	
	@Test
	public void testPairHashCode1()
	{
		Pair<Integer, Integer> p1 = new Pair<>(1, 2);
		assertEquals(33, p1.hashCode());
	}
	
	@Test
	public void testPairHashCode2()
	{
		Pair<Integer, Integer> p2 = new Pair<>(45, 210);
		assertEquals(1605, p2.hashCode());
	}
	
	@Test
	public void testPairHashCode3()
	{
		Pair<Integer, String> p3 = new Pair<>(45, "Java");
		int stringHashCode = p3.getValue().hashCode();
		int expected = 31 * 45 + stringHashCode;
		assertEquals(expected, p3.hashCode());
	}
	
	@Test
	public void testPairHashCode4()
	{
		Rectangle r = new Rectangle(10, 10, 50, 100);
		Pair<Rectangle, String> p4 = new Pair<>(r, "Java");
		
		int rectangleHashCode = p4.getKey().hashCode();
		int stringHashCode = p4.getValue().hashCode();
		
		int expected = 31 * rectangleHashCode + stringHashCode;
		assertEquals(expected, p4.hashCode());
	}
	
	@Test
	public void testEquals1()
	{
		Pair<Integer, Integer> p1 = new Pair<>(1, 2);
		Pair<Integer, Integer> p2 = new Pair<>(1, 2);
		
		assertEquals(true, p1.equals(p2));
	}
	
	@Test
	public void testEquals2()
	{
		Pair<Integer, Integer> p1 = new Pair<>(1, 2);
		Pair<Integer, Integer> p2 = new Pair<>(2, 2);
		
		assertEquals(false, p1.equals(p2));
	}
	
	@Test
	public void testEquals3()
	{
		Pair<Integer, String> p1 = new Pair<>(45, "Mayuresh");
		Pair<String, String> p2 = new Pair<>("Hina", "Mayuresh");
		
		assertEquals(false, p1.equals(p2));
	}
	
	@Test
	public void testEquals4()
	{
		Pair<Integer, String> p1 = new Pair<>(45, "Mayuresh");
		Pair<String, Integer> p2 = new Pair<>("Mayuresh", 45);
		
		assertEquals(false, p1.equals(p2));
	}
}

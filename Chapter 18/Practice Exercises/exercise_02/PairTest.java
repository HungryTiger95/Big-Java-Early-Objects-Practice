package exercise_02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PairTest
{
	@Test
	public void testPair()
	{
		String firstName = "Kirti";
		String lastName = "Patel";
		
		Pair<String> fullName = new Pair<>(firstName, lastName);
		fullName.swap();
		
		assertEquals(lastName, fullName.getFirst());
		assertEquals(firstName, fullName.getSecond());
	}
	
	@Test
	public void testPair2()
	{
		int val1 = 100;
		int val2 = 200;
		
		Pair<Integer> twoVals = new Pair<>(val1, val2);
		twoVals.swap();
		
		assertEquals(val2, twoVals.getFirst().intValue());
		assertEquals(val1, twoVals.getSecond().intValue());
	}
}

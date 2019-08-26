package exercise_03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PairTest
{
	public static <T, S> Pair<S, T> swap(Pair<T, S> pair)
	{
		Pair<S, T> newPair = new Pair<>(pair.getSecond(), pair.getFirst());	
		return newPair;
	}
	
	@Test
	public void testSwap1()
	{
		Pair<Integer, String> p = new Pair<>(100, "Payal");
		Pair<String, Integer> p2 = swap(p);
		
		assertEquals(100, p.getFirst().intValue());
		assertEquals("Payal", p.getSecond());
		
		assertEquals("Payal", p2.getFirst());
		assertEquals(100, p2.getSecond().intValue());
	}
}

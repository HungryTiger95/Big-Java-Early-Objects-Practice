package exercise_09.testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import exercise_09.HashMap;

public class HashMapTest
{
	@Test
	public void testHashMapConst()
	{
		HashMap<Integer, String> map = new HashMap<>();
		assertEquals(0, map.getSize());
		
		map.put(1, "Mayuresh");
		assertEquals(1, map.getSize());
	}
	
	@Test
	public void testHashMapIsEmpty()
	{
		HashMap<Integer, String> map = new HashMap<>();
		assertEquals(true, map.isEmpty());
		
		map.put(2, "Mayuresh");
		assertEquals(false, map.isEmpty());
	}
	
	@Test
	public void testHashMapAddGet()
	{
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Mansi");
		map.put(2, "Payal");
		map.put(3, "Rhea");
		map.put(4, "Aarti");
		
		assertEquals(null, map.get(5));
		assertEquals("Mansi", map.get(1).getValue());
	}
	
	@Test
	public void testHashSet()
	{
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Mansi");
		map.put(2, "Payal");
		map.put(3, "Rhea");
		map.put(4, "Aarti");
		
		System.out.println(map.getSet().toString());
	}
}

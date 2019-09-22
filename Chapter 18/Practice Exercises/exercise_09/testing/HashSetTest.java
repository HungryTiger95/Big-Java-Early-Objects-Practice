package exercise_09.testing;

import org.junit.Test;
import org.junit.Assert;
import exercise_09.HashSet;

public class HashSetTest
{
	@Test
	public void hashSetTest1()
	{
		String[] names = {"Harry", "Mike", "Aarohi", "Payal", "Naina", "Sameera", "Tina", "Reema", "Alisha", "Ankita"};
		
		HashSet<String> set = new HashSet<>(names.length);
		for(int i = 0; i < names.length; i++)
		{
			set.add(names[i]);
		}
		
		Assert.assertEquals(10, set.size());
		
		set.remove("Mike");
		
		Assert.assertEquals(9, set.size());
		System.out.println("Test1: " + set.toString());
	}
	
	@Test
	public void hashSetTest2()
	{
		String[] names = {"Harry", "Mike", "Aarohi", "Payal", "Naina", "Sameera", "Tina", "Reema", "Alisha", "Ankita"};
		
		HashSet<String> set = new HashSet<>(names.length);
		for(int i = 0; i < names.length; i++)
		{
			set.add(names[i]);
		}
		
		set.add("Karina");
		set.add("Leah");
		
		Assert.assertEquals(12, set.size());
		System.out.println("Test2: " + set.toString());
	}
	
	@Test
	public void hashSetTest3()
	{
		int[] vals = new int[50];
		HashSet<Integer> set = new HashSet<>(20);
		
		int num = 10;
		for(int i = 1; i <= vals.length; i++)
		{
			vals[i - 1] = num * i;
			set.add(vals[i - 1]);
		}
		
		Assert.assertEquals(50, set.size());
		Assert.assertEquals(false, set.contains(23));
		Assert.assertEquals(true, set.contains(50));
		
		System.out.println("Test3: " + set.toString());
	}
}

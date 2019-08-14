package exercise_19;

import org.junit.Test;
import org.junit.Assert;

public class HashSetTest
{
	@Test
	public void testConstructor()
	{
		HashSet set = new HashSet(10);
		
		// Assert that the set has 0 elements and a bucket array length of 10
		Assert.assertEquals(0, set.getSize());
		Assert.assertEquals(10, set.getBuckets().length);
	}
	
	@Test
	public void testAdd1()
	{
		HashSet set = new HashSet(10);
		set.add(6);
		
		// Assert that the set has 1 element
		Assert.assertEquals(1, set.getSize());
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testAdd2()
	{
		HashSet set = new HashSet(10);
		set.add(6);
		set.add(8);
		
		// Assert that the set has 2 elements
		Assert.assertEquals(2, set.getSize());
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testAdd3()
	{
		HashSet set = new HashSet(10);
		set.add(6);
		set.add(8);
		set.add(6);
		set.add(8);
		
		// Assert that the set has 2 elements
		Assert.assertEquals(2, set.getSize());
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testAdd4()
	{
		HashSet set = new HashSet(10);
		set.add(6);
		set.add(8);
		set.add(6);
		set.add(2);
		
		// Assert that the set has 3 elements
		Assert.assertEquals(3, set.getSize());
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testAdd5()
	{
		HashSet set = new HashSet(10);
		int size = 6;
		for(int i = 0; i < size; i++)
		{
			set.add(i);
		}
		
		// Assert that the set has 6 elements
		Assert.assertEquals(6, set.getSize());
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testAdd6()
	{
		HashSet set = new HashSet(10);
		int size = 7;
		for(int i = 0; i < size; i++)
		{
			set.add(i);
		}
		
		// Assert that the set has 7 elements
		Assert.assertEquals(7, set.getSize());
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testAdd7()
	{
		HashSet set = new HashSet(10);
		int size = 8;
		for(int i = 0; i < size; i++)
		{
			set.add(i);
		}
		
		// Assert that the set has 8 elements
		Assert.assertEquals(8, set.getSize());
		
		// Assert that the size of the buckets array doubled
		Assert.assertEquals(10, set.getBuckets().length);
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testAdd8()
	{
		HashSet set = new HashSet(10);
		int size = 9;
		for(int i = 0; i < size; i++)
		{
			set.add(i);
		}
		
		// Assert that the set has 8 elements
		Assert.assertEquals(9, set.getSize());
		
		// Assert that the size of the buckets array doubled
		Assert.assertEquals(20, set.getBuckets().length);
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testAdd9()
	{
		HashSet set = new HashSet(10);
		int size = 29;
		for(int i = 0; i < size; i++)
		{
			set.add(i);
		}
		
		// Assert that the set has 8 elements
		Assert.assertEquals(29, set.getSize());
		
		// Assert that the size of the buckets array doubled
		Assert.assertEquals(40, set.getBuckets().length);
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testAdd10()
	{
		HashSet set = new HashSet(10);
		set.add("Aarohi");
		set.add("Mansi");
		set.add("Payal");
		set.add("Anjali");
		set.add("Maanvi");
		set.add("Mahek");
		set.add("Pooja");
		set.add("Shivani");
		
		// Assert that the set has 8 elements
		Assert.assertEquals(8, set.getSize());
		
		// Assert that the size of the buckets array doubled
		Assert.assertEquals(10, set.getBuckets().length);
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testAdd11()
	{
		HashSet set = new HashSet(10);
		set.add("Aarohi");
		set.add("Mansi");
		set.add("Payal");
		set.add("Anjali");
		set.add("Maanvi");
		set.add("Mahek");
		set.add("Pooja");
		set.add("Simran");
		set.add("Shivani");
		set.add("Divya");
		set.add("Rupal");
		
		// Assert that the set has 8 elements
		Assert.assertEquals(11, set.getSize());
		
		// Assert that the size of the buckets array doubled
		Assert.assertEquals(20, set.getBuckets().length);
		
		// Print out the set
		//System.out.println(set.toString());
	}
	
	@Test
	public void testContains1()
	{
		HashSet set = new HashSet(10);
		set.add("Aarohi");
		set.add("Mansi");
		set.add("Payal");
		set.add("Anjali");
		set.add("Maanvi");
		set.add("Mahek");
		set.add("Pooja");
		set.add("Simran");
		set.add("Shivani");
		set.add("Divya");
		set.add("Rupal");
		
		Assert.assertEquals(true, set.contains("Maanvi"));
		Assert.assertEquals(false, set.contains("Harsh"));
		Assert.assertEquals(true, set.contains("Anjali"));
		Assert.assertEquals(false, set.contains("Anju"));
		Assert.assertEquals(false, set.contains("anjali"));
	}
	
	@Test
	public void testContains2()
	{
		HashSet set = new HashSet(10);
		set.add(1);
		set.add(23);
		set.add(16);
		set.add(10);
		set.add(34);
		set.add(54);
		set.add(30);
		set.add(76);
		set.add(80);
		set.add(165);
		set.add(189);
		
		Assert.assertEquals(true, set.contains(16));
		Assert.assertEquals(false, set.contains(11));
		Assert.assertEquals(true, set.contains(76));
		Assert.assertEquals(false, set.contains(81));
		Assert.assertEquals(false, set.contains(109));
	}
	
	@Test
	public void testRemove1()
	{
		HashSet set = new HashSet(10);
		set.add("Aarohi");
		set.add("Mansi");
		set.add("Payal");
		set.add("Anjali");
		set.add("Maanvi");
		set.add("Mahek");
		set.add("Pooja");
		set.add("Simran");
		set.add("Shivani");
		set.add("Divya");
		set.add("Rupal");
		//System.out.println("Original:\n" + set.toString());
		
		Assert.assertEquals(11, set.getSize());
		Assert.assertEquals(false, set.remove("Alisha"));
		Assert.assertEquals(11, set.getSize());
		//System.out.println("\nRemoved:\n" + set.toString());
	}
	
	@Test
	public void testRemove2()
	{
		HashSet set = new HashSet(10);
		set.add("Aarohi");
		set.add("Mansi");
		set.add("Payal");
		set.add("Anjali");
		set.add("Maanvi");
		set.add("Mahek");
		set.add("Pooja");
		set.add("Simran");
		set.add("Shivani");
		set.add("Divya");
		set.add("Rupal");
		//System.out.println("Original:\n" + set.toString());
		
		Assert.assertEquals(11, set.getSize());
		Assert.assertEquals(true, set.remove("Pooja"));
		Assert.assertEquals(10, set.getSize());
		//System.out.println("\nRemoved:\n" + set.toString());
	}
	
	@Test
	public void testRemove3()
	{
		HashSet set = new HashSet(10);
		set.add("Aarohi");
		set.add("Mansi");
		set.add("Payal");
		set.add("Anjali");
		set.add("Maanvi");
		set.add("Mahek");
		set.add("Pooja");
		set.add("Simran");
		set.add("Shivani");
		set.add("Divya");
		set.add("Rupal");
		//System.out.println("Original:\n" + set.toString());
		
		Assert.assertEquals(11, set.getSize());
		Assert.assertEquals(true, set.remove("Mahek"));
		Assert.assertEquals(10, set.getSize());
		//System.out.println("\nRemoved:\n" + set.toString());
	}
	
	@Test
	public void testRemove4()
	{
		HashSet set = new HashSet(10);
		set.add("Aarohi");
		set.add("Mansi");
		set.add("Payal");
		set.add("Anjali");
		set.add("Maanvi");
		set.add("Mahek");
		set.add("Pooja");
		set.add("Simran");
		set.add("Shivani");
		set.add("Divya");
		set.add("Rupal");
		//System.out.println("Original:\n" + set.toString());
		
		Assert.assertEquals(11, set.getSize());
		Assert.assertEquals(true, set.remove("Aarohi"));
		Assert.assertEquals(10, set.getSize());
		//System.out.println("\nRemoved:\n" + set.toString());
	}
}

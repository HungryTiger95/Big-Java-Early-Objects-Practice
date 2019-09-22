package exercise_19;

import org.junit.Assert;
import org.junit.Test;

public class HashSetIteratorTest
{
	@Test
	public void testHasNext1()
	{
		HashSet set = new HashSet(10);
		for(int i = 0; i < 10; i++)
		{
			set.add((i + 1) * 10);
		}
		//System.out.println(set.toString());
		//System.out.println(set.easyToString());
		
		SetIterator iter = set.hashSetIterator();
		Assert.assertEquals(true, iter.hasNext());
		Assert.assertEquals("null", iter.getPosition());
		Assert.assertEquals("null", iter.getPrevious());
		
		//System.out.println("Position: " + iter.getPosition());
		//System.out.println("Previous: " + iter.getPrevious());
	}
	
	@Test
	public void testHasNext2()
	{
		HashSet set = new HashSet(10);
		for(int i = 0; i < 10; i++)
		{
			set.add((i + 1) * 10);
		}
		//System.out.println(set.toString());
		//System.out.println(set.easyToString());
		
		SetIterator iter = set.hashSetIterator();
		Object obj = null;
		if(iter.hasNext())
		{
			obj = iter.next();
		}
		
		// Assert that the first element is 100 and assert the current position and previous position
		Assert.assertEquals(100, obj);
		Assert.assertEquals(obj.toString(), iter.getPosition());
		Assert.assertEquals("null", iter.getPrevious());
		
		//System.out.println("Position: " + iter.getPosition());
		//System.out.println("Previous: " + iter.getPrevious());
	}
	
	@Test
	public void testNext1()
	{
		HashSet set = new HashSet(10);
		for(int i = 0; i < 10; i++)
		{
			set.add((i + 1) * 10);
		}
		//System.out.println(set.toString());
		//System.out.println(set.easyToString());

		SetIterator iter = set.hashSetIterator();
		Object obj = null;
		int loops = 2;
		for(int i = 0; i < loops; i++)
		{
			if(iter.hasNext())
			{
				obj = iter.next();
			}
		}
		
		Assert.assertEquals(20, obj);
		Assert.assertEquals(obj.toString(), iter.getPosition());
		Assert.assertEquals("100", iter.getPrevious());
		
		//System.out.println("Position: " + iter.getPosition());
		//System.out.println("Previous: " + iter.getPrevious());
	}
	
	@Test
	public void testNext3()
	{
		HashSet set = new HashSet(10);
		for(int i = 0; i < 10; i++)
		{
			set.add((i + 1) * 10);
		}
		
		//System.out.println(set.toString());
		//System.out.println(set.easyToString());
		SetIterator iter = set.hashSetIterator();
		
		Object obj = null;
		while(iter.hasNext())
		{
			obj = iter.next();
			//System.out.println(obj);
		}
		
		Assert.assertEquals(obj.toString(), iter.getPosition());
		Assert.assertEquals("50", iter.getPrevious());
		//System.out.println("Position: " + iter.getPosition());
		//System.out.println("Previous: " + iter.getPrevious());
	}
	
	@Test(expected = IllegalStateException.class)
	public void testRemove1()
	{
		HashSet set = new HashSet(10);
		for(int i = 0; i < 10; i++)
		{
			set.add((i + 1) * 10);
		}
		
		SetIterator iter = set.hashSetIterator();
		iter.remove();
	}
	
	@Test
	public void testRemove2()
	{
		HashSet set = new HashSet(10);
		for(int i = 0; i < 10; i++)
		{
			set.add((i + 1) * 10);
		}
		//System.out.println(set.toString());
		//System.out.println(set.easyToString());
		
		SetIterator iter = set.hashSetIterator();
		
		if(iter.hasNext())
		{
			iter.next();
		}
		iter.remove();			// iter is pointing to 100, previous is null. after removal, iter should point to null and previous should be null
		
		
		Assert.assertEquals(9, set.getSize());
		Assert.assertEquals("null", iter.getPosition());
		Assert.assertEquals("null", iter.getPrevious());
		
		//System.out.println("Position: " + iter.getPosition());
		//System.out.println("Previous: " + iter.getPrevious());
		//System.out.println(set.toString());
		//System.out.println(set.easyToString());
	}

	@Test
	public void testRemove3()
	{
		HashSet set = new HashSet(10);
		for(int i = 0; i < 10; i++)
		{
			set.add((i + 1) * 10);
		}
		//System.out.println(set.toString());
		//System.out.println(set.easyToString());
		
		SetIterator iter = set.hashSetIterator();
		
		if(iter.hasNext())
		{
			iter.next();
		}
		if(iter.hasNext())
		{
			iter.next();
		}
		iter.remove();			// iter is pointing to 20, previous is 100. after removal, iter should point to 100 and previous should be null
		
		Assert.assertEquals(9, set.getSize());
		Assert.assertEquals("100", iter.getPosition());
		Assert.assertEquals("null", iter.getPrevious());
		
		//System.out.println("Position: " + iter.getPosition());
		//System.out.println("Previous: " + iter.getPrevious());
		//System.out.println(set.toString());
		//System.out.println(set.easyToString());
	}

	@Test
	public void testRemove4()
	{
		HashSet set = new HashSet(10);
		for(int i = 0; i < 1; i++)
		{
			set.add((i + 1) * 10);
		}
		//System.out.println(set.toString());
		//System.out.println(set.easyToString());
		
		SetIterator iter = set.hashSetIterator();
		
		if(iter.hasNext())
		{
			iter.next();
		}			
		
		Assert.assertEquals(1, set.getSize());
		Assert.assertEquals("10", iter.getPosition());
		Assert.assertEquals("null", iter.getPrevious());
		
		iter.remove();
		
		Assert.assertEquals(0, set.getSize());
		Assert.assertEquals("null", iter.getPosition());
		Assert.assertEquals("null", iter.getPrevious());
		
		//System.out.println("Position: " + iter.getPosition());
		//System.out.println("Previous: " + iter.getPrevious());
		//System.out.println(set.toString());
		//System.out.println(set.easyToString());
	}
}

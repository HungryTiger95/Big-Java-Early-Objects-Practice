package double_linked_list;

import org.junit.Assert;
import org.junit.Test;

public class ListIteratorTest
{
	@Test
	public void testHasNext1()
	{
		LinkedList list = new LinkedList();
		ListIterator iter = list.listIterator();
		boolean actual = iter.hasNext();
		
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void testHasNext2()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		
		ListIterator iter = list.listIterator();
		boolean actual = iter.hasNext();
		
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void testHasNext3()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		boolean actual = iter.hasNext();
		
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void testHasNext4()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		boolean actual = iter.hasNext();
		
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void testNext1()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		
		ListIterator iter = list.listIterator();
		
		iter.hasNext();
		Object actual = iter.next();
		
		Assert.assertEquals("Anjali", actual);
	}
	
	@Test
	public void testNext2()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		
		ListIterator iter = list.listIterator();
		int numTimes = 2;
		Object obj = null;
		for(int i = 0; i < numTimes; i++)
		{
			iter.hasNext();
			obj = iter.next();
		}
		Assert.assertEquals("Divya", obj);
	}
	
	@Test
	public void testNext3()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		
		ListIterator iter = list.listIterator();
		while(iter.hasNext())
		{
			iter.next();
			//System.out.println(iter.next());
		}
	}
	
	@Test
	public void testAdd1()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		//System.out.println("Original:\n" + list.easyToString() + "\n");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		// Test add to the beginning
		iter.add("Mansi");
		Assert.assertEquals(8, list.getSize());
		//System.out.println("Adding:\n" + list.easyToString());
	}
	
	@Test
	public void testAdd2()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		//System.out.println("Original:\n" + list.easyToString() + "\n");
		
		ListIterator iter = list.listIterator();
		while(iter.hasNext())
		{
			iter.next();
		}
		
		// Test add to the end
		iter.add("Mansi");
		Assert.assertEquals(8, list.getSize());
		//System.out.println("Adding:\n" + list.easyToString());
	}
	
	@Test
	public void testAdd3()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		//System.out.println("Original:\n" + list.easyToString() + "\n");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		// Test add when there is only one element in the list
		iter.add("Mansi");
		Assert.assertEquals(2, list.getSize());
		//System.out.println("Adding:\n" + list.easyToString());
	}
	
	@Test
	public void testAdd4()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		//System.out.println("Original:\n" + list.easyToString() + "\n");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		iter.hasNext();
		iter.next();
		
		iter.hasNext();
		iter.next();
		
		// Test add to a place somewhere in the middle
		iter.add("Mansi");
		Assert.assertEquals(8, list.getSize());
		//System.out.println("Adding:\n" + list.easyToString());
	}
	
	@Test
	public void testRemove1()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		//System.out.println("Original:\n" + list.easyToString() + "\n");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		// test remove the very first element
		iter.remove();
		Assert.assertEquals(6, list.getSize());
		//System.out.println("Adding:\n" + list.easyToString());
	}
	
	@Test
	public void testRemove2()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		//System.out.println("Original:\n" + list.easyToString() + "\n");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		// test remove the first and only element
		iter.remove();
		Assert.assertEquals(0, list.getSize());
		//System.out.println("Adding:\n" + list.easyToString());
	}
	
	@Test
	public void testRemove3()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		//System.out.println("Original:\n" + list.easyToString() + "\n");
		
		ListIterator iter = list.listIterator();
		while(iter.hasNext())
		{
			iter.next();
		}
		
		// test remove the very last element
		iter.remove();
		Assert.assertEquals(6, list.getSize());
		//System.out.println("Adding:\n" + list.easyToString());
	}
	
	@Test
	public void testRemove4()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		//System.out.println("Original:\n" + list.easyToString() + "\n");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		iter.hasNext();
		iter.next();
		
		iter.hasNext();
		iter.next();
		
		iter.hasNext();
		iter.next();
		
		// test remove an element somewhere in the middle
		iter.remove();
		Assert.assertEquals(6, list.getSize());
		//System.out.println("Adding:\n" + list.easyToString());
	}
	
	@Test
	public void testSet1()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		//System.out.println("Original:\n" + list.easyToString() + "\n");
		
		ListIterator iter = list.listIterator();
		int moveIter = 3;
		for(int i = 0; i < moveIter; i++)
		{
			iter.hasNext();
			iter.next();
		}
		Assert.assertEquals("Kangana", iter.getPosition());
		Assert.assertEquals("Divya", iter.getPrevious());
		
		// Set the current position to another value
		iter.set("Mansi");
		Assert.assertEquals(7, list.getSize());
		Assert.assertEquals("Mansi", iter.getPosition());
		Assert.assertEquals("Divya", iter.getPrevious());
		//System.out.println("Setting:\n" + list.easyToString());
	}
	
	@Test
	public void testSet2()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		//System.out.println("Original:\n" + list.easyToString() + "\n");
		
		ListIterator iter = list.listIterator();
		int moveIter = 6;
		for(int i = 0; i < moveIter; i++)
		{
			iter.hasNext();
			iter.next();
		}
		Assert.assertEquals("Aarti", iter.getPosition());
		Assert.assertEquals("Lisa", iter.getPrevious());
		
		// Set the current position to another value
		iter.set("Mansi");
		Assert.assertEquals(7, list.getSize());
		Assert.assertEquals("Mansi", iter.getPosition());
		Assert.assertEquals("Lisa", iter.getPrevious());
		//System.out.println("Setting:\n" + list.easyToString());
	}
	
	@Test
	public void testHasPrevious1()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		
		ListIterator iter = list.listIterator();
		
		// Assert that hasPrevious is false b/c iterator has not moved
		Assert.assertEquals(false, iter.hasPrevious());
	}
	
	@Test
	public void testHasPrevious2()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		// Assert that hasPrevious is false b/c iterator is at the first element
		Assert.assertEquals(false, iter.hasPrevious());
	}
	
	@Test
	public void testHasPrevious3()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		iter.hasNext();
		iter.next();
		// Assert that hasPrevious is true b/c iterator is not at the beginning or first element
		Assert.assertEquals(true, iter.hasPrevious());
	}
	
	@Test
	public void testHasPrevious4()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		
		ListIterator iter = list.listIterator();
		while(iter.hasNext())
		{
			iter.next();
		}
		// Assert that hasPrevious is true b/c iterator is at the end
		Assert.assertEquals(true, iter.hasPrevious());
	}
	
	@Test
	public void testHasPrevious5()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		Assert.assertEquals(false, iter.hasPrevious());
		
		iter.hasNext();
		iter.next();
		
		Assert.assertEquals(true, iter.hasPrevious());
	}
	
	@Test
	public void testPrevious1()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		Assert.assertEquals(false, iter.hasPrevious());
		Assert.assertEquals("Anjali", iter.getPosition());
		Assert.assertEquals("null", iter.getPrevious());
		
		iter.hasNext();
		iter.next();
		
		Assert.assertEquals(true, iter.hasPrevious());
		Assert.assertEquals("Divya", iter.getPosition());
		Assert.assertEquals("Anjali", iter.getPrevious());
		
		iter.hasNext();
		iter.next();
		
		Assert.assertEquals("Kangana", iter.getPosition());
		Assert.assertEquals("Divya", iter.getPrevious());
		
		iter.hasPrevious();
		iter.previous();
		
		Assert.assertEquals("Divya", iter.getPosition());
		Assert.assertEquals("Anjali", iter.getPrevious());
	}
	
	@Test
	public void testPreviousAdd1()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Shirly");
		list.addFirst("Aarti");
		list.addFirst("Lisa");
		list.addFirst("Taapsee");
		list.addFirst("Kangana");
		list.addFirst("Divya");
		list.addFirst("Anjali");
		System.out.println("Original:\n" + list.easyToString());
		
		ListIterator iter = list.listIterator();
		iter.hasNext();
		iter.next();
		
		Assert.assertEquals(false, iter.hasPrevious());
		Assert.assertEquals("Anjali", iter.getPosition());
		Assert.assertEquals("null", iter.getPrevious());
		
		iter.hasNext();
		iter.next();
		
		Assert.assertEquals(true, iter.hasPrevious());
		Assert.assertEquals("Divya", iter.getPosition());
		Assert.assertEquals("Anjali", iter.getPrevious());
		
		iter.hasNext();
		iter.next();
		
		Assert.assertEquals("Kangana", iter.getPosition());
		Assert.assertEquals("Divya", iter.getPrevious());
		
		iter.hasPrevious();
		iter.previous();
		
		Assert.assertEquals("Divya", iter.getPosition());
		Assert.assertEquals("Anjali", iter.getPrevious());
		
		iter.add("Mansi");
		
		Assert.assertEquals(8, list.getSize());
		Assert.assertEquals("Mansi", iter.getPosition());
		Assert.assertEquals("Divya", iter.getPrevious());
		
		System.out.println("\nAdding: \n" + list.easyToString());
	}
}

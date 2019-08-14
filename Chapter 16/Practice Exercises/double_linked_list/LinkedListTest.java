package double_linked_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest
{
	@Test
	public void testConstructor()
	{
		LinkedList list = new LinkedList();
		
		/*
		 * All the constructor does is sets the head node to null
		 * and sets the number of elements in the list to 0.
		 */
		Assert.assertEquals(null, list.getFirstNode());
		Assert.assertEquals(0, list.getSize());
	}
	
	@Test
	public void testNodeClass()
	{
		LinkedList list = new LinkedList();
		
		list.addFirst("Payal");
		
		/*
		 * This will test the node class within the linked list
		 * class. I am looking for previous to be null, data to be
		 * "Payal", and next to be null since this is the first
		 * object to be added into the list.
		 */
		Assert.assertEquals("Payal", list.getFirstNode().data);
		Assert.assertEquals(null, list.getFirstNode().previous);
		Assert.assertEquals(null, list.getFirstNode().next);
	}
	
	@Test
	public void testAddFirst1()
	{
		LinkedList list = new LinkedList();
		
		list.addFirst("Payal");
		list.addFirst("Aarohi");
		
		/*
		 * This will test the node class within the linked list
		 * class. I am looking for previous to be null, data to be
		 * "Aarohi", and next to be "Payal" since this is the first
		 * object to be added into the list.
		 */
		Assert.assertEquals("Aarohi", list.getFirstNode().data);
		Assert.assertEquals(null, list.getFirstNode().previous);
		Assert.assertEquals("Payal", list.getFirstNode().next.data);
	}
	
	@Test
	public void testAddFirst2()
	{
		LinkedList list = new LinkedList();
		
		list.addFirst("Payal");
		list.addFirst("Aarohi");
		list.addFirst("Pooja");
		
		/*
		 * This will test the node class within the linked list
		 * class. I am looking for previous to be null, data to be
		 * "Aarohi", and next to be "Payal" since this is the first
		 * object to be added into the list.
		 */
		Assert.assertEquals("Pooja", list.getFirstNode().data);
		Assert.assertEquals(null, list.getFirstNode().previous);
		Assert.assertEquals("Aarohi", list.getFirstNode().next.data);
	}
	
	@Test
	public void testAddLast1()
	{
		LinkedList list = new LinkedList();
		
		list.addLast("Payal");
		
		/*
		 * This will test the node class within the linked list
		 * class. I am looking for previous to be null, data to be
		 * "Aarohi", and next to be "Payal" since this is the first
		 * object to be added into the list.
		 */
		Assert.assertEquals("Payal", list.getFirstNode().data);
		Assert.assertEquals(null, list.getFirstNode().previous);
		Assert.assertEquals(null, list.getFirstNode().next);
	}
	
	@Test
	public void testAddLast2()
	{
		LinkedList list = new LinkedList();
		
		list.addFirst("Payal");
		list.addFirst("Aarohi");
		list.addLast("Pooja");
		
		/*
		 * This will test the node class within the linked list
		 * class. I am looking for previous to be null, data to be
		 * "Aarohi", and next to be "Payal" since this is the first
		 * object to be added into the list.
		 */
		Assert.assertEquals("Aarohi", list.getFirstNode().data);
		Assert.assertEquals(null, list.getFirstNode().previous);
		Assert.assertEquals("Payal", list.getFirstNode().next.data);
	}
	
	@Test
	public void testToString1()
	{
		LinkedList list = new LinkedList();

		list.addFirst("Payal");

		//System.out.println(list.toString());
	}
	
	@Test
	public void testToString2()
	{
		LinkedList list = new LinkedList();

		list.addFirst("Payal");
		list.addFirst("Aarohi");

		//System.out.println(list.toString());
	}
	
	@Test
	public void testToString3()
	{
		LinkedList list = new LinkedList();

		list.addFirst("Payal");
		list.addFirst("Aarohi");
		list.addFirst("Pooja");

		//System.out.println(list.toString());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testRemoveFirst1()
	{
		LinkedList list = new LinkedList();
		
		list.removeFirst();
	}
	
	@Test
	public void testRemoveFirst2()
	{
		LinkedList list = new LinkedList();

		list.addFirst("Payal");
		//System.out.println(list.toString());
		
		Object obj = list.removeFirst();
		
		Assert.assertEquals("Payal", obj);
		Assert.assertEquals(0, list.getSize());
		
		//System.out.println(list.toString());
	}
	
	@Test
	public void testRemoveFirst3()
	{
		LinkedList list = new LinkedList();

		list.addFirst("Payal");
		list.addFirst("Aarohi");
		//System.out.println(list.toString());
		
		Object obj = list.removeFirst();
		
		Assert.assertEquals("Aarohi", obj);
		Assert.assertEquals(1, list.getSize());
		
		//System.out.println(list.toString());
	}
	
	@Test
	public void testRemoveFirst4()
	{
		LinkedList list = new LinkedList();

		list.addFirst("Payal");
		list.addFirst("Aarohi");
		list.addFirst("Simran");
		list.addFirst("Jasmine");
		list.addFirst("Soniya");
		list.addFirst("Amar");
		list.addFirst("Manav");
		list.addFirst("Shivay");
		
		//System.out.println(list.easyToString());
		
		Object obj = list.removeFirst();
		
		Assert.assertEquals("Shivay", obj);
		Assert.assertEquals(7, list.getSize());
		
		//System.out.println(list.easyToString());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddAt1()
	{
		LinkedList list = new LinkedList();
		list.addAt(2, "Payal");
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddAt2()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Payal");
		list.addFirst("Aarohi");
		
		list.addAt(-3, "Mansi");
	}
	
	@Test
	public void testAddAt3()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Payal");
		list.addFirst("Aarohi");
		//System.out.println(list.easyToString());
		
		list.addAt(0, "Mansi");
		Assert.assertEquals(3, list.getSize());
		//System.out.println(list.easyToString());
		
		ArrayList<Object> objs = new ArrayList<>();
		while(!list.isEmpty())
		{
			objs.add(list.removeFirst());
		}
		
		Object[] expected = {"Mansi", "Aarohi", "Payal"};
		Assert.assertEquals(Arrays.asList(expected).toString(), objs.toString());
	}
	
	@Test
	public void testAddAt4()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Payal");
		list.addFirst("Aarohi");
		list.addFirst("Ruhi");
		list.addFirst("Archana");
		list.addFirst("Sonu");
		//System.out.println(list.easyToString() + "\n");
		
		list.addAt(0, "Mansi");
		Assert.assertEquals(6, list.getSize());
		//System.out.println(list.easyToString());
		
		ArrayList<Object> objs = new ArrayList<>();
		while(!list.isEmpty())
		{
			objs.add(list.removeFirst());
		}
		
		Object[] expected = {"Mansi", "Sonu", "Archana", "Ruhi", "Aarohi", "Payal"};
		Assert.assertEquals(Arrays.asList(expected).toString(), objs.toString());
	}
	
	@Test
	public void testAddAt5()
	{
		LinkedList list = new LinkedList();
		list.addFirst("Payal");
		list.addFirst("Aarohi");
		list.addFirst("Ruhi");
		list.addFirst("Archana");
		list.addFirst("Sonu");
		//System.out.println(list.easyToString() + "\n");
		
		list.addAt(3, "Mansi");
		Assert.assertEquals(6, list.getSize());
		//System.out.println(list.easyToString());
		
		ArrayList<Object> objs = new ArrayList<>();
		while(!list.isEmpty())
		{
			objs.add(list.removeFirst());
		}
		
		Object[] expected = {"Sonu", "Archana", "Ruhi", "Mansi", "Aarohi", "Payal"};
		Assert.assertEquals(Arrays.asList(expected).toString(), objs.toString());
	}
}

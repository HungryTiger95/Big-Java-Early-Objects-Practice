package exercise_09;

import org.junit.Test;
import org.junit.Assert;

public class ListTest
{
	@Test
	public void testHasNext1()
	{
		ArrayList list = new ArrayList();
		
		ArrayListIterator iter = list.listIterator();
		
		Assert.assertEquals(false, iter.hasNext());
	}
	
	@Test
	public void testHasNext2()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		
		ArrayListIterator iter = list.listIterator();
		
		Assert.assertEquals(true, iter.hasNext());
	}
	
	@Test
	public void testHasNext3()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		
		Assert.assertEquals(false, iter.hasNext());
	}
	
	@Test
	public void testHasNext4()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Riya");
		list.addLast("Mansi");
		list.addLast("Serena");
		list.addLast("Warina");
		
		ArrayListIterator iter = list.listIterator();
		int count = 0;
		while(iter.hasNext())
		{
			count++;
			iter.next();
		}
	
		Assert.assertEquals(6, count);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testNext1()
	{
		ArrayList list = new ArrayList();
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
	}
	
	@Test
	public void testNext2()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		
		ArrayListIterator iter = list.listIterator();
		
		Assert.assertEquals("Payal", iter.next());
	}
	
	@Test
	public void testNext3()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		
		Assert.assertEquals("Payal", iter.next());
		Assert.assertEquals("Aarohi", iter.next());
		Assert.assertEquals("Simran", iter.next());
		Assert.assertEquals("Priya", iter.next());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testNext4()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		
		Assert.assertEquals("Payal", iter.next());
		Assert.assertEquals("Aarohi", iter.next());
		Assert.assertEquals("Simran", iter.next());
		Assert.assertEquals("Priya", iter.next());
		iter.next();
	}
	
	@Test
	public void testHasPrevious1()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		Assert.assertEquals(false, iter.hasPrevious());
	}
	
	@Test
	public void testHasPrevious2()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		
		Assert.assertEquals(false, iter.hasPrevious());
	}
	
	@Test
	public void testHasPrevious3()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		
		Assert.assertEquals(true, iter.hasPrevious());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testHasPrevious4()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		
		Assert.assertEquals(true, iter.hasPrevious());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testPrevious1()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.previous();
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testPrevious2()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		
		Assert.assertEquals("Payal", iter.previous());
	}
	
	@Test
	public void testPrevious3()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		Assert.assertEquals("Payal", iter.previous());
	}
	
	@Test
	public void testPrevious4()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		Assert.assertEquals("Aarohi", iter.previous());
	}
	
	@Test
	public void testPrevious5()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		Assert.assertEquals("Simran", iter.previous());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testPrevious6()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		Assert.assertEquals("Priya", iter.previous());
	}
	
	@Test
	public void testNextIndex1()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();

		Assert.assertEquals(0, iter.nextIndex());
	}
	
	@Test
	public void testNextIndex2()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		Assert.assertEquals(1, iter.nextIndex());
	}
	
	@Test
	public void testNextIndex3()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		Assert.assertEquals(2, iter.nextIndex());
	}
	
	@Test
	public void testNextIndex4()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		Assert.assertEquals(3, iter.nextIndex());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testNextIndex5()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		Assert.assertEquals(4, iter.nextIndex());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testPreviousIndex1()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();

		Assert.assertEquals(0, iter.previousIndex());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testPreviousIndex2()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		Assert.assertEquals(0, iter.previousIndex());
	}
	
	@Test
	public void testPreviousIndex3()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		Assert.assertEquals(0, iter.previousIndex());
	}
	
	@Test
	public void testPreviousIndex4()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		Assert.assertEquals(1, iter.previousIndex());
	}
	
	@Test
	public void testPreviousIndex5()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		Assert.assertEquals(2, iter.previousIndex());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testPreviousIndex6()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		Assert.assertEquals(3, iter.previousIndex());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemove1()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.remove();
	}
	
	@Test
	public void testRemove2()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.remove();
		
		Assert.assertEquals(3, list.size());
	}
	
	@Test
	public void testRemove3()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.remove();
		
		Assert.assertEquals(3, list.size());
	}
	
	@Test
	public void testRemove4()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.remove();
		
		Assert.assertEquals(3, list.size());
	}
	
	@Test
	public void testRemove5()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		iter.remove();
		
		Assert.assertEquals(3, list.size());
	}
	
	@Test
	public void testRemove6()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.remove();		// Remove Payal
		
		iter.next();
		iter.remove();		// Remove Aarohi
		
		Assert.assertEquals(2, list.size());
	}
	
	@Test
	public void testRemove7()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.remove();		// Remove Payal
		
		iter.next();
		iter.remove();		// Remove Aarohi
		
		iter.next();
		iter.remove();		// Remove Simran
		
		Assert.assertEquals(1, list.size());
	}
	
	@Test
	public void testRemove8()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.remove();		// Remove Payal
		
		iter.next();
		iter.remove();		// Remove Aarohi
		
		iter.next();
		iter.remove();		// Remove Simran
		
		iter.next();
		iter.remove();		// Remove Priya
		
		Assert.assertEquals(0, list.size());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemove9()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.remove();		// Remove Payal
		
		iter.next();
		iter.remove();		// Remove Aarohi
		
		iter.next();
		iter.remove();		// Remove Simran
		
		iter.next();
		iter.remove();		// Remove Priya
		
		iter.remove();
		
		Assert.assertEquals(0, list.size());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testSet1()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.set("Anushka");
	}
	
	@Test
	public void testSet2()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.set("Mansi");
		
		Assert.assertEquals("Mansi", list.get(0));
		//System.out.println(list);
	}
	
	@Test
	public void testSet3()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.set("Mansi");
		
		Assert.assertEquals("Mansi", list.get(1));
		//System.out.println(list);
	}
	
	@Test
	public void testSet4()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.set("Mansi");
		
		Assert.assertEquals("Mansi", list.get(2));
		//System.out.println(list);
	}
	
	@Test
	public void testSet5()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		iter.set("Mansi");
		
		Assert.assertEquals("Mansi", list.get(3));
		//System.out.println(list);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAdd1()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.add("Mansi");
	}
	
	@Test
	public void testAdd2()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.add("Mansi");
		Assert.assertEquals(5, list.size());
		Assert.assertEquals("Mansi", list.get(0));
		//System.out.println(list);
	}
	
	@Test
	public void testAdd3()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.add("Mansi");
		Assert.assertEquals(5, list.size());
		Assert.assertEquals("Mansi", list.get(1));
		//System.out.println(list);
	}
	
	@Test
	public void testAdd4()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.add("Mansi");
		Assert.assertEquals(5, list.size());
		Assert.assertEquals("Mansi", list.get(2));
		//System.out.println(list);
	}
	
	@Test
	public void testAdd5()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		iter.add("Mansi");
		Assert.assertEquals(5, list.size());
		Assert.assertEquals("Mansi", list.get(3));
		//System.out.println(list);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAdd6()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		iter.add("Mansi");
		Assert.assertEquals(5, list.size());
		Assert.assertEquals("Mansi", list.get(3));
		//System.out.println(list);
	}
	
	@Test
	public void testIterable1()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		list.addLast("Ruhi");
		
		int count = 0;
		for(Object name : list)
		{
			count++;
			//System.out.println(name);
		}
		Assert.assertEquals(5, count);
	}
	
	@Test
	public void testIterable2()
	{
		ArrayList list = new ArrayList();
		list.addLast("Payal");
		list.addLast("Aarohi");
		list.addLast("Simran");
		list.addLast("Priya");
		list.addLast("Ruhi");
		
		ArrayListIterator iter = list.listIterator();
		iter.next();
		iter.next();
		iter.add("Mansi");
		
		int count = 0;
		for(Object name : list)
		{
			count++;
			System.out.println(name);
		}
		Assert.assertEquals(6, count);
	}
}

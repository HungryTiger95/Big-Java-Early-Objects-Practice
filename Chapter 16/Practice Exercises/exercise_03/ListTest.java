package exercise_03;

import java.awt.Rectangle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Two test cases testing a working hasNext method and a faulty hasNext method.
 * 
 * @author Mayuresh
 *
 */
public class ListTest
{
	@Test
	public void testBadHasNext()
	{
		LinkedList list = new LinkedList();
		list.addFirst(new Rectangle(10, 10, 10, 10));
		list.addFirst(new Rectangle(20, 20, 20, 20));
		list.addFirst(new Rectangle(30, 30, 30, 30));
		list.addFirst(new Rectangle(40, 40, 40, 40));
		list.addFirst(new Rectangle(50, 50, 50, 50));
		list.addFirst(new Rectangle(60, 60, 60, 60));
		
		MyListIterator iter = list.listIterator();
		
		for(int i = 0; i < 10; i++)
		{
			if(iter.faultyHasNext())
			{
				Assert.assertEquals(true, iter.faultyHasNext());
				
				Object obj = iter.next();
				System.out.println(obj.toString());
			}
			else
			{
				System.out.println("No more objects are after this one: " + i);
				break;
			}
		}
	}
	
	@Test
	public void testGoodHasNext()
	{
		LinkedList list = new LinkedList();
		list.addFirst(new Rectangle(10, 10, 10, 10));
		list.addFirst(new Rectangle(20, 20, 20, 20));
		list.addFirst(new Rectangle(30, 30, 30, 30));
		list.addFirst(new Rectangle(40, 40, 40, 40));
		list.addFirst(new Rectangle(50, 50, 50, 50));
		list.addFirst(new Rectangle(60, 60, 60, 60));
		
		MyListIterator iter = list.listIterator();
		
		for(int i = 0; i < 10; i++)
		{
			if(iter.hasNext())
			{
				Assert.assertEquals(true, iter.hasNext());
				
				Object obj = iter.next();
				System.out.println(obj.toString());
			}
			else
			{
				System.out.println("No more objects are after this one: " + i);
				break;
			}
		}
	}
}

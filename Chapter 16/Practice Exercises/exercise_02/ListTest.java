package exercise_02;

import java.awt.Rectangle;
import org.junit.Test;
import org.junit.Assert;

/**
 * Tests whether or not the addFirst method is working correctly. We are looking for a failure here
 * (it should light up green because the boolean is inverted; testing to make sure that the element
 * that was removed first is not the same as the next element) If an element is added, and then
 * removed, then we expect that that element would not exist in the linked list since no other
 * element within the list has an element with the same values. Here I use rectangle objects.
 * The first calls are made to a correctly working addFirst method. The last call is to a faulty
 * addFirst method.
 * 
 * @author Mayuresh
 *
 */
public class ListTest
{
	@Test
	public void testaddFirst()
	{
		MyLinkedList list = new MyLinkedList();
		list.addFirst(new Rectangle(10, 10, 10, 10));
		list.addFirst(new Rectangle(20, 20, 20, 20));
		list.addFirst(new Rectangle(30, 30, 30, 30));
		list.faultyAddFirst(new Rectangle(40, 40, 40, 40));
		
		Object element = list.removeFirst();
		
		Assert.assertEquals(false, !list.removeFirst().equals(element));
	}

}

package exercise_07;

import org.junit.Assert;
import org.junit.Test;

import java.awt.Rectangle;

public class MyLinkedListDemo
{
	@Test
	public void testIterator()
	{
		MyLinkedList<Rectangle> list = new MyLinkedList<>();
		list.addFirst(new Rectangle(10, 10, 10, 10));
		list.addFirst(new Rectangle(20, 20, 20, 20));
		list.addFirst(new Rectangle(30, 30, 30, 30));
		list.addFirst(new Rectangle(40, 40, 40, 40));
		list.addFirst(new Rectangle(50, 50, 50, 50));
		list.addFirst(new Rectangle(60, 60, 60, 60));
		list.addFirst(new Rectangle(70, 70, 70, 70));
		list.addFirst(new Rectangle(80, 80, 80, 80));
		
		Assert.assertEquals(8, list.size());
		
		MyListIterator<Rectangle> iter = list.listIterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	
	@Test
	public void testIterator2()
	{
		MyLinkedList<Rectangle> list = new MyLinkedList<>();
		list.addFirst(new Rectangle(10, 10, 10, 10));
		list.addFirst(new Rectangle(20, 20, 20, 20));
		list.addFirst(new Rectangle(30, 30, 30, 30));
		list.addFirst(new Rectangle(40, 40, 40, 40));
		list.addFirst(new Rectangle(50, 50, 50, 50));
		list.addFirst(new Rectangle(60, 60, 60, 60));
		list.addFirst(new Rectangle(70, 70, 70, 70));
		list.addFirst(new Rectangle(80, 80, 80, 80));
		
		Assert.assertEquals(8, list.size());
		
		MyListIterator<Rectangle> iter = list.listIterator();
		int loop = 0;
		while(iter.hasNext())
		{
			iter.next();
			if(loop == 3)
			{
				iter.remove();
			}
			loop++;
		}
		
		MyListIterator<Rectangle> iter2 = list.listIterator();
		while(iter2.hasNext())
		{
			System.out.println(iter2.next());
		}
	}
}

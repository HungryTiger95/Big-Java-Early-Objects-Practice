package exercise_19;

import org.junit.Test;
import org.junit.Assert;

import java.util.Random;
import java.awt.Rectangle;

public class HashSetTest
{
	@Test
	public void testHashSetSize()
	{
		HashSet set = new HashSet(10);
		
		Random gen = new Random();
		int limit = 10;
		for(int i = 0; i < limit; i++)
		{
			Rectangle box = new Rectangle(gen.nextInt(50) + 1,
					gen.nextInt(50) + 1,
					gen.nextInt(50) + 1,
					gen.nextInt(50) + 1);
			
			set.add(box);
		}
		
		//System.out.println("TEST1:\n" + set.toString());
		Assert.assertEquals(10, set.getSize());
	}
	
	@Test
	public void testHashSetContains()
	{
		HashSet set = new HashSet(10);
		
		Rectangle box1 = new Rectangle(10, 10, 10, 10);
		Rectangle box2 = new Rectangle(20, 10, 10, 10);
		Rectangle box3 = new Rectangle(30, 10, 10, 10);
		Rectangle box4 = new Rectangle(40, 10, 10, 10);
		Rectangle box5 = new Rectangle(50, 10, 10, 10);
		Rectangle box6 = new Rectangle(60, 10, 10, 10);
		Rectangle box7 = new Rectangle(70, 10, 10, 10);
		Rectangle box8 = new Rectangle(80, 10, 10, 10);
		Rectangle box9 = new Rectangle(90, 10, 10, 10);
		Rectangle box10 = new Rectangle(100, 10, 10, 10);
		
		set.add(box1);
		set.add(box2);
		set.add(box3);
		set.add(box4);
		set.add(box5);
		set.add(box6);
		set.add(box7);
		set.add(box8);
		set.add(box9);
		set.add(box10);
		
		//System.out.println("TEST2:\n" + set.toString() + "\n\n");
		Assert.assertEquals(10, set.getSize());
		
		Assert.assertEquals(true, set.contains(new Rectangle(30, 10, 10, 10)));
		Assert.assertEquals(false, set.contains(new Rectangle(0, 0, 10, 10)));
		Assert.assertEquals(true, set.contains(new Rectangle(100, 10, 10, 10)));
		Assert.assertEquals(true, set.contains(new Rectangle(60, 10, 10, 10)));
		Assert.assertEquals(false, set.contains(new Rectangle(32, 32, 10, 10)));
	}
	
	@Test
	public void testHashSetRemove()
	{
		HashSet set = new HashSet(10);
		
		Rectangle box1 = new Rectangle(10, 10, 10, 10);
		Rectangle box2 = new Rectangle(20, 10, 10, 10);
		Rectangle box3 = new Rectangle(30, 10, 10, 10);
		Rectangle box4 = new Rectangle(40, 10, 10, 10);
		Rectangle box5 = new Rectangle(50, 10, 10, 10);
		Rectangle box6 = new Rectangle(60, 10, 10, 10);
		Rectangle box7 = new Rectangle(70, 10, 10, 10);
		Rectangle box8 = new Rectangle(80, 10, 10, 10);
		Rectangle box9 = new Rectangle(90, 10, 10, 10);
		Rectangle box10 = new Rectangle(100, 10, 10, 10);
		
		set.add(box1);
		set.add(box2);
		set.add(box3);
		set.add(box4);
		set.add(box5);
		set.add(box6);
		set.add(box7);
		set.add(box8);
		set.add(box9);
		set.add(box10);
		
		//System.out.println("TEST3 Initial:\n" + set.easyToString() + "\n");
		Assert.assertEquals(10, set.getSize());
		
		// Create an Iterator element
		SetIterator iter = set.hashSetIterator();

		iter.hasNext();
		Object obj = (Rectangle) iter.next();
		
		iter.hasNext();
		Object obj2 = (Rectangle) iter.next();
		
		iter.hasNext();
		Object obj3 = (Rectangle) iter.next();
		//System.out.println(obj.toString() + "\n" + obj2.toString() + "\n" + obj3.toString());
		
		Assert.assertEquals(box4, obj);
		Assert.assertEquals(box5, obj2);
		Assert.assertEquals(box6, obj3);
		
		iter.remove();
		
		Assert.assertEquals(9, set.getSize());
		//System.out.println("Test3 Final:\n" + set.toString() + "\n");
	}
	
	@Test
	public void testHashSetRemove2()
	{
		HashSet set = new HashSet(10);
		
		Rectangle box1 = new Rectangle(10, 10, 10, 10);
		Rectangle box2 = new Rectangle(20, 10, 10, 10);
		Rectangle box3 = new Rectangle(30, 10, 10, 10);
		Rectangle box4 = new Rectangle(40, 10, 10, 10);
		Rectangle box5 = new Rectangle(50, 10, 10, 10);
		Rectangle box6 = new Rectangle(60, 10, 10, 10);
		Rectangle box7 = new Rectangle(70, 10, 10, 10);
		Rectangle box8 = new Rectangle(80, 10, 10, 10);
		Rectangle box9 = new Rectangle(90, 10, 10, 10);
		Rectangle box10 = new Rectangle(100, 10, 10, 10);
		
		set.add(box1);
		set.add(box2);
		set.add(box3);
		set.add(box4);
		set.add(box5);
		set.add(box6);
		set.add(box7);
		set.add(box8);
		set.add(box9);
		set.add(box10);
		
		//System.out.println("TEST4 Initial:\n" + set.easyToString() + "\n");
		Assert.assertEquals(10, set.getSize());
		
		// Create an Iterator element
		SetIterator iter = set.hashSetIterator();

		while(iter.hasNext())
		{
			Object obj = (Rectangle) iter.next();
			//System.out.println(obj);
			
			//System.out.println("Pos: " + iter.getPosition());
			//System.out.println("Prev: " + iter.getPrevious() + "\n");
			iter.remove();
			//System.out.println("Pos: " + iter.getPosition());
			//System.out.println("Prev: " + iter.getPrevious() + "\n");
		}
		
		Assert.assertEquals(0, set.getSize());
		//System.out.println("Test4 Final:\n" + set.easyToString() + "\n");
	}
}

package exercise_01;

import org.junit.Assert;
import org.junit.Test;

public class TreesDemo
{
	@Test
	public void testLeavesCount1()
	{
		Tree t1 = new Tree("Anne");
		Tree t2 = new Tree("Peter");
		Tree t3 = new Tree("George");
		Tree t4 = new Tree("Alex");
		Tree t5 = new Tree("Elizabeth");
		Tree t6 = new Tree("Lincoln");

		t1.addSubtree(t2);
		t1.addSubtree(t3);
		t3.addSubtree(t4);
		t2.addSubtree(t5);
		t4.addSubtree(t6);

		Assert.assertEquals(2, t1.getLeavesCount());
		//System.out.println("Leaves Count: " + t1.getLeavesCount());
	}
	
	@Test
	public void testLeavesCount2()
	{
		Tree t1 = new Tree("Anne");
		Tree t2 = new Tree("Peter");
		Tree t3 = new Tree("George");
		Tree t4 = new Tree("Alex");
		Tree t5 = new Tree("Elizabeth");
		Tree t6 = new Tree("Lincoln");

		t1.addSubtree(t2);
		t1.addSubtree(t3);
		t1.addSubtree(t4);
		t4.addSubtree(t5);
		t5.addSubtree(t6);

		Assert.assertEquals(3, t1.getLeavesCount());
		//System.out.println("Leaves Count: " + t1.getLeavesCount());
	}
	
	@Test
	public void testLeavesCount3()
	{
		Tree t1 = new Tree("Anne");
		Tree t2 = new Tree("Peter");
		Tree t3 = new Tree("George");
		Tree t4 = new Tree("Alex");
		Tree t5 = new Tree("Elizabeth");
		Tree t6 = new Tree("Lincoln");

		t1.addSubtree(t2);
		t1.addSubtree(t3);
		t1.addSubtree(t4);
		t4.addSubtree(t5);
		t4.addSubtree(t6);

		Assert.assertEquals(4, t1.getLeavesCount());
		//System.out.println("Leaves Count: " + t1.getLeavesCount());
	}
}

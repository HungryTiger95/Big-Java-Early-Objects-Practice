package exercise_06;

import org.junit.Assert;
import org.junit.Test;

public class SmallestTest
{
	@Test
	public void testSmallest1()
	{
		BinarySearchTree t = new BinarySearchTree();
		t.add("D");
		
		//System.out.println(t.print().trim());
		Assert.assertEquals("D", t.smallest().toString());
		Assert.assertEquals("D", t.print().trim());
	}
	
	@Test
	public void testSmallest2()
	{
		BinarySearchTree t = new BinarySearchTree();
		t.add("D");
		t.add("F");
		t.add("A");
		
		//System.out.println(t.print().trim());
		Assert.assertEquals("A", t.smallest().toString());
		Assert.assertEquals("A D F", t.print().trim());
	}
	
	@Test
	public void testSmallest3()
	{
		BinarySearchTree t = new BinarySearchTree();
		t.add("D");
		t.add("F");
		t.add("A");
		t.add("G");
		t.add("E");
		t.add("B");
		t.add("S");
		
		//System.out.println(t.print().trim());
		Assert.assertEquals("A", t.smallest().toString());
		Assert.assertEquals("A B D E F G S", t.print().trim());
	}
	
	@Test
	public void testSmallest4()
	{
		BinarySearchTree t = new BinarySearchTree();
		t.add("D");
		t.add("B");
		t.add("A");
		t.add("C");
		t.add("F");
		t.add("E");
		t.add("I");
		t.add("G");
		t.add("H");
		t.add("J");
		t.remove("A"); // Removing leaf
		t.remove("B"); // Removing element with one child
		t.remove("F"); // Removing element with two children
		t.remove("D"); // Removing root
		
		t.add("D");
		t.add("F");
		
		t.remove("H");
		t.remove("E");
		
		//System.out.println(t.print().trim());
		Assert.assertEquals("C", t.smallest().toString());
		Assert.assertEquals("C D F G I J", t.print().trim());
	}
}

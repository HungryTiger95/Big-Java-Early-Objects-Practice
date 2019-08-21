package exercise_05;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest
{
	@Test
	public void test1()
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
		
		Assert.assertEquals("C D F G I J", t.print().trim());
	}
	
	@Test
	public void test2()
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
		t.remove("E");
		
		Assert.assertEquals("A B C D F G H I J", t.print().trim());
	}
	
	@Test
	public void test3()
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
		t.remove("I");
		
		//System.out.println(t.print());
		Assert.assertEquals("A B C D E F G H J", t.print().trim());
	}
	
	@Test
	public void test4()
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
		t.remove("I");
		t.add("K");
		t.add("R");
		
		//System.out.println(t.print());
		Assert.assertEquals("A B C D E F G H J K R", t.print().trim());
	}
	
	@Test
	public void test5()
	{
		BinarySearchTree t = new BinarySearchTree();
		t.add("D");
		
		//System.out.println(t.print());
		Assert.assertEquals("D", t.print().trim());
	}
	
	@Test
	public void test6()
	{
		BinarySearchTree t = new BinarySearchTree();
		t.add("D");
		t.add("B");
		
		//System.out.println(t.print());
		Assert.assertEquals("B D", t.print().trim());
	}
	
	@Test
	public void test7()
	{
		BinarySearchTree t = new BinarySearchTree();
		t.add("D");
		t.add("B");
		t.add("A");
		
		//System.out.println(t.print());
		Assert.assertEquals("A B D", t.print().trim());
	}
	
	@Test
	public void test8()
	{
		BinarySearchTree t = new BinarySearchTree();
		t.add("D");
		t.add("B");
		t.add("A");
		t.add("E");
		t.add("G");
		
		//System.out.println(t.print());
		Assert.assertEquals("A B D E G", t.print().trim());
	}
}

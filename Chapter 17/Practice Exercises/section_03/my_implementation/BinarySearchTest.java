package section_03.my_implementation;

import org.junit.Test;
import org.junit.Assert;

import section_03.BinarySearchTree;

public class BinarySearchTest
{
	public static void main(String[] args)
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
		
		t.print();
		System.out.println("Expected: C D F G I J");
	}
}

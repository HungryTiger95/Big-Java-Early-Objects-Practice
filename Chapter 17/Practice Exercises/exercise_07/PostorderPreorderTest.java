package exercise_07;

import org.junit.Assert;
import org.junit.Test;

public class PostorderPreorderTest
{
	BinaryTree t = new BinaryTree(10,
			new BinaryTree(30,
					new BinaryTree(40,
							new BinaryTree(80),
							new BinaryTree(90)),
					new BinaryTree(50,
							new BinaryTree(100))),
			new BinaryTree(20,
					new BinaryTree(70),
					new BinaryTree(60,
							new BinaryTree(110),
							new BinaryTree(115))));
	
	BinaryTree t2 = new BinaryTree("*",
			new BinaryTree("+",
					new BinaryTree("3"),
					new BinaryTree("4")),
			new BinaryTree("5"));
	
	BinaryTree t3 = new BinaryTree("+",
			new BinaryTree("3"),
			new BinaryTree("*",
					new BinaryTree("4"),
					new BinaryTree("5")));
	
	class Preorder implements Visitor
	{
		public void visit(Object data)
		{
			System.out.print(data.toString() + " ");
		}
	}
	
	class Postorder implements Visitor
	{
		public void visit(Object data)
		{
			System.out.print(data.toString() + " ");
		}
	}
	
	class Inorder implements Visitor
	{
		public void visit(Object data)
		{
			System.out.print(data.toString() + " ");
		}
	}
	
	@Test
	public void testT1_1()
	{
		System.out.println("Preorder:");
		t.preorder(new Preorder());
	}
	
	@Test
	public void testT1_2()
	{
		System.out.println("Postorder:");
		t.postorder(new Postorder());
	}
	
	@Test
	public void testT2_1()
	{
		System.out.println("\nPostorder:");
		t3.postorder(new Postorder());
	}
	
	@Test
	public void testT2_2()
	{
		System.out.println("Postorder:");
		t2.postorder(new Postorder());
	}
	
	@Test
	public void testInorder1()
	{
		System.out.println("\nInorder:");
		t.inorder(new Inorder());
	}
}

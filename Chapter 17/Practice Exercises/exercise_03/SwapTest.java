package exercise_03;

/**
 * swapChildren method works. You need to go into debug mode and traverse
 * the tree manually to visualize the change.
 * 
 * @author Mayuresh
 *
 */
public class SwapTest
{
	public static void main(String[] args)
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
		
		System.out.println(t.height());
		System.out.println(t.countNodesWithOneChild());
		System.out.println(t);
		t.swapChildren();
		
		System.out.println(t);
	}
}

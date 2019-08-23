package exercise_07;

/**
 * Add methods
 * 
 * 		void preorder(Visitor v)
 * 		void inorder(Visitor v)
 * 		void postorder(Visitor v)
 * 
 * to the BinaryTree class of Section 17.2
 * 
 * @author Mayuresh
 *
 */
public class BinaryTree implements Visitor
{
	private Node root;
	
	/**
	 * Constructs an empty tree
	 */
	public BinaryTree()
	{
		root = null;
	}
	
	/**
	 * Constructs a tree with one node and no children
	 * @param rootData the data for the root node
	 */
	public BinaryTree(Object rootData)
	{
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}
	
	/**
	 * Constructs a binary tree
	 * @param rootData the data for the root
	 * @param left the left subtree
	 * @param right the right subtree
	 */
	public BinaryTree(Object rootData, BinaryTree left, BinaryTree right)
	{
		root = new Node();
		root.data = rootData;
		root.left = left.root;
		root.right = right.root;
	}
	
	public BinaryTree(Object rootData, BinaryTree left)
	{
		root = new Node();
		root.data = rootData;
		root.left = left.root;
		root.right = null;
	}
	
	class Node
	{
		public Object data;
		public Node left;
		public Node right;
	}
	
	/**
	 * Returns the height of the subtree whose root is the given node
	 * @param n a node or null
	 * @return the height of the subtree, or 0 if n is null
	 */
	private static int height(Node n)
	{
		if(n == null)
		{
			return 0;
		}
		else
		{
			return 1 + Math.max(height(n.left), height(n.right));
		}
	}
	
	/**
	 * Returns the height of this tree
	 * @return the height
	 */
	public int height()
	{
		return height(root);
	}
	
	/**
	 * Checks whether this tree is empty
	 * @return true if this tree is empty
	 */
	public boolean isEmpty()
	{
		return root == null;
	}
	
	/**
	 * Gets the data at the root of this tree
	 * @return the root data
	 */
	public Object data()
	{
		return root.data;
	}
	
	/**
	 * Gets the left subtree of this tree
	 * @return the left child of the root
	 */
	public BinaryTree left()
	{
		BinaryTree result = new BinaryTree();
		result.root = root.left;
		return result;
	}
	
	/**
	 * Gets the right subtree of this tree
	 * @return the right child of the root
	 */
	public BinaryTree right()
	{
		BinaryTree result = new BinaryTree();
		result.root = root.right;
		return result;
	}

	public void preorder(Visitor v)
	{
		preorder(root, v);
		System.out.println();
	}
	
	private void preorder(Node n, Visitor v)
	{
		if(n == null)
		{
			return;
		}
		v.visit(n.data);
		
		preorder(n.left, v);
		preorder(n.right, v);
	}
	
	public void postorder(Visitor v)
	{
		postorder(root, v);
		System.out.println();
	}
	
	private void postorder(Node root, Visitor v)
	{
		if(root == null)
		{
			return;
		}
		
		postorder(root.left, v);
		postorder(root.right, v);
		
		v.visit(root.data);
	}
	
	public void inorder(Visitor v)
	{
		inorder(root, v);
		System.out.println();
	}
	
	private void inorder(Node n, Visitor v)
	{
		if(n == null)
		{
			return;
		}
		
		inorder(n.left, v);
		v.visit(n.data);
		inorder(n.right, v);
	}
	@Override
	public void visit(Object data)
	{
		System.out.println(data.toString());
	}
}

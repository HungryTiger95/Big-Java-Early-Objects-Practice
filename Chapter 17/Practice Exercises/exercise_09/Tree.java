package exercise_09;

import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Add a method void depthFirst(Visitor v) to the Tree class of Section 17.4. Keep visiting until the visit method returns false
 * @author Mayuresh
 *
 */
public class Tree
{
	// Instance Variables
	private Node root;
	
	// Constructors
	/**
	 * Constructs an empty tree.
	 */
	public Tree()
	{
		root = null;
	}
	
	/**
	 * Constructs a tree with one node and no children
	 * @param rootData the data for the root
	 */
	public Tree(Object rootData)
	{
		root = new Node();
		root.data = rootData;
		root.children = new LinkedList<Node>();
	}
	
	// Methods
	/**
	 * Adds a subtree as the last child fo the root
	 * @param subtree the subtree to add
	 */
	public void addSubtree(Tree subtree)
	{
		root.children.add(subtree.root);
	}
	
	/**
	 * Computes the size of this tree
	 * @return the number of nodes in the tree
	 */
	public int size()
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			return root.size();
		}
	}
	
	public void breadthFirst(Visitor v)
	{
		if(root == null)
		{
			return;
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		boolean more = true;
		while(more && q.size() > 0)
		{
			Node n = q.remove();
			System.out.println(n.data);
			more = v.visit(n.data);
			
			if(more)
			{
				for(Node c : n.children)
				{
					q.add(c);
				}
			}
		}
	}
	
	public void depthFirst(Visitor v)
	{
		if(root == null)
		{
			return;
		}
		
		Stack<Node> q = new Stack<Node>();
		q.push(root);
		
		boolean more = true;
		while(more && q.size() > 0)
		{
			Node n = q.pop();
			System.out.println(n.data);
			more = v.visit(n.data);
			
			if(more)
			{
				for(Node c : n.children)
				{
					q.push(c);
				}
			}
		}
	}
	
	// Inner Classes
	class Node
	{
		// Instance Variables
		public Object data;
		public List<Node> children;
		
		// Constructors
		
		// Methods
		/**
		 * Computes the size of the subtree whose root is this node.
		 * @return the number of nodes in the subtree
		 */
		public int size()
		{
			int sum = 0;
			for(Node child : children)
			{
				sum += child.size();
			}
			return 1 + sum;
		}
	}
	
	/**
	 * A visitor whose visit method is called for each visited node
	 * during a tree traversal
	 * @author Mayuresh
	 *
	 */
	public interface Visitor
	{
		boolean visit(Object data);
	}
}

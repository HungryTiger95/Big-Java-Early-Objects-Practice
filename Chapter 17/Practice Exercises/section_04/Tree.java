package section_04;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

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
	
	/**
	 * Traverse this tree in preorder
	 * @param v the visitor to be invoked at each node
	 */
	public void preorder(Visitor v)
	{
		preorder(root, v);
	}
	
	/**
	 * Traverse the tree with a given root in preorder
	 * @param n the root of the tree
	 * @param v the visitor to be invoked at each node
	 */
	private static void preorder(Node n, Visitor v)
	{
		if(n == null)
		{
			return;
		}
		v.visit(n.data);
		
		for(Node c : n.children)
		{
			preorder(c, v);
		}
	}
	
	/**
	 * Traverse this tree in postorder
	 * @param v the visitor to be invoked at each node
	 */
	public void postorder(Visitor v)
	{
		postorder(root, v);
	}
	
	/**
	 * Traverse the tree with a given root in postorder
	 * @param n the root of the tree
	 * @param v the visitor to be invoked at each node
	 */
	private static void postorder(Node n, Visitor v)
	{
		if(n == null)
		{
			return;
		}
		v.visit(n.data);
		
		for(Node c : n.children)
		{
			postorder(c, v);
		}
	}
	
	/**
	 * Returns an iterator to be used to traverse this tree
	 * @return a new iterator
	 */
	public Iterator iterator()
	{
		return new BreadthFirstIterator(root);
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
		void visit(Object data);
	}
	
	/**
	 * This iterator visits the nodes of a tree in breadth-first order
	 * @author Mayuresh
	 *
	 */
	class BreadthFirstIterator implements Iterator
	{
		// Instance Variables
		private Queue<Node> q;
		
		// Constructors
		/**
		 * Constructs an iterator for a given tree
		 * @param root the root of the tree
		 */
		public BreadthFirstIterator(Node root)
		{
			q = new LinkedList<Node>();
			if(root != null)
			{
				q.add(root);
			}
		}
		
		// Methods
		/**
		 * Checks to see if there is another element in the tree
		 * @return true if there is another element, else false
		 */
		public boolean hasNext()
		{
			return q.size() > 0;
		}
		
		/**
		 * Moves the iterator past the next element
		 * @return the element that was traversed
		 */
		public Object next()
		{
			Node n = q.remove();
			for(Node c : n.children)
			{
				q.add(c);
			}
			return n.data;
		}
		
		/**
		 * Removes the last traversed element in the tree
		 * 
		 * Unsupported as of now
		 */
		public void remove()
		{
			throw new UnsupportedOperationException();
		}
	}
}

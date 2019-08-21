package exercise_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method that counts the number of all leaves in a tree
 * 
 * @author Mayuresh
 *
 */
public class Tree
{
	// Instance Variables
	private Node root;
	
	// Constructors
	/**
	 * Constructs an empty tree
	 */
	public Tree()
	{
		this.root = null;
	}
	
	/**
	 * Constructs a tree with one node and no children
	 * @param rootData the data for the root
	 */
	public Tree(Object rootData)
	{
		this.root = new Node();
		this.root.data = rootData;
		this.root.children = new ArrayList<Node>();
	}
	
	// Methods
	/**
	 * Adds a subtree as the last child of the root
	 * @param subtree the subtree
	 */
	public void addSubtree(Tree subtree)
	{
		this.root.children.add(subtree.root);
	}
	
	/**
	 * Computes the size of this tree
	 * @return the number of nodes in the tree
	 */
	public int size()
	{
		if(this.root == null)
		{
			return 0;
		}
		else
		{
			return this.root.size();
		}
	}
	
	/**
	 * Computes the number of leaves in this tree
	 * @return the number of leaves in the tree
	 */
	public int getLeavesCount()
	{
		int leavesCount = 0;
		if(this.root == null)
		{
			return leavesCount;
		}
		else
		{
			return this.root.countLeaves();
		}
	}
	// Inner Classes
	class Node
	{
		public Object data;
		public List<Node> children;
		
		/**
		 * Computes the size of the subtree whose root is this node
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
		
		/**
		 * Computes the number of leaves in the subtree whose root is this node
		 * @return the number of leaves in the subtree
		 */
		public int countLeaves()
		{
			int leaves = 0;
			for(Node child : children)
			{
				if(child.children.size() == 0)
				{
					leaves++;
				}
				leaves += child.countLeaves();
			}
			return leaves;
			
			
		}
	}
}

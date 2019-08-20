package section_03.my_implementation;

import section_01.Tree;

public class BinarySearchTree
{
	private Node root;
	
	/**
	 * Constructs an empty binary tree
	 */
	public BinarySearchTree()
	{
		root = null;
	}
	
	/**
	 * Inserts a new element into the tree
	 * @param obj the element to insert
	 */
	public void add(Comparable obj)
	{
		/*
		 * Create the new node and set the data of the node to obj.
		 * Set both the right child and left child nodes to null.
		 */
		Node newNode = new Node();
		newNode.data = obj;
		newNode.leftChild = null;
		newNode.rightChild = null;
		
		/*
		 * If the root is null, then set the newNode to the root.
		 * Otherwise, call addNode on the root.
		 */
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			root.addNode(newNode);
		}
	}
	
	/**
	 * Tries to find an element in the tree
	 * @param obj the element to look for
	 * @return true if the element is in the tree, else false
	 */
	public boolean find(Comparable obj)
	{
		/*
		 * Create a new node that points to the root node.
		 * Loop through the current node until you find the element
		 * or find that the current nodes children are null
		 */
		Node current = root;
		while(current != null)
		{
			/*
			 * Have a variable that calculates whether the current node
			 * is less than, equals to, or greater than the element you
			 * are looking for.
			 */
			int d = current.data.compareTo(obj);
			
			/*
			 * If the comparison is 0, then we found our element and we can
			 * return true. Otherwise, if the comparison is >0, then we want
			 * to look for the element in the current nodes left child. Otherwise,
			 * if the comparison is <0, then you want to look in the right
			 * child of this node. With the while loop you will traverse
			 * until you either find the element or if you reach null.
			 */
			if(d == 0)
			{
				return true;
			}
			else if(d > 0)
			{
				current = current.leftChild;
			}
			else
			{
				current = current.rightChild;
			}
		}
		
		return false;
		
	}
	
	/**
	 * Removes an element from the tree
	 * @param obj the element to be removed
	 */
	public void remove(Comparable obj)
	{
		/**
		 * Create a toBeRemoved node that points to the root node.
		 * Create a parent node that is initialized to null.
		 * Create a boolean found to flag whether or not the element
		 * has been found.
		 */
		Node toBeRemoved = root;
		Node parent = null;
		boolean found = false;
		
		/*
		 * While we don't find the element that we are looking for and
		 * we don't end up at a null node, we will traverse the tree
		 * looking for the element
		 */
		while(!found && toBeRemoved != null)
		{
			int d = toBeRemoved.data.compareTo(obj);
			
			if(d == 0)
			{
				found = true;
			}
			else
			{
				/*
				 * Otherwise, we set the parent node to the toBeRemoved node
				 * and if toBeRemoved is greater than the element that we are
				 * looking for, we will set toBeRemoved to the left child of
				 * toBeRemoved:
				 * 
				 * 		Essentially, we will go to the left child because the
				 * 		element is less than the current toBeRemoved node we
				 * 		are in.
				 * 
				 * If toBeRemoved is less than the element that we are looking
				 * for, we will set toBeRemoved to the right child of toBeRemoved
				 */
				parent = toBeRemoved;
				if(d > 0)
				{
					toBeRemoved = toBeRemoved.leftChild;
				}
				else
				{
					toBeRemoved = toBeRemoved.rightChild;
				}
			}
		}
		
		/*
		 * If we don't find the element, then we return out of the method. We
		 * do not go any further.
		 */
		if(!found)
		{
			return;
		}
		
		/*
		 * Next, we will go through the 2 possible combinations of child
		 * nodes that the current parent node will have.
		 * 
		 * 		1) One or neither children are null
		 * 		2) Both children null
		 */
		
		// Case 1: if the left child is null, then we take a look at the right child, vice-versa
		if(toBeRemoved.leftChild == null || toBeRemoved.rightChild == null)
		{
			// Create a newChild node
			Node newChild;
			
			// if the left child is null, set newChild to the right child
			if(toBeRemoved.leftChild == null)
			{
				newChild = toBeRemoved.rightChild;
			}
			else
			{
				newChild = toBeRemoved.leftChild;
			}
			
			/*
			 *  if parent is null, this means that the element we were looking for
			 *  was the root node of this tree. thus, we will set the root node
			 *  to newChild and then return out of this method.
			 *  
			 *  Otherwise, if the parents left child is the one that we want to remove,
			 *  we will set the parents left child to newChild. Vice-versa for the right
			 *  side.
			 */  
			if(parent == null)
			{
				root = newChild;
			}
			else if(parent.leftChild == toBeRemoved)
			{
				parent.leftChild = newChild;
			}
			else
			{
				parent.rightChild = newChild;
			}
			
			return;
		}
		
		// Case 2: Neither subtree is empty
		
		/*
		 * We will need two new nodes; smallestParent and smallest. smallestParent
		 * points to toBeRemoved and smallest points to the right child of toBeRemoved.
		 * Here, we want to find the smallest element in the the right subtree. So
		 * we will loop through the right subtree until we get to smallest.right == null.
		 * Then we will set the data of toBeRemoved to the data of smallest. Remember that
		 * toBeRemoved points to the same object in memory as root points to. So a change
		 * to toBeRemoved is reflected in root. Lastly, we will unlink the smallestParent's
		 * left or right child.
		 */
		Node smallestParent = toBeRemoved;
		Node smallest = toBeRemoved.rightChild;
		
		while(smallest.leftChild != null)
		{
			smallestParent = smallest;
			smallest = smallest.leftChild;
		}
		
		toBeRemoved.data = smallest.data;
		if(smallestParent == toBeRemoved)
		{
			smallestParent.rightChild = smallest.rightChild;
		}
		else
		{
			smallestParent.leftChild = smallest.rightChild;
		}
	}
	
	/**
	 * Prints the contents of the tree in sorted order
	 */
	public void print()
	{
		print(root);
		System.out.println();
	}
	
	/**
	 * Prints a node an all of its descendants in sorted order
	 * @param parent the root of the subtree to print
	 */
	private static void print(Node parent)
	{
		if(parent == null)
		{
			return;
		}
		
		print(parent.leftChild);
		System.out.println(parent.data + " ");
		print(parent.rightChild);
	}
	
	/**
	 * A node of a tree stores a data item and references to the left
	 * and right child nodes
	 * @author Mayuresh
	 *
	 */
	class Node
	{
		private Comparable data;
		private Node leftChild;
		private Node rightChild;
		
		/**
		 * Inserts a new node as a descendant of this node
		 * @param newNode the node to insert
		 */
		public void addNode(Node newNode)
		{
			// Compare the new nodes data to this nodes data
			int comp = newNode.data.compareTo(data);
			
			/*
			 * if the new node is less than this node, try to add the
			 * new node to the left child. Otherwise, if the new node is
			 * greater than this node, try to add the new node to the right
			 * child. There isn't an else statement at the end because this
			 * is a set and sets cannot have the same element twice
			 */
			if(comp < 0)
			{
				/*
				 * if the left child of this node is null set new node to the
				 * left child, otherwise call add node on the left child
				 */
				if(leftChild == null)
				{
					leftChild = newNode;
				}
				else
				{
					leftChild.addNode(newNode);
				}
			}
			else if(comp > 0)
			{
				/*
				 * if the right child of this node is null, set the new node to
				 * the right child, otherwise call addNode on the right child.
				 */
				if(rightChild == null)
				{
					rightChild = newNode;
				}
				else
				{
					rightChild.addNode(newNode);
				}
			}
		}
	}
}

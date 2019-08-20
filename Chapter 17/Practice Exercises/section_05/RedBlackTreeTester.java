package section_05;

import java.util.ArrayList;

public class RedBlackTreeTester
{
	public static void main(String[] args)
	{
		testFromBook();
		insertionTest("ABCDEFGHIJ");
		removalTest(removalTestTemplate());
		System.out.println("All Tests Passed");
	}
	
	/**
	 * Runs the simple test from the textbook
	 */
	public static void testFromBook()
	{
		RedBlackTree t = new RedBlackTree();
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
		assertEquals("C E G H I J ", t.toString());
	}
	
	/**
	 * Inserts all permutations of a string into a re-black tree and checks that
	 * it contains the string afterwards.
	 * @param letters a string of letters without repetition
	 */
	public static void insertionTest(String letters)
	{
		PermutationGenerator gen = new PermutationGenerator(letters);
		for(String perm : gen.getPermutations())
		{
			RedBlackTree t = new RedBlackTree();
			for(int i = 0; i < perm.length(); i++)
			{
				String s = perm.substring(i, i + 1);
				t.add(s);
			}
			assertEquals(letters, t.toString().replace(" ", ""));
		}
	}
	
	/**
	 * Tests removal, given a template for a tree with a black node that is to
	 * be deleted. All other nodes should be given all possible combinations of
	 * red and black.
	 * @param t the template for the test cases
	 */
	public static void removalTest(RedBlackTree t)
	{
		for(int m = 0; m <= 1; m++)
		{
			int nodesToColor = count(t.root) - 2;
			
			for(int k = 0; k < Math.pow(2, nodesToColor); k++)
			{
				RedBlackTree rb = new RedBlackTree();
				
				if(m == 0)
				{
					rb.root = copy(t.root);
				}
				else
				{
					rb.root = mirror(t.root);
				}
				
				RedBlackTree.Node[] nodes = getNodes(rb);
				RedBlackTree.Node toDelete = null;
				
				// Color with the bit pattern of k
				int bits = k;
				for(RedBlackTree.Node n : nodes)
				{
					if(n == rb.root)
					{
						n.color = RedBlackTree.BLACK;
					}
					else if(n.color == RedBlackTree.BLACK)
					{
						toDelete = n;
					}
					else
					{
						n.color = bits % 2;
						bits = bits / 2;
					}
				}
				
				// Add children to make equal costs to null
				int targetCost = costToRoot(toDelete);
				for(RedBlackTree.Node n : nodes)
				{
					int cost = targetCost - costToRoot(n);
					if(n.left == null)
					{
						n.setLeftChild(fullTree(cost));
					}
					
					if(n.right == null)
					{
						n.setRightChild(fullTree(cost));
					}
				}
				
				int filledSize = populate(rb);
				boolean good = true;
				
				try
				{
					checkRedBlack(rb);
				}
				catch(IllegalStateException ex)
				{
					good = false;
				}
				
				if(good)
				{
					Comparable d = toDelete.data;
					rb.remove(d);
					checkRedBlack(rb);
					
					for(Integer j = 0; j < filledSize; j++)
					{
						if(!rb.find(j) && !d.equals(j))
						{
							throw new IllegalStateException(j + "delted");
						}
						
						if(rb.find(d))
						{
							throw new IllegalStateException(d + " not deleted");
						}
					}
				}
			}
		}
	}
	
	/**
	 * Makes a template for testing removal.
	 * @return a partially complete red-black tree for the test.
	 * The node to be removed is black.
	 */
	private static RedBlackTree removalTestTemplate()
	{
		RedBlackTree template = new RedBlackTree();
		
		RedBlackTree.Node[] n = new RedBlackTree.Node[9];
		for(int i = 0; i < n.length; i++)
		{
			n[i] = new RedBlackTree.Node();
		}
		
		/*
        				 n7
       				    /  \
      				   n1   n8	
     				  /  \
   				    n0    n3
        				 /  \
       				    n2*  n5
            				 /\
          				   n4  n6
		 */
		template.root = n[7];
		n[7].setLeftChild(n[1]);
		n[7].setRightChild(n[8]);
		n[1].setLeftChild(n[0]);
		n[1].setRightChild(n[3]);
		n[3].setLeftChild(n[2]);
		n[3].setRightChild(n[5]);
		n[5].setLeftChild(n[4]);
		n[5].setRightChild(n[6]);
		
		n[2].color = RedBlackTree.BLACK;
		
		return template;
	}
	
	/**
	 * Gets all nodes of this tree in sorted order.
	 * @param t a red-black tree
	 * @return an array of all nodes in t
	 */
	private static RedBlackTree.Node[] getNodes(RedBlackTree t)
	{
		RedBlackTree.Node[] nodes = new RedBlackTree.Node[count(t.root)];
		getNodes(t.root, nodes, 0);
		return nodes;
	}
	
	/**
	 * Gets all nodes of a subtree and fills them into an array.
	 * @param n the root of the subtree
	 * @param nodes the array into which to place the nodes
	 * @param start the offset at which to start placing the nodes
	 * @return the number of nodes placed
	 */
	private static int getNodes(RedBlackTree.Node n, RedBlackTree.Node[] nodes, int start)
	{
		if(n == null)
		{
			return 0;
		}
		int leftFilled = getNodes(n.left, nodes, start);
		nodes[start + leftFilled] = n;
		int rightFilled = getNodes(n.right, nodes, start + leftFilled + 1);
		return leftFilled + 1 + rightFilled;
	}
	
	/**
	 * Computes the cost form a node to a root
	 * @param n a node of a red-black tree
	 * @return the number of black ndoes between n and the root
	 */
	private static int costToRoot(RedBlackTree.Node n)
	{
		int c = 0; while(n != null)
		while(n != null)
		{
			c = c + n.color;
			n = n.parent;
		}
		return c;
	}
	
	/**
	 * Copies all nodes of a red-black tree.
	 * @param n the root of a red-black tree
	 * @return the root node of a copy of the tree
	 */
	private static RedBlackTree.Node copy(RedBlackTree.Node n)
	{
		if(n == null)
		{
			return null;
		}
		RedBlackTree.Node newNode = new RedBlackTree.Node();
		
		newNode.setLeftChild(copy(n.left));
		newNode.setRightChild(copy(n.right));
		newNode.data = n.data;
		newNode.color = n.color;
		return newNode;
	}
	
	/**
	 * Generates the mirror image of a red-black tree
	 * @param n the root of the tree to reflect
	 * @return the root of the mirror image of the tree
	 */
	private static RedBlackTree.Node mirror(RedBlackTree.Node n)
	{
		if(n == null)
		{
			return null;
		}
		RedBlackTree.Node newNode = new RedBlackTree.Node();
		newNode.setLeftChild((mirror(n.right)));
		newNode.setRightChild(mirror(n.left));
		newNode.data = n.data;
		newNode.color = n.color;
		return newNode;
	}
	
	/**
	 * Makes a full tree of black nodes of a given depth.
	 * @param depth the desired depth
	 * @return the root node of a full black tree
	 */
	private static RedBlackTree.Node fullTree(int depth)
	{
		if(depth <= 0)
		{
			return null;
		}
		RedBlackTree.Node r = new RedBlackTree.Node();
		r.color = RedBlackTree.BLACK;
		r.setLeftChild(fullTree(depth - 1));
		r.setRightChild(fullTree(depth - 1));
		return r;
	}
	
	 /**
	  * Counts the nodes in a tree
	  * @param n the root of a red-black tree
	  * @return the number of nodes in the tree
	  */
	private static int count(RedBlackTree.Node n)
	{
		if(n == null)
		{
			return 0;
		}
		else
		{
			return 1 + count(n.left) + count(n.right);
		}
	}
	
	/**
	 * Populates this tree with the values 0, 1, 2, ...
	 * @param t a red-black tree
	 * @return the number of nodes in t
	 */
	private static int populate(RedBlackTree t)
	{
		RedBlackTree.Node[] nodes = getNodes(t);
		for(int i = 0; i < nodes.length; i++)
		{
			nodes[i].data = new Integer(i);
		}
		return nodes.length;
	}
	
	/**
	 * Checks whether a red-black tree is valid and throws an exception if not
	 * @param t the tree to test
	 */
	private static void checkRedBlack(RedBlackTree t)
	{
		checkRedBlack(t.root, true);
		
		// Check that its a BST
		RedBlackTree.Node[] nodes = getNodes(t);
		for(int i = 0; i < nodes.length - 1; i++)
		{
			if(nodes[i].data.compareTo(nodes[i + 1].data) > 0)
			{
				throw new IllegalStateException(nodes[i].data + " is larger than " + nodes[i + 1].data);
			}
		}
	}
	
	/**
	 * Checks that the tree with the given node is a red-black tree, and
	 * throws an exception if a structural error is found
	 * @param n the root of the subtree to check
	 * @param isRoot true if this is the root of the tree
	 * @return the black depth of this subtree
	 */
	private static int checkRedBlack(RedBlackTree.Node n, boolean isRoot)
	{
		if(n == null)
		{
			return 0;
		}
		int nleft = checkRedBlack(n.left, false);
		int nright = checkRedBlack(n.right, false);
		if(nleft != nright)
		{
			throw new IllegalStateException("Left and right children of " + n.data + " have different balck depths");
		}
		if(n.parent == null)
		{
			if(!isRoot)
			{
				throw new IllegalStateException(n.data + " is not root and has no parent");
			}
			if(n.color != RedBlackTree.BLACK)
			{
				throw new IllegalStateException("Root " + n.data + " is not black");
			}
		}
		else
		{
			if(isRoot)
			{
				throw new IllegalStateException(n.data + " is root and has a parent");
			}
			if(n.color == RedBlackTree.RED && n.parent.color == RedBlackTree.RED)
			{
				throw new IllegalStateException("Parent of Red " + n.data + " is red");
			}
		}
		
		if(n.left != null && n.left.parent != n)
		{
			throw new IllegalStateException("Left child of " + n.data + " has bad parent link");
		}
		
		if(n.right != null && n.right.parent != n)
		{
			throw new IllegalStateException("Right child of " + n.data + " has bad parent link");
		}
		if(n.color != RedBlackTree.RED && n.color != RedBlackTree.BLACK)
		{
			throw new IllegalStateException(n.data + " has color " + n.color);
		}
		
		return n.color + nleft;
	}
	
	/**
	 * Asserts that the two objects passed are equal to each other.
	 * Throws an AssertionError if expected and actual are not equal
	 * @param expected the expected result
	 * @param actual the actual result
	 */
	public static void assertEquals(Object expected, Object actual)
	{
		if((expected == null && actual != null) || !expected.equals(actual))
		{
			throw new AssertionError("Expected " + expected + " but found " + actual);
		}
	}
}

class PermutationGenerator
{
	private String word;
	
	/**
	 * Constructs a permutation generator
	 * @param word the word to permute
	 */
	public PermutationGenerator(String word)
	{
		this.word = word;
	}
	
	/**
	 * Gets all permutations of a given word
	 * @return the permutations
	 */
	public ArrayList<String> getPermutations()
	{
		ArrayList<String> permutations = new ArrayList<>();
		
		// The empty string has a single permutation: itself
		if(word.length() == 0)
		{
			permutations.add(word);
			return permutations;
		}
		
		// Loop through all character positions
		for(int i = 0; i < word.length(); i++)
		{
			// Form a simpler word by removing the ith character
			String shorterWord = word.substring(0, i) + word.substring(i + 1);
			
			// Generate all permutations of the simpler word
			PermutationGenerator shorterPermutationGenerator = new PermutationGenerator(shorterWord);
			ArrayList<String> shorterWordPermutations = shorterPermutationGenerator.getPermutations();
			
			// Add the removed character to the front of each permutation of the simpler word
			for(String s : shorterWordPermutations)
			{
				permutations.add(word.charAt(i) + s);
			}
		}
		// Return all permutations
		return permutations;
	}
}

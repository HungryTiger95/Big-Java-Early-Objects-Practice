package section_07;

/**
 * The sort method of this class sorts an array, using the heap sort algorithm
 * 
 * @author Mayuresh
 *
 */
public class HeapSorter
{
	/**
	 * Sorts an array, using selection sort
	 * @param a the array to sort
	 */
	public static void sort(int[] a)
	{
		int n = a.length - 1;
		for(int i = (n - 1) / 2; i >= 0; i--)
		{
			fixHeap(a, i, n);
		}
		
		while(n > 0)
		{
			ArrayUtil.swap(a, 0, n);
			n--;
			fixHeap(a, 0, n);
		}
	}
	
	/**
	 * Ensures the heap property for a subtree, provided its
	 * children already fulfill the heap property.
	 * @param a the array to sort
	 * @param rootIndex the index of the subtree to be fixed
	 * @param lastIndex the last valid index of the tree that contains the subtree to be fixed
	 */
	private static void fixHeap(int[] a, int rootIndex, int lastIndex)
	{
		// Remove root
		int rootValue = a[rootIndex];
		
		// Promote children  while they are larger than the root
		int index = rootIndex;
		boolean more = true;
		
		while(more)
		{
			int childIndex = getLeftChildIndex(index);
			if(childIndex <= lastIndex)
			{
				// Use right child instead if it is larger
				int rightChildIndex = getRightChildIndex(index);
				if(rightChildIndex <= lastIndex && a[rightChildIndex] > a[childIndex])
				{
					childIndex = rightChildIndex;
				}
				
				if(a[childIndex] > rootValue)
				{
					// Promote child
					a[index] = a[childIndex];
					index = childIndex;
				}
				else
				{
					// Root value is larger than both children
					more = false;
				}
			}
			else
			{
				// No children
				more = false;
			}
		}
		
		// Store root value in vacant slot
		a[index] = rootValue;
	}
	
	/**
	 * Returns the index of the left child
	 * @param index the index of a node in this heap
	 * @return the index of the left child of the given node
	 */
	private static int getLeftChildIndex(int index)
	{
		return 2 * index + 1;
	}
	
	/**
	 * Returns the index of the right child
	 * @param index the index of a node in this heap
	 * @return the index of th eright child of the given node
	 */
	private static int getRightChildIndex(int index)
	{
		return 2 * index + 2;
	}
}

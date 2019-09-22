package exercise_12;

import java.util.ArrayList;

/**
 * Modify the implementation of the MinHeap class so that the parent and child index positions and
 * elements are computed directly, without calling helper methods.
 * 
 * @author Mayuresh
 *
 */
public class MinHeap
{
	// Instance Variables
	private ArrayList<Comparable> elements;
	
	// Constructors
	/**
	 * Constructs an empty heap
	 */
	public MinHeap()
	{
		this.elements = new ArrayList<>();
		this.elements.add(null);
	}
	
	// Methods
	/**
	 * Adds a new element to this heap
	 * @param newElement the element to add
	 */
	public void add(Comparable newElement)
	{
		// Add a new leaf
		this.elements.add(null);
		int index = this.elements.size() - 1;
		
		// Demote parents that are larger than the new element
		while(index > 1 && this.elements.get(index / 2).compareTo(newElement) > 0)
		{
			this.elements.set(index, this.elements.get(index / 2));
			index = (index / 2);
		}
		
		// Store the new element into the vacant slot
		this.elements.set(index, newElement);
	}
	
	/**
	 * Gets the minimum element stored in this heap
	 * @return the minimum element
	 */
	public Comparable peek()
	{
		return this.elements.get(1);
	}
	
	/**
	 * Removes the minimum element from this heap
	 * @return the minimum element
	 */
	public Comparable remove()
	{
		Comparable minimum = this.elements.get(1);
		
		// Remove last element
		int lastIndex = this.elements.size() - 1;
		Comparable last = this.elements.remove(lastIndex);
		
		if(lastIndex > 1)
		{
			this.elements.set(1, last);
			fixHeap();
		}
		
		return minimum;
	}
	
	/**
	 * Turns three back into a heap, provided only the root node
	 * violates the heap condition
	 */
	private void fixHeap()
	{
		Comparable root = this.elements.get(1);
		int lastIndex = this.elements.size() - 1;
		
		// Promote  childrend of removed root while they are smaller than last
		int index = 1;
		boolean more = true;
		
		while(more)
		{
			int childIndex = (2 * index);
			if(childIndex <= lastIndex)
			{
				// Get smaller child
				
				// Get left child first
				Comparable child = this.elements.get(2 * index);
				
				// Use right child instead if it is smaller
				if((2 * index + 1) <= lastIndex && this.elements.get(2 * index + 1).compareTo(child) < 0)
				{
					childIndex = (2 * index + 1);
					child = this.elements.get(2 * index + 1);
				}
				
				// Check if larger child is smaller than root
				if(child.compareTo(root) < 0)
				{
					// Promote child
					this.elements.set(index, child);
					index = childIndex;
				}
				else
				{
					// Root is smaller than both children
					more = false;
				}
			}
			else
			{
				// No Children
				more = false;
			}
		}
		
		// Store root element in vacant slot
		this.elements.set(index, root);
	}
	
	/**
	 * Checks whether this heap is empty
	 * @return true if this heap is empty, false otherwise
	 */
	public boolean empty()
	{
		return this.elements.size() == 1;
	}
	
	/**
	 * Returns a string representation of this heap
	 */
	public String toString()
	{
		return this.elements.toString();
	}
}
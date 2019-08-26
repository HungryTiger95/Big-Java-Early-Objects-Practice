package exercise_12;

import java.util.ArrayList;

public class MinHeap<E extends Comparable<E>>
{
	// Instance Variables
	private ArrayList<E> elements;
	
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
	public void add(E newElement)
	{
		// Add a new leaf
		this.elements.add(null);
		int index = this.elements.size() - 1;
		
		// Demote parents that are larger than the new element
		while(index > 1 && getParent(index).compareTo(newElement) > 0)
		{
			this.elements.set(index, getParent(index));
			index = getParentIndex(index);
		}
		
		// Store the new element into the vacant slot
		this.elements.set(index, newElement);
	}
	
	/**
	 * Gets the minimum element stored in this heap
	 * @return the minimum element
	 */
	public E peek()
	{
		return this.elements.get(1);
	}
	
	/**
	 * Removes the minimum element from this heap
	 * @return the minimum element
	 */
	public E remove()
	{
		E minimum = this.elements.get(1);
		
		// Remove last element
		int lastIndex = this.elements.size() - 1;
		E last = this.elements.remove(lastIndex);
		
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
		E root = this.elements.get(1);
		int lastIndex = this.elements.size() - 1;
		
		// Promote  children of removed root while they are smaller than last
		int index = 1;
		boolean more = true;
		
		while(more)
		{
			int childIndex = getLeftChildIndex(index);
			if(childIndex <= lastIndex)
			{
				// Get smaller child
				
				// Get left child first
				E child = getLeftChild(index);
				
				// Use right child instead if it is smaller
				if(getRightChildIndex(index) <= lastIndex && getRightChild(index).compareTo(child) < 0)
				{
					childIndex = getRightChildIndex(index);
					child = getRightChild(index);
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
	
	/**
	 * Returns the index of the left child
	 * @param index the index of a node in this heap
	 * @return the index of the left child of the given node
	 */
	private static int getLeftChildIndex(int index)
	{
		return 2 * index;
	}
	
	/**
	 * Returns the index of the right child
	 * @param index the index of a node in this heap
	 * @return the index of the right child of this given node
	 */
	private static int getRightChildIndex(int index)
	{
		return 2 * index + 1;
	}
	
	/**
	 * Returns the index of the parent
	 * @param index the index of a node in this heap
	 * @return the index of the parent of the given node
	 */
	private static int getParentIndex(int index)
	{
		return index / 2;
	}
	
	/**
	 * Returns the value of e the left child
	 * @param index the index of a node in this heap
	 * @return the value of the left child of the given node
	 */
	private E getLeftChild(int index)
	{
		return this.elements.get(2 * index);
	}
	
	/**
	 * Returns the value of the right child
	 * @param index the index of a node in this heap
	 * @return the vlaue of the right child of the given node
	 */
	private E getRightChild(int index)
	{
		return this.elements.get(2 * index + 1);
	}
	
	/**
	 * Returns the value of the parent
	 * @param index the idnex of a node in this heap
	 * @return the value of the parent of the given node
	 */
	private E getParent(int index)
	{
		return this.elements.get(index / 2);
	}
}

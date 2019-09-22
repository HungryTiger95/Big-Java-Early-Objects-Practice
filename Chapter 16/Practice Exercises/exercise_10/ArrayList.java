package exercise_10;

import java.util.NoSuchElementException;

/**
 * Provide a removeLast method for the ArrayList implementation in section 16.2 that shrinks the internal
 * array by 50 percent when it is less than 25 percent full.
 * 
 * @author Mayuresh
 *
 */
public class ArrayList
{
	// Instance Variables
	private Object[] elements;
	private int currentSize;
	
	// Constructors
	/**
	 * Constructs an empty array list
	 */
	public ArrayList()
	{
		final int INITIAL_SIZE = 10;
		this.elements = new Object[INITIAL_SIZE];
		this.currentSize = 0;
	}
	
	// Methods
	/**
	 * For Testing Purposes; Just to see what the size of the
	 * elements array is.
	 * @return the size of the elements array
	 */
	public int getInternalArraySize()
	{
		return this.elements.length;
	}
	
	/**
	 * Gets the internal array
	 * @return the internal array
	 */
	public Object[] getInternalArray()
	{
		return this.elements;
	}
	
	/**
	 * Prints the internal array: Meant for debugging
	 * @return string representation of the internal array
	 */
	public String printInternalArray()
	{
		String s = "";
		for(int i = 0; i < getInternalArraySize(); i++)
		{
			s = s + "[" + getInternalArray()[i] + "]";
		}
		return s;
	}
	/**
	 * Gets the size of the array list
	 * @return the size
	 */
	public int size()
	{
		return this.currentSize;
	}
	
	/**
	 * Checks if the the given index is out of bounds for the array, if it is, then it will
	 * throw an IndexOutOfBoundsException
	 * @param n the index to check
	 */
	private void checkBounds(int n)
	{
		if(n < 0 || n > this.currentSize)
		{
			throw new IndexOutOfBoundsException();
		}
	}
	
	/**
	 * Gets the element at a given position
	 * @param pos the position
	 * @return the element at the given position
	 */
	public Object get(int pos)
	{
		checkBounds(pos);
		return elements[pos];
	}
	
	/**
	 * Sets the element at a given position
	 * @param pos the position
	 * @param element the new value
	 */
	public void set(int pos, Object element)
	{
		checkBounds(pos);
		this.elements[pos] = element;
	}
	
	/**
	 * Removes the element at a given position
	 * @param pos the position
	 * @return the removed element
	 */
	public Object remove(int pos)
	{
		checkBounds(pos);
		
		Object removed = elements[pos];
		for(int i = pos + 1; i < this.currentSize; i++)
		{
			this.elements[i - 1] = this.elements[i];
		}
		
		this.currentSize--;
		return removed;
	}
	
	/**
	 * Adds an element after a given position
	 * @param pos the position
	 * @param newElement the element to add
	 * @return true if the element was added
	 */
	public boolean add(int pos, Object newElement)
	{
		growIfNecessary();
		this.currentSize++;
		
		checkBounds(pos);
		
		for(int i = this.currentSize - 1; i > pos; i--)
		{
			this.elements[i] = this.elements[i - 1];
		}
		
		this.elements[pos] = newElement;
		return true;
	}
	
	/**
	 * Adds an element after the end of the array list
	 * @param newElement the element to add
	 * @return true if the element was added
	 */
	public boolean addLast(Object newElement)
	{
		growIfNecessary();
		this.currentSize++;
		
		this.elements[this.currentSize - 1] = newElement;
		return true;
	}
	
	/**
	 * Grows the elements array if the current size equals the capacity
	 */
	private void growIfNecessary()
	{
		if(this.currentSize == this.elements.length)
		{
			Object[] newElements = new Object[2 * this.elements.length];
			for(int i = 0; i < this.elements.length; i++)
			{
				newElements[i] = this.elements[i];
			}
			
			this.elements = newElements;
		}
	}
	
	/**
	 * Removes the last element in the list; will also shrink the internal array
	 * if the filled to internal array length ratio drops below %25
	 * @return the last element
	 */
	public Object removeLast()
	{
		if(this.currentSize == 0)
		{
			throw new NoSuchElementException();
		}
		
		// Get a reference to the last element
		Object last = this.elements[this.currentSize - 1];
		
		// Set the last index to null
		this.elements[this.currentSize - 1] = null;
		
		// Update the current size variable
		this.currentSize--;
		
		
		// Shrink the array if the current size is less than 25% full
		if((double) this.currentSize / (double) getInternalArraySize() < 0.25)
		{
			Object[] newElements = new Object[this.elements.length / 2];
			for(int i = 0; i < this.currentSize; i++)
			{
				newElements[i] = this.elements[i];
			}
			
			this.elements = newElements;
		}
		return last;
	}
	
	/**
	 * Returns the string representation of this class and its contents
	 */
	public String toString()
	{
		String s = "";
		
		for(int i = 0; i < this.currentSize; i++)
		{
			s = s + "[" + this.elements[i] + "]";
		}
		
		return this.getClass().getName() + ": " + s;
	}
}

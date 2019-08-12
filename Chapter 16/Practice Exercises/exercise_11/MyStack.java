package exercise_11;

import java.util.NoSuchElementException;

public class MyStack
{
	// Instance Variables
	private Object[] elements;
	private int currentSize;
	private final int INITIAL_SIZE = 10;
	
	// Constructors
	/**
	 * Constructs a stack object
	 */
	public MyStack()
	{
		this.elements = new Object[INITIAL_SIZE];
		this.currentSize = 0;
	}
	
	// Methods
	/**
	 * Gets the reference to the internal array: meant for debugging
	 * @return the internal array
	 */
	public Object[] getInternalArray()
	{
		return this.elements;
	}
	
	/**
	 * Gets the current size of the stack (the number of filled
	 * in slots in the internal array, not the size of the
	 * internal array)
	 * @return the number of elements in the stack
	 */
	public int getCurrentSize()
	{
		return this.currentSize;
	}
	
	/**
	 * Pushes an element onto the stack
	 * @param element the element to add
	 */
	public void push(Object element)
	{
		this.currentSize++;
		growIfNecessary();
		
		this.elements[this.currentSize - 1] = element;
	}
	
	/**
	 * Pops off an element from the top of the stack
	 * @return the element that was popped off
	 */
	public Object pop()
	{
		if(this.currentSize == 0)
		{
			throw new NoSuchElementException();
		}
		
		Object obj = this.elements[this.currentSize - 1];
		this.elements[this.currentSize - 1] = null;
		
		this.currentSize--;
		shrinkIfNecessary();
		return obj;
	}
	
	/**
	 * Doubles the size of the array if the size limit is reached
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
	 * Shrinks the array if the amount of filled slots is less than 25% of the total number of available slots
	 */
	private void shrinkIfNecessary()
	{
		if((double) this.currentSize / (double) this.elements.length < 0.25)
		{
			Object[] newElements = new Object[this.elements.length / 2];
			for(int i = 0; i < this.currentSize; i++)
			{
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}
	
	/**
	 * Checks whether or not the stack is empty
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		if(this.currentSize == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

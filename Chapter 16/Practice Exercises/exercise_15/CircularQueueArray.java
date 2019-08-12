package exercise_15;

import java.util.NoSuchElementException;

public class CircularQueueArray
{
	// Instance Variables
	private Object[] elements;
	private int currentSize;
	private int head;
	private int tail;
	
	// Constructors
	/**
	 * Constructs an empty queue
	 */
	public CircularQueueArray()
	{
		final int INITIAL_SIZE = 10;
		elements = new Object[INITIAL_SIZE];
		
		currentSize = 0;
		head = 0;
		tail = 0;
	}
	
	// Methods
	/**
	 * Gets the current size of the queue
	 * @return the current size
	 */
	public int getCurrentSize()
	{
		return this.currentSize;
	}
	/**
	 * Checks to see if the queue is empty
	 * @return true if the queue is empty
	 */
	public boolean isEmpty()
	{
		return currentSize == 0;
	}
	
	/**
	 * Checks to see if the queue is full
	 * @return true if the queue is full
	 */
	public boolean isFull()
	{
		return currentSize == this.elements.length;
	}
	
	/**
	 * Adds an element to the tail of this queue
	 * @param newElement the new element to add
	 */
	public void add(Object newElement)
	{
		growIfNecessary();
		currentSize++;
		
		elements[tail] = newElement;
		tail = (tail + 1) % elements.length;
	}
	
	/**
	 * Removes an element from the head of this queue
	 * @return the element that was removed
	 */
	public Object remove()
	{
		if(currentSize == 0)
		{
			throw new NoSuchElementException();
		}
		Object removed = elements[head];
		
		head = (head + 1) % elements.length;
		currentSize--;
		return removed;
	}
	
	/**
	 * Grows the element array if the current size is equal to the capacity
	 */
	public void growIfNecessary()
	{
		if(currentSize == elements.length)
		{
			Object[] newElements = new Object[2 * elements.length];
		
			for(int i = 0; i < elements.length; i++)
			{
				newElements[i] = elements[(head + i) % elements.length];
			}
		
			elements = newElements;
			head = 0;
			tail = currentSize;
		}
	}
	
	public void firstToLast()
	{
		if(this.currentSize == 0 || this.currentSize == 1)
		{
			throw new NoSuchElementException();
		}

		// Store a temporary reference to the the head element
		Object temp = this.elements[head];

		// Update the head position
		this.head = (this.head + 1) % this.elements.length;

		// Update the tail with the the temporary element
		this.elements[tail] = temp;

		// Update the position of the tail
		this.tail = (this.tail + 1) % this.elements.length;
	}
	
	public String printInternalArray()
	{
		String s = "";
		for(int i = 0; i < this.elements.length; i++)
		{
			s += "[" + this.elements[i] + "]";
		}
		
		return s;
	}
}

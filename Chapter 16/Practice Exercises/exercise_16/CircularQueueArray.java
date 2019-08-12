package exercise_16;

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
	public int getHeadPos()
	{
		return this.head;
	}
	
	public int getTailPos()
	{
		return this.tail;
	}
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
	
	public void lastToFirst()
	{
		// If the there are no elements or just 1 element, you can't perform this operation
		if(this.currentSize == 0 || this.currentSize == 1)
		{
			throw new NoSuchElementException();
		}
		
		// If the array is filled, you need another way to perform this action
		// There are two choices; grow the array, or play around with the head and tail
		if(this.currentSize == this.elements.length)
		{
			// Cases if the head and tail are both first
			if(this.head == 0 && this.tail == 0)
			{
				this.head = this.elements.length - 1;
				this.tail = this.elements.length - 2;
			}
			else
			{
				this.head = (this.head - 1) % this.elements.length;
				this.tail = (this.tail - 1) % this.elements.length;
			}
		}
		// If the array has at least two elements and is not full, this implementation works
		// with any case
		else
		{
			// Store the last element in a temporary reference
			Object temp = this.elements[this.tail - 1];

			// Decrement the the tail position
			this.tail = (this.tail - 1) % this.elements.length;

			// To take care of the tail position when the array is full
			if(this.tail == 0)
			{
				this.tail = this.elements.length;
			}

			// Move the head position to the end
			// This points the head to the end so that the first element is the last element
			if(this.head == 0)
			{
				this.head = this.elements.length;
			}

			this.head = (this.head - 1) % this.elements.length;
			this.elements[head] = temp;
		}
	}
	
	/**
	 * Prints the internal array
	 * @return a string representation of the internal array
	 */
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

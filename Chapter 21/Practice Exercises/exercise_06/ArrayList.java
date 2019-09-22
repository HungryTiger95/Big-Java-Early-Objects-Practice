package exercise_06;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * This is a simplified implementation of an array list.
 * 
 * @author Mayuresh
 *
 */
public class ArrayList<E>
{
	// Instance Variables
	private E[] elements;
	private int currentSize;
	
	private Lock listLock;
	private Condition sizeCondition;
	
	// Constructors
	/**
	 * Constructs an empty array list
	 */
	@SuppressWarnings("unchecked")
	public ArrayList()
	{
		final int INITIAL_SIZE = 10;
		this.elements = (E[]) new Object[INITIAL_SIZE];
		this.currentSize = 0;
		
		this.listLock = new ReentrantLock();
		this.sizeCondition = listLock.newCondition();
	}
	
	/**
	 * Constructs an empty array list given the initial capacity
	 * @param initialCapacity the initial capacity
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int initialCapacity)
	{
		final int INITIAL_SIZE = initialCapacity;
		this.elements = (E[]) new Object[INITIAL_SIZE];
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
	 * Gets the size of the array list
	 * @return the size
	 */
	public int size()
	{
		this.listLock.lock();
		
		try
		{
			return this.currentSize;
		}
		finally
		{
			this.listLock.unlock();
		}
		
	}
	
	/**
	 * Checks if the the given index is out of bounds for the array, if it is, then it will
	 * throw an IndexOutOfBoundsException
	 * @param n the index to check
	 */
	private void checkBounds(int n)
	{
		if(n < 0 || n > this.currentSize - 1)
		{
			throw new IndexOutOfBoundsException();
		}
	}
	
	/**
	 * Gets the element at a given position
	 * @param pos the position
	 * @return the element at the given position
	 */
	public E get(int pos)
	{
		this.listLock.lock();
		
		try
		{
			try
			{
				checkBounds(pos);
				return elements[pos];
			}
			catch(IndexOutOfBoundsException e)
			{
				@SuppressWarnings("unchecked")
				E newElement = (E) new Object();
				return newElement;
			}
		}
		finally
		{
			this.listLock.unlock();
		}
	}
	
	/**
	 * Sets the element at a given position
	 * @param pos the position
	 * @param element the new value
	 */
	public void set(int pos, E element)
	{
		this.listLock.lock();
		
		try
		{
			try
			{
				checkBounds(pos);
				this.elements[pos] = element;
			}
			catch(IndexOutOfBoundsException e) {}
		}
		finally
		{
			this.listLock.unlock();
		}
		
	}
	
	/**
	 * Removes the element at a given position
	 * @param pos the position
	 * @return the removed element
	 * @throws InterruptedException 
	 */
	public E remove(int pos) throws InterruptedException
	{
		this.listLock.lock();
		
		try
		{
			while(this.currentSize == 0)
			{
				this.sizeCondition.await();
			}
			
			checkBounds(pos);
			E removed = elements[pos];
			for(int i = pos + 1; i < this.currentSize; i++)
			{
				this.elements[i - 1] = this.elements[i];
			}
			this.currentSize--;
			return removed;
		}
		finally
		{
			this.listLock.unlock();
		}
	}
	
	/**
	 * Adds an element at a given position
	 * @param pos the position
	 * @param newElement the element to add
	 * @return true if the element was added
	 */
	public boolean add(int pos, E newElement)
	{
		this.listLock.lock();
		
		try
		{
			growIfNecessary();
			this.currentSize++;
			checkBounds(pos);
			for(int i = this.currentSize - 1; i > pos; i--)
			{
				this.elements[i] = this.elements[i - 1];
			}
			this.elements[pos] = newElement;
			this.sizeCondition.signalAll();
			
			return true;
		}
		finally
		{
			this.listLock.unlock();
		}
	}
	
	/**
	 * Adds an element after the end of the array list
	 * @param newElement the element to add
	 * @return true if the element was added
	 * @throws InterruptedException 
	 */
	public boolean addLast(E newElement)
	{
		this.listLock.lock();
		
		try
		{
			growIfNecessary();
			this.currentSize++;
			this.elements[this.currentSize - 1] = newElement;
			this.sizeCondition.signalAll();
			
			return true;
		}
		finally
		{
			this.listLock.unlock();
		}
	}
	
	/**
	 * Grows the elements array if the current size equals the capacity
	 */
	@SuppressWarnings("unchecked")
	private void growIfNecessary()
	{
		if(this.currentSize == this.elements.length)
		{
			E[] newElements = (E[]) new Object[2 * this.elements.length];
			for(int i = 0; i < this.elements.length; i++)
			{
				newElements[i] = this.elements[i];
			}
			
			this.elements = newElements;
		}
	}
	
	/**
	 * Returns the string representation of this class and its contents
	 */
	public String toString()
	{
		this.listLock.lock();
		
		try
		{
			String s = "";

			for(int i = 0; i < this.currentSize; i++)
			{
				s = s + "[" + this.elements[i] + "]";
			}

			return this.getClass().getName() + ": " + s;
		}
		finally
		{
			this.listLock.unlock();
		}
	}
}

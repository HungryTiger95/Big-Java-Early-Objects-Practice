package exercise_05;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Reimplement Exercise E21.4 by using the ArrayBlockingQueue class from the standard
 * library.
 * 
 * @author Mayuresh
 *
 * @param <E>
 */
public class Queue<E>
{
	// Instance Variables
	private BlockingQueue<E> q;
	
	// Constructors
	public Queue(int maxCapacity)
	{
		this.q = new ArrayBlockingQueue<>(maxCapacity);
	}
	
	// Methods
	/**
	 * Gets the number of elements in the queue
	 * @return the number of elements in the queue
	 */
	public int getCurrentSize()
	{
		return q.size();
	}
	
	/**
	 * Adds an element to the queue
	 * @param element the element to add
	 * @throws InterruptedException
	 */
	public void add(E element) throws InterruptedException
	{
		q.put(element);
	}
	
	/**
	 * Removes the head of the queue
	 * @return the element that was removed
	 * @throws InterruptedException
	 */
	public E remove() throws InterruptedException
	{
		return q.take();
	}
	
	/**
	 * Returns whether or not the queue is empty
	 * @return true if the queue is empty
	 */
	public boolean isEmpty()
	{
		return (q.size() == 0);
	}
}

package exercise_04;

import java.time.LocalTime;
import java.util.NoSuchElementException;

/**
 * Enhance the program of Exercise E21.3 by supplying a variable number of producer
 * and consumer threads. Prompt the program user for the numbers.
 * 
 * @author Mayuresh
 *
 * @param <E>
 */
public class Queue<E>
{
	// Instance Variables
	private Node<E> first;
	private Node<E> last;
	private int currentSize;
	private final int MAX_SIZE = 5;
	
	// Constructors
	/**
	 * Constructs an empty queue
	 */
	public Queue()
	{
		this.first = null;
		this.last = null;
		this.currentSize = 0;
	}
	
	// Methods
	/**
	 * Gets the size of the queue
	 * @return the size
	 */
	public int getCurrentSize()
	{
		return this.currentSize;
	}
	
	/**
	 * Gets the first element in the queue
	 * @return the first element
	 */
	public E getFirst()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		return this.first.data;
	}
	
	/**
	 * Gets the last element in the queue
	 * @return the last element
	 */
	public E getLast()
	{
		if(this.last == null)
		{
			throw new NoSuchElementException();
		}
		return this.last.data;
	}
	
	/**
	 * Inserts the element into the queue. This is a thread-safe method
	 * @param element the element to insert
	 * @throws InterruptedException 
	 */
	public synchronized void add(E element) throws InterruptedException
	{
		while(this.currentSize >= MAX_SIZE)
		{
			wait();
		}

		// If the element you're adding is the first one in the queue
		if(this.currentSize < 1)
		{
			Node<E> newNode = new Node<>();
			newNode.data = element;
			newNode.next = null;

			this.first = newNode;
			this.last = newNode;
		}
		else
		{
			Node<E> newNode = new Node<>();
			newNode.data = element;
			newNode.next = null;

			this.last.next = newNode;
			this.last = newNode;
		}
		this.currentSize++;
		System.out.println("[" + this.currentSize + "]:"  + LocalTime.now().toString());
		notifyAll();
	}
	
	/**
	 * Removes an element from the queue. This is a thread safe-method.
	 * @return the element that was removed
	 * @throws InterruptedException 
	 */
	public synchronized E remove() throws InterruptedException
	{
		while(this.currentSize <= 0)
		{
			wait();
		}

		E firstInQueue = this.first.data;
		this.first = this.first.next;
		this.currentSize--;
		System.out.println("[" + this.currentSize + "]:" + LocalTime.now().toString());

		notifyAll();
		return firstInQueue;
	}
	
	/**
	 * Checks whether this queue is empty or no
	 * @return true if the queue is empty, false if the queue is false
	 */
	public boolean isEmpty()
	{
		return (this.first == null) && (this.last == null);
	}
	
	/**
	 * Returns the string representation of this queue
	 */
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		Node<E> currentNode = this.first;
		while(currentNode != null)
		{
			s.append(currentNode.data.toString() + ", ");
			currentNode = currentNode.next;
		}
		return s.substring(0, s.length() - 2) + "]";
	}
	
	// Inner Classes
	class Node<T>
	{
		// Instance Variables
		public T data;
		public Node<T> next;
		
		// Constructors
		
		// Methods
	}
}

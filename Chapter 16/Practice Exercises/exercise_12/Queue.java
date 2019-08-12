package exercise_12;

import java.util.NoSuchElementException;

public class Queue
{
	// Instance Variables
	private Node first;
	private Node last;
	private int currentSize;
	
	// Constructors
	public Queue()
	{
		this.first = null;
		this.last = null;
		this.currentSize = 0;
	}
	
	// Methods
	public int getCurrentSize()
	{
		return this.currentSize;
	}
	
	public Object getFirst()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		return this.first.data;
	}
	
	public Object getLast()
	{
		if(this.last == null)
		{
			throw new NoSuchElementException();
		}
		return this.last.data;
	}
	
	public void add(Object element)
	{
		// If the element you're adding is the first one in the queue
		if(this.first == null && this.last == null)
		{
			Node newNode = new Node();
			newNode.data = element;
			newNode.next = null;
			
			this.first = newNode;
			this.last = newNode;
		}
		else
		{
			Node newNode = new Node();
			newNode.data = element;
			newNode.next = null;
			
			this.last.next = newNode;
			this.last = newNode;
		}
		
		this.currentSize++;
	}
	
	public Object remove()
	{
		if(this.first == null && this.last == null)
		{
			throw new NoSuchElementException();
		}
		
		Object firstInQueue = this.first.data;
		this.first = this.first.next;
		
		this.currentSize--;
		return firstInQueue;
	}
	
	public boolean isEmpty()
	{
		return (this.first == null) && (this.last == null);
	}
	
	// Inner Classes
	class Node
	{
		// Instance Variables
		public Object data;
		public Node next;
		
		// Constructors
		
		// Methods
	}
}

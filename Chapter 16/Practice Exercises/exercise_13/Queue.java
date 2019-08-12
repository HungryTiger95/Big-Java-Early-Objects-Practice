package exercise_13;

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
	
	public Node getFirstNodeRef()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		return this.first;
	}
	
	public Node getLastNodeRef()
	{
		if(this.last == null)
		{
			throw new NoSuchElementException();
		}
		return this.last;
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
	
	public void firstToLast()
	{
		if(this.first == null && this.last == null)
		{
			throw new NoSuchElementException();
		}
		
		Node newNode = new Node();
		newNode.data = this.first.data;
		newNode.next = null;
		
		this.last.next = newNode;
		this.last = newNode;
		this.first = first.next;
	}
	
	public String toString()
	{
		String s = "";
		
		Node current = this.first;
		while(current != null)
		{
			s = s + "[" + current.data + "]";
			current = current.next;
		}
		return s;
	}
	
	public MyQueueIterator queueIterator()
	{
		return new MyQueueListIterator();
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
	
	class MyQueueListIterator implements MyQueueIterator
	{
		// Instance Variables
		private Node position;
		private Node previous;
		private boolean isAfterNext;
		
		// Constructors
		public MyQueueListIterator()
		{
			this.position = null;
			this.previous = null;
			this.isAfterNext = false;
		}
		
		// Methods
		public boolean hasNext()
		{
			if(this.position == null)
			{
				return first != null;
			}
			else
			{
				return this.position.next != null;
			}
		}
		
		public Object next()
		{
			if(!hasNext())
			{
				throw new NoSuchElementException();
			}
			
			this.previous = this.position;
			this.isAfterNext = true;
			
			if(this.position == null)
			{
				this.position = first;
			}
			else
			{
				this.position = this.position.next;
			}
			
			return this.position.data;
		}
		
		public void add(Object element)
		{
			if(this.position == null)
			{
				// Add to the front of the queue
				Node newNode = new Node();
				newNode.data = element;
				newNode.next = first;
				first = newNode;
				
				this.position = first;
			}
			else
			{
				Node newNode = new Node();
				
				newNode.data = element;
				newNode.next = this.position.next;
				this.position.next = newNode;
				this.position = newNode;
			}
			
			currentSize++;
			this.isAfterNext = false;
		}
		
		public void remove()
		{
			if(!this.isAfterNext)
			{
				throw new IllegalStateException();
			}
			
			if(this.position == first)
			{
				if(first == null)
				{
					throw new NoSuchElementException();
				}
				
				first = first.next;
			}
			else
			{
				this.previous.next = this.position.next;
			}
			
			this.position = this.previous;
			this.isAfterNext = false;
			currentSize--;
		}
		
		public void set(Object element)
		{
			if(!this.isAfterNext)
			{
				throw new IllegalStateException();
			}
			
			this.position.data = element;
		}
	}
}

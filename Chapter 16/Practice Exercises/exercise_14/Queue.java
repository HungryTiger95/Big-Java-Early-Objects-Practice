package exercise_14;

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
		
		if(this.first.next == null)
		{
			// do nothing
		}
		else
		{
			Node newNode = new Node();
			newNode.data = this.first.data;
			newNode.next = null;
			
			this.last.next = newNode;
			this.last = newNode;
			this.first = first.next;
		}
	}
	
	public void lastToFirst()
	{
		if(this.first == null && this.last == null)
		{
			throw new NoSuchElementException();
		}
		
		// Follow the links to the second-to-last link
		Node secondLastLink = this.first;
		System.out.print("Second Last: " + secondLastLink.data);
		
		Node lastLink = this.first.next;
		System.out.println(" === Last Link: " + lastLink.data);
		
		while(lastLink.next != null)
		{
			secondLastLink = secondLastLink.next;
			System.out.print("Second Last: " + secondLastLink.data);
			lastLink = lastLink.next;
			System.out.println(" === Last Link: " + lastLink.data);
		}
		lastLink.next = this.first;
		this.first = lastLink;
		
		this.last = secondLastLink;
		this.last.next = null;
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

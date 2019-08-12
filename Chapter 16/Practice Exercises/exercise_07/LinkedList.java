package exercise_07;

import java.util.NoSuchElementException;

public class LinkedList
{
	// Instance Variables
	private Node first;
	private int currentSize;
	
	// Constructors
	/**
	 * Constructs a singly-linked list
	 */
	public LinkedList()
	{
		this.first = null;
		this.currentSize = 0;
	}
	
	// Methods
	/**
	 * Returns the data from the first node in the list
	 * @return the data in the first node
	 */
	public Object getFirst()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		
		return this.first.getData();
	}
	
	/**
	 * Returns the first node
	 * @return the first node
	 */
	public Node getFirstNode()
	{
		return this.first;
	}
	
	/**
	 * Removes the first node
	 * @return the node that was removed
	 */
	public Object removeFirst()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		
		Object element = this.first.getData();
		this.first = this.first.getNextNode();
		
		this.currentSize--;
		
		return element;
	}
	
	/**
	 * Adds an element to the beginning of the linked list
	 * @param element the element to be added
	 */
	public void addFirst(Object element)
	{
		Node newNode = new Node();
		
		newNode.setData(element);
		newNode.setNextNode(this.first);
		this.first = newNode;
		
		this.currentSize++;
	}
	
	/**
	 * Returns the current size of the list
	 * @return the size
	 */
	public int getSize()
	{
		return this.currentSize;
	}
	
	/**
	 * Increments the size of the list
	 * @param n increment by the given amount
	 */
	public void incrementListSize(int n)
	{
		if(n < 0)
		{
			this.currentSize--;
		}
		else if(n > 0)
		{
			this.currentSize++;
		}
		else
		{
			// do nothing
		}
	}
	
	/**
	 * Returns the list iterator for this list
	 * @return the list iterator
	 */
	public ListIterator getListIterator()
	{
		return new LinkedListIterator(this);
	}
	
	/**
	 * Returns the string representation of this list
	 */
	public String toString()
	{
		String s = "";
		
		ListIterator iter = getListIterator();
		
		while(iter.hasNext())
		{
			Object obj = iter.next();
			s = s + "[" + obj + "]";
		}
		
		return this.getClass().getName() + ": " + s;
	}
}

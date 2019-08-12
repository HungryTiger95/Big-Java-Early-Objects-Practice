package exercise_07;

import java.util.NoSuchElementException;

public class LinkedListIterator implements ListIterator
{
	// Instance Variables
	private LinkedList list;
	private Node position;
	private Node previous;
	private boolean isAfterNext;
	
	// Constructors
	/**
	 * Constructs a linked list iterator object with a given list
	 * @param list the list to iterate over
	 */
	public LinkedListIterator(LinkedList list)
	{
		this.list = list;
		this.position = null;
		this.previous = null;
		this.isAfterNext = false;
	}
	
	// Methods
	/**
	 * Returns the next object in the linked list.
	 * Throws a NoSuchElementException if there aren't any more
	 * elements in the list
	 * @return the next object in the list
	 */
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
			this.position = list.getFirstNode();
		}
		else
		{
			this.position = this.position.getNextNode();
		}
		
		return this.position.getData();
	}
	
	/**
	 * Checks to see if there is another element in the list
	 * @return true if there is another element
	 */
	public boolean hasNext()
	{
		if(this.position == null)
		{
			return this.list.getFirstNode() != null;
		}
		else
		{
			return this.position.getNextNode() != null;
		}
	}
	
	/**
	 * Adds an element to the linked list
	 * @param element the element to add
	 */
	public void add(Object element)
	{
		if(this.position == null)
		{
			this.list.addFirst(element);
			this.position = this.list.getFirstNode();
		}
		else
		{
			Node newNode = new Node();
			newNode.setData(element);
			newNode.setNextNode(this.position.getNextNode());
			
			this.position.setNextNode(newNode);
			this.position = newNode;
		}
		
		this.isAfterNext = false;
		this.list.incrementListSize(1);
	}
	
	/**
	 * Removes the last element that was traversed over
	 */
	public void remove()
	{
		if(!this.isAfterNext)
		{
			throw new NoSuchElementException();
		}
		
		if(this.position == this.list.getFirstNode())
		{
			this.list.removeFirst();
		}
		else
		{
			this.previous.setNextNode(this.position.getNextNode());
		}
		
		this.position = this.previous;
		this.isAfterNext = false;
		this.list.incrementListSize(-1);
	}
	
	/**
	 * Sets another value for the element that was last traversed over
	 * @param element the new element to replace the old one with
	 */
	public void set(Object element)
	{
		if(!this.isAfterNext)
		{
			throw new NoSuchElementException();
		}
		this.position.setData(element);
	}
}

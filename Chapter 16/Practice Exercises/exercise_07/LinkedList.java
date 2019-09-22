package exercise_07;

import java.util.NoSuchElementException;

/**
 * Reimplement the LinkedList class of section 16.1 so that the Node and LinkedList Iterator classes are not inner classes
 * 
 * @author Mayuresh
 *
 */
public class LinkedList
{
	// Instance Variables
	private Node first;
	private int currentSize;
	
	// Constructors
	public LinkedList()
	{
		this.first = null;
		this.currentSize = 0;
	}
	
	// Methods
	public Object getFirst()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		
		return this.first.getData();
	}
	
	public Node getFirstNode()
	{
		return this.first;
	}
	
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
	
	public void addFirst(Object element)
	{
		Node newNode = new Node();
		
		newNode.setData(element);
		newNode.setNextNode(this.first);
		this.first = newNode;
		
		this.currentSize++;
	}
	
	public int getSize()
	{
		return this.currentSize;
	}
	
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
	
	public ListIterator getListIterator()
	{
		return new LinkedListIterator(this);
	}
	
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

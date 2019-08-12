package exercise_02;

import java.util.ArrayList;
import java.util.NoSuchElementException;


/**
 * Consider a version of the LinkedList class of Section 16.1 in which the addFirst method
 * has been replaced with the following faulty version:
 * 
 * 		public void faultyAddFirst(Object element)
 * 		{
 * 			Node newNode = new Node();
 * 			first = newNode;
 * 			newNode.data = element;
 * 			newNode.next = first;
 * 		}
 * 
 * Develop a program ListTest with a test case that shows the error. That is, the program
 * should print a failure message with this implementation but not with the correct implementation.
 * 
 * @author Mayuresh
 *
 */
public class MyLinkedList
{
	// Instance Variables
	private Node first;
	private int currentSize;
	
	// Constructors
	/**
	 * Constructs an empty linked list
	 */
	public MyLinkedList()
	{
		this.first = null;
		this.currentSize = 0;
	}
	
	// Methods
	/**
	 * Returns the size of the linked list
	 * @return the size
	 */
	public int size()
	{
		return this.currentSize;
	}
	
	/**
	 * Returns the first element in the linked list
	 * @return the first element in the linked list
	 */
	public Object getFirst()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		
		return this.first.data;
	}
	
	/**
	 * Removes the first element in the linked list
	 * @return the removed element
	 */
	public Object removeFirst()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		
		Object element = this.first.data;
		this.first = first.next;
		this.currentSize--;
		return element;
	}
	
	/**
	 * A faulty add first method
	 * @param element the element to add
	 */
	public void faultyAddFirst(Object element)
	{
		Node newNode = new Node();
		
		this.first = newNode;
		newNode.data = element;
		newNode.next = first;
		
		this.currentSize++;
	}
	/**
	 * Adds an element to the front of the linked list
	 * @param element the element to add
	 */
	public void addFirst(Object element)
	{
		Node newNode = new Node();
		
		newNode.data = element;
		newNode.next = first;
		this.first = newNode;
		
		this.currentSize++;
	}
	
	/**
	 * Returns an iterator for iterating through this list
	 * @return an iterator for iterating through this list
	 */
	public MyListIterator listIterator()
	{
		return new MyLinkedListIterator();
	}
	
	/**
	 * Reverses the Linked List
	 * 
	 * This method basically creates a new linked list by cutting the head and then inserting it
	 * into the new list until the first list is empty. And then simply assigning the head of the
	 * new linked list as the head of the old one.
	 */
	public void reverse()
	{
		// Make sure that there is an element present
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}

		MyLinkedList temp = new MyLinkedList();

		while(this.first != null)
		{
			// Remove the first link and return the object
			Object element = this.removeFirst();

			// Add the first link to the temporary linked list
			temp.addFirst(element);
		}

		// Set the temporary linked list to this linked list
		this.first = temp.first;
	}

	/**
	 * Reverses the linked list by reversing the links.
	 */
	public void betterReverse()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}

		Node previous = this.first;
		Node current = first.next;
		first.next = null;

		while(current != null)
		{
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		this.first = previous;
	}
	
	/**
	 * Returns a ArrayList representation of this linked list
	 * @return arraylist containing all the objects in this linked list
	 */
	public ArrayList<Object> toArray()
	{
		ArrayList<Object> objs = new ArrayList<>();
		// Iterate over each node and add the element into the array
		MyListIterator iter = this.listIterator();
		while(iter.hasNext())
		{
			objs.add(iter.next());
		}
		
		return objs;
	}
	
	/**
	 * Returns the string representation of this linked list
	 */
	public String toString()
	{
		String s = "";
		
		MyListIterator iter = this.listIterator();
		
		while(iter.hasNext())
		{
			Object obj = iter.next();
			s = s + "[" + obj + "]";
		}
		
		return s;
	}
	
	// Inner Classes
	/**
	 * This class contains the data that is in 
	 * @author Mayuresh
	 *
	 */
	class Node
	{
		// Instance Variables
		public Object data;
		public Node next;
	}
	
	/**
	 * Iterator class that is used to traverse the linked list
	 * @author Mayuresh
	 *
	 */
	class MyLinkedListIterator implements MyListIterator
	{
		// Instance Variables
		private Node position;
		private Node previous;
		private boolean isAfterNext;
		
		// Constructors
		/**
		 * Constructs an iterator that points to the front
		 */
		public MyLinkedListIterator()
		{
			this.position = null;
			this.previous = null;
			this.isAfterNext = false;
		}
		
		// Methods
		/**
		 * Moves the iterator past the next element
		 * @return the traversed element
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
				this.position = first;
			}
			else
			{
				this.position = this.position.next;
			}
			
			return this.position.data;
		}
		
		/**
		 * Tests if there is an element after the iterator position.
		 * @return true if there is an element after the iterator position
		 */
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
		
		/**
		 * Adds an element before the iterator position and moves the iterator past the inserted element
		 * @param element the element to add
		 */
		public void add(Object element)
		{
			if(this.position == null)
			{
				addFirst(element);
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
		
		/**
		 * Removes the last traversed element. This method may only be called after a call to the next method
		 */
		public void remove()
		{
			if(!this.isAfterNext)
			{
				throw new NoSuchElementException();
			}
			
			if(this.position == first)
			{
				removeFirst();
			}
			else
			{
				this.previous.next = this.position.next;
			}
			
			this.position = this.previous;
			this.isAfterNext = false;
			currentSize--;
		}
		
		/**
		 * Sets the last traversed element to a different value.
		 * @param element the element to set
		 */
		public void set(Object element)
		{
			if(!this.isAfterNext)
			{
				throw new NoSuchElementException();
			}
			
			this.position.data = element;
		}
	}
}
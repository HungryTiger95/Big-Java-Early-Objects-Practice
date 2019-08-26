package exercise_07;

import java.util.NoSuchElementException;

/**
 * A linked list is a sequence of nodes with efficient
 * element insertion and removal. This class
 * contains a subset of the methods of the standard
 * java.util.LinkedList class.
 * 
 * @author Mayuresh
 *
 */
public class MyLinkedList <E>
{
	// Instance Variables
	private Node<E> first;
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
	public int size()
	{
		return this.currentSize;
	}
	
	/**
	 * Returns the first element in the linked list
	 * @return the first element in the linked list
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
	 * Removes the first element in the linked list
	 * @return the removed element
	 */
	public E removeFirst()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		
		E element = this.first.data;
		this.first = first.next;
		this.currentSize--;
		return element;
	}
	
	/**
	 * Adds an element to the front of the linked list
	 * @param element the element to add
	 */
	public void addFirst(E element)
	{
		Node<E> newNode = new Node<>();
		
		newNode.data = element;
		newNode.next = first;
		this.first = newNode;
		
		this.currentSize++;
	}
	
	/**
	 * Returns an iterator for iterating through this list
	 * @return an iterator for iterating through this list
	 */
	public MyListIterator<E> listIterator()
	{
		return new MyLinkedListIterator();
	}
	
	// Inner Classes
	/**
	 * This class contains the data that is in 
	 * @author Mayuresh
	 *
	 */
	class Node <T>
	{
		// Instance Variables
		public T data;
		public Node<T> next;
	}
	
	/**
	 * Iterator class that is used to traverse the linked list
	 * @author Mayuresh
	 *
	 */
	class MyLinkedListIterator implements MyListIterator<E>
	{
		// Instance Variables
		private Node<E> position;
		private Node<E> previous;
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
		public E next()
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
		public void add(E element)
		{
			if(this.position == null)
			{
				addFirst(element);
				position = first;
			}
			else
			{
				Node<E> newNode = new Node<>();
				
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
				throw new IllegalStateException();
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
		public void set(E element)
		{
			if(!this.isAfterNext)
			{
				throw new NoSuchElementException();
			}
			
			this.position.data = element;
		}
	}
}

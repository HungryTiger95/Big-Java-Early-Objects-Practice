package double_linked_list;

import java.util.NoSuchElementException;

public class LinkedList
{
	// Instance Variables
	private Node first;
	private int currentSize;
	
	// Constructors
	/**
	 * Constructs a doubly-linked list
	 */
	public LinkedList()
	{
		this.first = null;
		this.currentSize = 0;
	}
	
	// Methods
	/**
	 * Returns the number of elements in the linked list
	 * @return the size of the linked list
	 */
	public int getSize()
	{
		return this.currentSize;
	}
	
	/**
	 * Tests whether or not the linked list is empty
	 * @return true if it is, false if not
	 */
	public boolean isEmpty()
	{
		return this.currentSize == 0;
	}
	
	/**
	 * Returns the first node in the linked list (the head)
	 * @return the head of the linked list
	 */
	public Node getFirstNode()
	{
		return this.first;
	}
	
	/**
	 * Adds an element to the front of the linked list
	 * @param element the element to add
	 */
	public void addFirst(Object element)
	{
		// Construct a new node and set the data to the passed object,
		// next to the object that was the head, and previous to null
		Node newNode = new Node();

		newNode.data = element;
		newNode.next = this.first;
		newNode.previous = null;
		
		if(this.first != null)
		{
			this.first.previous = newNode;
		}
		
		this.first = newNode;
		this.currentSize++;
	}
	
	/**
	 * Removes the first element in the list
	 * @return the first element
	 */
	public Object removeFirst()
	{
		if(this.first == null)
		{
			throw new NoSuchElementException();
		}
		
		Object obj = this.first.data;
		if(this.first.next == null)
		{
			this.first.data = null;
			this.first.next = null;
		}
		else
		{
			this.first = this.first.next;
			this.first.previous = null;
		}
		
		this.currentSize--;
		return obj;
	}
	
	/**
	 * Appends an element to the end of the list
	 * @param element an object
	 */
	public void addLast(Object element)
	{
		// If the list is of size 0, just add to the front
		if(this.currentSize == 0)
		{
			addFirst(element);
			return;
		}
		
		// Create a new node and set the next value to null
		// because the last elements next value should be null
		Node newNode = new Node();
		newNode.next = null;
		
		// Create a copy of the first node so you can traverse
		// the linked list until the end
		Node current = this.first;
		while(current.next != null)
		{
			current = current.next;
		}
		
		// Make the next value of the last node the newNode
		// Make the previous value of the newNode to the last
		// node in the list
		current.next = newNode;
		newNode.previous = current;
		
		this.currentSize++;
	}
	
	public void addAt(int index, Object element)
	{
		if(index >= this.currentSize || index < 0)
		{
			throw new IndexOutOfBoundsException();
		}
		
		if(index == 0)
		{
			this.addFirst(element);
		}
		else
		{
			Node currentNode = this.first;
			for(int i = 0; i < index; i++)
			{
				currentNode = currentNode.next;
			}
			
			Node newNode = new Node();
			newNode.data = element;
			
			newNode.previous = currentNode.previous;
			currentNode.previous = newNode;
			newNode.next = currentNode;
			newNode.previous.next = newNode;
			
			this.currentSize++;
		}
	}
	
	/**
	 * Returns an iterator for iterating through this list
	 * @return an iterator for iterating through this list
	 */
	public ListIterator listIterator()
	{
		return new LinkedListIterator();
	}
	
	public String easyToString()
	{
		StringBuilder s = new StringBuilder();
		
		if(this.first == null)
		{
			return "[null <- null -> null]";
		}
		
		Node current = this.first;
		s.append(current.easyToString());
		
		while(current.next != null)
		{
			current = current.next;
			s.append("\n" + current.easyToString());
		}
		return s.toString();
	}
	
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		
		if(this.first == null)
		{
			return this.first.getClass().getName() + "[prev:null,data:null,next:null]";
		}
		
		Node current = this.first;
		s.append(current.toString());
		
		while(current.next != null)
		{
			current = current.next;
			s.append(", " + current.toString());
		}
		return s.toString();
	}
	// Inner Classes
	class Node
	{
		public Object data;
		public Node next;
		public Node previous;
		
		public String easyToString()
		{
			String dataVal = "", nextVal = "", previousVal = "";
			if(data == null)
			{
				dataVal = "null";
			}
			else
			{
				dataVal = data.toString();
			}

			if(next == null)
			{
				nextVal = "null";
			}
			else
			{
				nextVal = next.data.toString();
			}

			if(previous == null)
			{
				previousVal = "null";
			}
			else
			{
				previousVal = previous.data.toString();
			}
			return  "[" + previousVal + " <- " + dataVal + " -> " + nextVal + "]";
		}
		
		public String toString()
		{
			String dataVal = "", nextVal = "", previousVal = "";
			if(data == null)
			{
				dataVal = "null";
			}
			else
			{
				dataVal = data.toString();
			}
			
			if(next == null)
			{
				nextVal = "null";
			}
			else
			{
				nextVal = next.data.toString();
			}
			
			if(previous == null)
			{
				previousVal = "null";
			}
			else
			{
				previousVal = previous.data.toString();
			}
			return this.getClass().getName() + "[prev:" + previousVal + ",data:" + dataVal + ",next:" + nextVal + "]";
		}
	}
	
	class LinkedListIterator implements ListIterator
	{
		// Instance Variables
		private Node position;
		private Node previous;
		private boolean isAfterNext;
		
		// Constructors
		public LinkedListIterator()
		{
			this.position = null;
			this.previous = null;
			this.isAfterNext = false;
		}
		
		// Methods
		@Override
		public String getPosition()
		{
			if(this.position == null)
			{
				return "null";
			}
			else
			{
				return this.position.data.toString();
			}
		}
		
		@Override
		public String getPrevious()
		{
			if(this.previous == null)
			{
				return "null";
			}
			else
			{
				return this.previous.data.toString();
			}
		}
		
		@Override
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

		@Override
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

		@Override
		public void add(Object element)
		{
			if(!this.isAfterNext)
			{
				throw new IllegalStateException();
			}
			
			Node newNode = new Node();
			newNode.data = element;
			
			// if the element is the first and last one
			if(this.previous == null && this.position.next == null)
			{
				newNode.previous = this.position;
				newNode.next = null;
				this.position.next = newNode;
			}
			else if(this.position.next == null)		// if this position is the last one
			{
				newNode.next = null;
				newNode.previous = this.position;
				this.position.next = newNode;
			}
			else
			{	
				newNode.next = this.position.next;
				this.position.next.previous = newNode;
				this.position.next = newNode;
				newNode.previous = this.position;
			}
			this.previous = this.position;
			this.position = newNode;
			
			this.isAfterNext = false;
			currentSize++;
		}

		@Override
		public void remove()
		{
			if(!this.isAfterNext)
			{
				throw new IllegalStateException();
			}
			
			if(this.previous == null && this.position.next == null)
			{
				first = null;
				
				this.position = null;
				this.previous = null;
			}
			else if(this.previous == null)
			{
				this.position.next.previous = null;
				first = this.position.next;
				
				this.position = null;
				this.previous = null;
			}
			else if(this.position.next == null)
			{
				this.position.previous.next = null;
				
				this.position = this.position.previous;
				this.previous = this.position.previous;
			}
			else
			{
				this.position.next.previous = this.position.previous;
				this.position.previous.next = this.position.next;
				
				this.position = this.position.previous;
				this.previous = this.position.previous;
			}
			
			this.isAfterNext = false;
			currentSize--;
		}

		@Override
		public void set(Object element)
		{
			if(!this.isAfterNext)
			{
				throw new IllegalStateException();
			}
			this.position.data = element;
			
			this.isAfterNext = false;
		}

		@Override
		public boolean hasPrevious()
		{
			return this.position != null && this.previous != null;
		}

		@Override
		public Object previous()
		{
			if(!hasPrevious())
			{
				throw new NoSuchElementException();
			}
			this.isAfterNext = true;
			this.position = this.position.previous;
			this.previous = this.position.previous;
			
			return this.position;
		}
	}
}

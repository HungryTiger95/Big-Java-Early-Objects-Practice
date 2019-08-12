package section_04;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class implements a hash set using separate chaining
 * 
 * @author Mayuresh
 *
 */
public class HashSet
{
	// Instance Variables
	private Node[] buckets;
	private int currentSize;
	
	// Constructors
	/**
	 * Constructs a hash table
	 * @param bucketsLength the length of the buckets array
	 */
	public HashSet(int bucketsLength)
	{
		buckets = new Node[bucketsLength];
		currentSize = 0;
	}
	
	// Methods
	/**
	 * Tests for set membership
	 * @param x an object
	 * @return true if x is an element of this set
	 */
	public boolean contains(Object x)
	{
		int h = x.hashCode();
		
		if(h < 0)
		{
			h = -h;
		}
		
		h = h % buckets.length;
		
		Node current = buckets[h];
		while(current != null)
		{
			if(current.data.equals(x))
			{
				return true;
			}
			current = current.next;
		}
		
		return false;
	}
	
	/**
	 * Adds an element to this set
	 * @param x an object
	 * @return true if x is a new object, false if x was already in the set
	 */
	public boolean add(Object x)
	{
		int h = x.hashCode();
		
		if(h < 0)
		{
			h = -h;
		}
		
		h = h % buckets.length;
		
		Node current = buckets[h];
		while(current != null)
		{
			if(current.data.equals(x))
			{
				return false;		// Already in the set
			}
			current = current.next;
		}
		
		Node newNode = new Node();
		newNode.data = x;
		newNode.next = buckets[h];
		buckets[h] = newNode;
		currentSize++;
		
		return true;
	}
	
	/**
	 * Removes an object from this set
	 * @param x an object
	 * @return true if x was removed from this set, false if x was not an element of this set
	 */
	public boolean remove(Object x)
	{
		int h = x.hashCode();
		
		if(h < 0)
		{
			h = -h;
		}
		
		h = h % buckets.length;
		
		Node current = buckets[h];
		Node previous = null;
		while(current != null)
		{
			if(current.data.equals(x))
			{
				if(previous == null)
				{
					buckets[h] = current.next;
				}
				else
				{
					previous.next = current.next;
				}
				
				currentSize--;
				return true;
			}
			
			previous = current;
			current = current.next;
		}
		return false;
	}
	
	/**
	 * Returns an iterator that traverses the element of this set.
	 * @return a hash set iterator
	 */
	public Iterator iterator()
	{
		return new HashSetIterator();
	}
	
	/**
	 * Gets the number of elements in this set
	 * @return the number of elements
	 */
	public int size()
	{
		return this.currentSize;
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
	
	class HashSetIterator implements Iterator
	{
		// Instance Variables
		private int bucketIndex;
		private Node current;
		
		// Constructors
		/**
		 * Constructs a hash set iterator that points to the first element of the hash set
		 */
		public HashSetIterator()
		{
			current = null;
			bucketIndex = -1;
		}
		
		// Methods
		/**
		 * Checks if there is another element in the hash set
		 * @return true if there is another element after the current one
		 */
		public boolean hasNext()
		{
			if(current != null && current.next != null)
			{
				return true;
			}
			
			for(int b = bucketIndex + 1; b < buckets.length; b++)
			{
				if(buckets[b] != null)
				{
					return true;
				}
			}
			return false;
		}
		
		/**
		 * Return the next element in the hash set
		 */
		public Object next()
		{
			if(current != null && current.next != null)
			{
				current = current.next;		// Move to the next element in the bucket
			}
			else		// Move to the next bucket
			{
				do
				{
					bucketIndex++;
					if(bucketIndex == buckets.length)
					{
						throw new NoSuchElementException();
					}
					current = buckets[bucketIndex];
				}
				while (current == null);
			}
			return current.data;
		}
		
		/**
		 * Not supporting remove function as of now
		 */
		public void remove()
		{
			throw new UnsupportedOperationException();
		}
	}
}

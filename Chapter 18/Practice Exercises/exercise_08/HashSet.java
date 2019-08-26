package exercise_08;

import java.util.ArrayList;

/**
 * I DONT KNOW WHAT TO DO HERE:
 * 
 * I get an error saying something like "divide by zero". I know why I'm getting this: the getProcessedHashCode is
 * throwing this when the size of the array list is 0. So basically, when I try to add in the first element, it throws
 * this error. I know why its throwing the error but I can't come up with a solution. The problem here is that the
 * assignment insists I use ArrayLists. How would you get the capacity of an arraylist and how do you add elements
 * to various positions of an arraylist.
 * 
 * I don't see a way of doing this the way a hashtable was explained in the book using an arraylist. I see the solution
 * using regular arrays, of course.
 * 
 * @author Mayuresh
 *
 * @param <E>
 */
public class HashSet<E>
{
	// Instance Variables
	private ArrayList<Node<E>> buckets;
	private int currentSize;
	
	// Constructors
	/**
	 * Constructs a empty hash table
	 */
	public HashSet()
	{
		this.buckets = new ArrayList<Node<E>>();
		this.currentSize = 0;
	}
	
	// Methods
	/**
	 * Gets the processed hash code of a given object, which indicates the index
	 * of the array at which it is located
	 * @param element the object to get the hash code of
	 * @return the processed hashcode
	 */
	private int getProcessedHashCode(E element)
	{
		int h = element.hashCode();
		if(h < 0) { h = -h; }
		return h % this.buckets.size();
	}
	
	/**
	 * Tests for set membership
	 * @param element an element
	 * @return true if the element is an element of this set, otherwise false
	 */
	public boolean contains(E element)
	{
		int h = getProcessedHashCode(element);
		Node<E> current = this.buckets.get(h);
		
		while(current != null)
		{
			if(current.element.equals(element))
			{
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	/**
	 * Adds an element to this set
	 * @param element the element to add
	 * @return true if the element is a new object, false otherwise
	 */
	public boolean add(E element)
	{
		int h = getProcessedHashCode(element);
		Node<E> current = this.buckets.get(h);
		
		while(current != null)
		{
			if(current.element.equals(element))
			{
				return false;
			}
			current = current.next;
		}
		
		Node<E> newNode = new Node<>();
		newNode.element = element;
		newNode.next = this.buckets.get(h);
		this.buckets.set(h, newNode);
		
		this.currentSize++;
		return true;
	}
	
	/**
	 * Removes an element from this set
	 * @param element the element to remove
	 * @return true if the element was removed, false if the element was not part of this set
	 */
	public boolean remove(E element)
	{
		int h = getProcessedHashCode(element);
		Node<E> current = this.buckets.get(h);
		Node<E> previous = null;
		
		while(current != null)
		{
			if(current.element.equals(element))
			{
				if(previous == null)
				{
					this.buckets.set(h, current.next);
				}
				else
				{
					previous.next = current.next;
				}
				
				this.currentSize--;
				return true;
			}
			
			previous = current;
			current = current.next;
		}
		return false;
	}
	
	/**
	 * Returns an iterator that traverses the element of this set
	 * @return a hash set iterator
	 */
	public SetIterator<E> iterator()
	{
		return new HashSetIterator();
	}
	
	/**
	 * Gets the number of elements in this set
	 * @return the current size
	 */
	public int getSize()
	{
		return this.currentSize;
	}

	/**
	 * Gets the string representation of this hash set
	 */
	public String toString()
	{
		String s = "";
		
		// Outer Loop; Go through all the buckets
		OuterLoop: for(int i = 0; i < this.buckets.size(); i++)
		{
			s += "[";
			Node<E> currentNode = this.buckets.get(i);
			
			// Go through each node until the end
			if(currentNode == null)
			{
				s += "], ";
				continue OuterLoop;
			}
			else
			{
				while(currentNode != null)
				{
					// Print data
					if(currentNode.next == null)
					{
						s += currentNode.element;
					}
					else
					{
						s += currentNode.element + ", ";
					}
					
					currentNode = currentNode.next;
				}
				
				s += "]";
			}
			s += ", ";
		}
		return this.getClass().getName() + "[" + s.substring(0, s.length() - 2) + "]";
	}

	// Classes
	class Node<T>
	{
		public T element;
		public Node<T> next;
	}
	
	class HashSetIterator implements SetIterator<E>
	{
		// Instance Variables
		private int bucketIndex;
		private Node<E> current;
		
		// Constructors
		/**
		 * Constructs a hash set iterator that points before the first element of the hash set
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
			
			for(int b = bucketIndex + 1; b < buckets.size(); b++)
			{
				if(buckets.get(b) != null)
				{
					return true;
				}
			}
			return false;
		}
		
		public E next()
		{
			if(current != null && current.next != null)
			{
				current = current.next;
			}
			else
			{
				current = buckets.get(bucketIndex);
			}
			return current.element;
		}

		public void remove()
		{
			// Do nothing
		}
	}
}

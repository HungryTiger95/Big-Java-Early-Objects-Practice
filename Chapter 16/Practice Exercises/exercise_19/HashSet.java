package exercise_19;

/**
 * Implement the remove operation for iterators on the hash set in section 16.4
 * 
 * @author Mayuresh
 *
 */
public class HashSet
{
	// Instance Variables
	private Node[] buckets;
	private int currentSize;

	// Constructor
	/**
	 * Constructs a Hash Table
	 * @param bucketsLength the number of buckets
	 */
	public HashSet(int bucketsLength)
	{
		this.buckets = new Node[bucketsLength];
		this.currentSize = 0;
	}

	// Methods
	private int getProcessedHashCode(Object obj, int bucketSize)
	{
		int h = obj.hashCode();

		if(h < 0)
		{
			h = -h;
		}
		return h % bucketSize;
	}

	private double getLoadFactor()
	{
		return ((double) this.currentSize / (double) this.buckets.length);
	}

	private void growIfNecessary()
	{
		if(getLoadFactor() >= 0.75)
		{
			// Create a new set of buckets double the size of the current buckets
			Node[] newBuckets = new Node[this.buckets.length * 2];

			// Loop through the original bucket and add each element to the new bucket
			for(int i = 0; i < this.buckets.length; i++)
			{
				// Make a current Node so that you can traverse the linkes
				Node currentNode = this.buckets[i];

				// If the node is empty, move on
				if(currentNode != null)
				{
					// Loop through all the nodes and process their hashcodes
					while(currentNode != null)
					{
						int h = getProcessedHashCode(currentNode.data, newBuckets.length);

						// add this node to this bucket in the front
						Node newNode = new Node();
						newNode.data = currentNode.data;
						newNode.next = newBuckets[h];
						newNode.previous = null;

						if(newBuckets[h] != null)
						{
							newBuckets[h].previous = newNode;
						}

						newBuckets[h] = newNode;

						// Go to the next Node
						currentNode = currentNode.next;
					}
				}
			}
			this.buckets = newBuckets;
		}
	}

	private void shrinkIfNecessary()
	{
		if(getLoadFactor() <= 0.50)
		{
			// Create a new set of buckets double the size of the current buckets
			Node[] newBuckets = new Node[this.buckets.length / 2];

			// Loop through the original bucket and add each element to the new bucket
			for(int i = 0; i < this.buckets.length; i++)
			{
				// Make a current Node so that you can traverse the linkes
				Node currentNode = this.buckets[i];

				// If the node is empty, move on
				if(currentNode != null)
				{
					// Loop through all the nodes and process their hashcodes
					while(currentNode != null)
					{
						int h = getProcessedHashCode(currentNode.data, newBuckets.length);

						// add this node to this bucket in the front
						Node newNode = new Node();
						newNode.data = currentNode.data;
						newNode.next = newBuckets[h];
						newNode.previous = null;

						if(newBuckets[h] != null)
						{
							newBuckets[h].previous = newNode;
						}

						newBuckets[h] = newNode;

						// Go to the next Node
						currentNode = currentNode.next;
					}
				}
			}
			this.buckets = newBuckets;
		}
	}

	public int getSize()
	{
		return this.currentSize;
	}

	public Node[] getBuckets()
	{
		return this.buckets;
	}

	public boolean contains(Object element)
	{
		int h = getProcessedHashCode(element, this.buckets.length);

		// Go to the corresponding bucket index
		Node currentNode = buckets[h];

		while(currentNode != null)
		{
			if(currentNode.data.equals(element))
			{
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
	}

	public boolean add(Object element)
	{
		// Check if the array needs to grow
		growIfNecessary();

		// Process the hashcode of the new element
		int h = getProcessedHashCode(element, this.buckets.length);

		// Loop through the array making sure that the element does not exist in the set
		Node currentNode = this.buckets[h];

		while(currentNode != null)
		{
			if(currentNode.data.equals(element))
			{
				return false;		// Already in the set
			}
			currentNode = currentNode.next;
		}

		// add the element to the beginning of the linked list
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = this.buckets[h];
		newNode.previous = null;

		if(this.buckets[h] != null)
		{
			this.buckets[h].previous = newNode;
		}

		this.buckets[h] = newNode;

		this.currentSize++;
		return true;
	}

	public boolean remove(Object element)
	{
		// Shrink the array if necessary
		shrinkIfNecessary();

		// Process hashcode for the new element
		int h = getProcessedHashCode(element, this.buckets.length);

		// Have a currentNode and a previousNode to keep track of your position in the linkedlist
		Node currentNode = this.buckets[h];
		Node previousNode = null;

		// Loop through the linkedlist of the correct bucket
		while(currentNode != null)
		{
			// if the element is located
			if(currentNode.data.equals(element))
			{
				if(previousNode == null && currentNode.next == null)
				{
					this.buckets[h] = null;
				}
				else if(previousNode == null)
				{
					currentNode.next.previous = null;
					this.buckets[h] = currentNode.next;
				}
				else if(currentNode.next == null)
				{
					currentNode.previous.next = null;
				}
				else
				{
					currentNode.next.previous = previousNode;
					previousNode.next = currentNode.next;
				}
				this.currentSize--;
				return true;
			}

			// Otherwise, move on
			previousNode = currentNode;
			currentNode = currentNode.next;
		}

		return false;
	}

	public SetIterator hashSetIterator()
	{
		return new HashSetIterator();
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder();

		// Iterate through all the buckets
		for(int i = 0; i < this.buckets.length; i++)
		{
			s.append("[");

			Node currentNode = this.buckets[i];

			// Traverse through the linked list at this bucket index
			if(currentNode == null)
			{
				s.append("], ");
				continue;
			}
			else
			{
				while(currentNode != null)
				{
					if(currentNode.next == null)
					{
						s.append(currentNode.easyToString());
					}
					else
					{
						s.append(currentNode.easyToString() + ", ");
					}

					currentNode = currentNode.next;
				}

				s.append("]");
			}

			s.append(", ");
		}

		return this.getClass().getName() + "[" + s.substring(0, s.length() - 2) + "]";
	}

	public String easyToString()
	{
		StringBuilder s = new StringBuilder();

		// Iterate through all the buckets
		for(int i = 0; i < this.buckets.length; i++)
		{
			s.append("[");

			Node currentNode = this.buckets[i];

			// Traverse through the linked list at this bucket index
			if(currentNode == null)
			{
				s.append("], ");
				continue;
			}
			else
			{
				while(currentNode != null)
				{
					if(currentNode.next == null)
					{
						s.append(currentNode.data.toString());
					}
					else
					{
						s.append(currentNode.data.toString() + ", ");
					}

					currentNode = currentNode.next;
				}

				s.append("]");
			}

			s.append(", ");
		}

		return this.getClass().getName() + "[" + s.substring(0, s.length() - 2) + "]";
	}

	// Inner Classes
	class Node
	{
		public Object data;
		public Node next;
		public Node previous;

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
			return  "[" + previousVal + "<-" + dataVal + "->" + nextVal + "]";
		}
	}

	class HashSetIterator implements SetIterator
	{
		// Instance Variables
		private Node position;
		private Node previous;
		
		private boolean isAfterNext;
		private int bucketIndex;

		// Constructors
		public HashSetIterator()
		{
			this.position = null;
			this.previous = null;
			
			this.isAfterNext = false;
			this.bucketIndex = -1;
		}

		// Methods
		@Override
		public boolean hasNext()
		{
			// If we are already traversing a list within a bucket and
			// this list still has elements within it
			if(this.position != null && this.position.next != null)
			{
				return true;
			}
			
			// Find the next bucket with a node that is not null
			for(int b = this.bucketIndex + 1; b < buckets.length; b++)
			{
				if(buckets[b] != null)
				{
					this.bucketIndex = b;
					return true;
				}
			}
			return false;
		}

		@Override
		public Object next()
		{
			this.isAfterNext = true;
			if(this.position != null && this.position.next != null)
			{
				this.previous = this.position;
				this.position = this.position.next;
			}
			else
			{
				this.position = buckets[this.bucketIndex];
				this.previous = null;
			}
			return this.position.data;
		}

		@Override
		public String getPosition()
		{
			return this.position == null ? "null" : this.position.data.toString();
		}

		@Override
		public String getPrevious()
		{
			return this.previous == null ? "null" : this.previous.data.toString();
		}
		
		@Override
		public void remove()
		{
			// make sure that this call comes after a call to next()
			if(!this.isAfterNext)
			{
				throw new IllegalStateException();
			}
			
			if(this.previous == null && this.position.next == null)		// if this is the one an only element in the linked list
			{
				buckets[this.bucketIndex] = null;
				
				this.position = null;
				this.previous = null;
			}
			else if(this.previous == null)		// if this is the first element in the linked list
			{
				this.position.next.previous = null;
				buckets[this.bucketIndex] = this.position.next;

				this.position = null;
				this.previous = null;
				this.bucketIndex--;
			}
			else if(this.position.next == null)			// if this is the last element in the linked list
			{
				this.position.previous.next = null;

				this.position = this.position.previous;
				this.previous = this.position.previous;
			}
			else		// otherwise this is an element somewhere in the middle
			{
				this.position.next.previous = this.position.previous;
				this.position.previous.next = this.position.next;

				this.position = this.position.previous;
				this.previous = this.position.previous;
			}

			this.isAfterNext = false;
			currentSize--;
		}
	}
}
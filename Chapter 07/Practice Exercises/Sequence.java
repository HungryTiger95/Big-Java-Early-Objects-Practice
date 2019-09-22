import java.util.Arrays;

/**
 * Consider the following class:
 * 
 * 		public class Sequence
 *		{
 *			private int[] values;
 *			public Sequence(int size) {values = new int[size];}
 *			public void set(int i, int n) {values[i] = n;}
 *		}
 *
 *Add a method
 *
 *		public boolean equals(Sequence other)
 *
 *that checks whether the two sequences have the same values in the same order.
 *
 * @author Mayuresh
 *
 */
public class Sequence
{
	// Instance Variables
	private int[] values;
	
	// Constructors
	public Sequence(int size)
	{
		values = new int[size];
	}
	
	// Methods
	public void set(int i, int n)
	{
		values[i] = n;
	}
	
	/**
	 * Returns if the two sequences have the same elements in them
	 * @param other other sequence
	 * @return 
	 */
	public boolean equals(Sequence other)
	{
		boolean sameSequence = false;
		
		// check to see if the two sequences have same length
		if(values.length != other.getSize())
		{
			return sameSequence;
		}
		else
		{
			// Check each element
			for(int i = 0; i < values.length; i++)
			{
				if(values[i] == other.getIndexOf(i))
				{
					sameSequence = true;
				}
				else
				{
					sameSequence = false;
					break;
				}
			}
			return sameSequence;
		}
	}
	
	/**
	 * Gets the size of the sequence
	 * @return length
	 */
	public int getSize()
	{
		return values.length;
	}
	
	/**
	 * Gets the value of the index i
	 * @param i index
	 * @return value at the index
	 */
	public int getIndexOf(int i)
	{
		return values[i];
	}
	
	/**
	 * Prints the sequence
	 */
	public void print()
	{
		for(int i = 0; i < getSize(); i++)
		{
			if(i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(values[i]);
		}
	}
	
	/**
	 * Checks if two sequences contain the same values
	 * @param other other Sequence
	 * @return true if the sequences contain the same values or false if not
	 */
	public boolean sameValues(Sequence other)
	{
		boolean same = true;
		
		// Sort the two sequences
		Arrays.sort(values);
		Arrays.sort(other.values);
		
		// Remove duplicates
		removeDuplicate();
		other.removeDuplicate();
		
		// check if the arrays are the same
		if(equals(other) == true)
		{
			same = true;
		}
		else
		{
			same = false;
		}
		
		// return boolean
		return same;
	}
	
	/**
	 * Removes the duplicates of the sequence and then sorts it
	 */
	public void removeDuplicate()
	{
		// Remove duplicates
		int j = values.length;
		
		for(int i = 0; i < j; i++)
		{
			for(int k = i + 1; k < j; k++)
			{
				if(values[i] == values[k])
				{
					values[k] = values[j - 1];
					j--;
					k--;
				}
			}
		}
		values = Arrays.copyOf(values, j);
		
		// Sort the array
		Arrays.sort(values);
	}
	
	/**
	 * Gets the array values
	 * @return values
	 */
	public int[] getValues()
	{
		return values;
	}
	
	/**
	 * Test whether a sequence is a permutation of the other
	 * @param other other sequence
	 * @return true if both sequences are permutations of each other, or false if not
	 */
	public boolean isPermutation(Sequence other)
	{
		boolean isPermutation = false;
		
		// Make sure the sequences are the same length
		if(values.length != other.getSize())
		{
			return false;
		}
		else
		{
			// Create a temp array for both values
			int[] first = Arrays.copyOf(values, values.length);
			int[] second = Arrays.copyOf(other.getValues(), other.getSize());
			
			
			// Remove Duplicates
			removeDuplicate();
			other.removeDuplicate();
			
			// Create two arrays size of sequence after removing duplicates
			int count1[] = new int[values.length];
			int count2[] = new int[values.length];
			
			// Count how many times each value is found in each sequence
			for(int i = 0; i < count1.length; i++)
			{
				for(int j = 0; j < first.length; j++)
				{
					// count for first one
					if(values[i] == first[j])
					{
						count1[i]++;
					}
					// count for second one
					if(other.getIndexOf(i) == second[j])
					{
						count2[i]++;
					}
				}
			}
			
			// Compare the two count arrays
			for(int i = 0; i < count1.length; i++)
			{
				if(count1[i] != count2[i])
				{
					isPermutation = false;
					break;
				}
				else
				{
					isPermutation = true;
				}
			}
		}
		return isPermutation;
	}
	
	/**
	 * Returns the string of the sequence
	 */
	public String toString()
	{
		return values.toString();
	}
	
	/**
	 * Appends two sequences together forming a merger of the two
	 * @param other other sequence
	 * @return the appended sequence
	 */
	public Sequence append(Sequence other)
	{
		// Make a new sequence object with size equal to the sum of the
		// first and the second sequences
		Sequence newSeq = new Sequence(values.length + other.getSize());
		
		for(int i = 0; i < newSeq.getSize(); i++)
		{
			if(i >= 0 && i < values.length)
			{
				newSeq.set(i, values[i]);
			}
			else
			{
				newSeq.set(i, other.getIndexOf(i - values.length));
			}
		}
		
		return newSeq;
	}
	
	/**
	 * Merges two sequences together adding their elements to a new sequence in alternating form
	 * @param other other sequence
	 * @return merged sequence
	 */
	public Sequence alternateMerge(Sequence other)
	{
		Sequence newSeq = new Sequence(values.length + other.getSize());
		int valPlace = 0;
		int otherPlace = 0;
		
		if(values.length > other.getSize())
		{
			for(int i = 0; i < ((other.getSize() * 2)); i++)
			{
				if(i % 2 != 0)
				{
					newSeq.set(i, other.getIndexOf(otherPlace));
					otherPlace++;
				}
				else
				{
					newSeq.set(i, values[valPlace]);
					valPlace++;
				}
			}
			
			for(int i = ((other.getSize() * 2)); i < newSeq.getSize(); i++)
			{
				newSeq.set(i, values[i - other.getSize()]);
			}
			
			return newSeq;
		}
		else if(values.length < other.getSize())
		{
			for(int i = 0; i < ((values.length * 2)); i++)
			{
				if(i % 2 != 0)
				{
					newSeq.set(i, values[valPlace]);
					valPlace++;
				}
				else
				{
					newSeq.set(i, other.getIndexOf(otherPlace));
					otherPlace++;
				}
			}
			
			for(int i = ((values.length * 2)); i < newSeq.getSize(); i++)
			{
				newSeq.set(i, other.getIndexOf(i - values.length));
			}
			
			return newSeq;
		}
		else
		{
			for(int i = 0; i < newSeq.getSize(); i++)
			{
				if(i % 2 == 0)
				{
					newSeq.set(i, values[valPlace]);
					valPlace++;
				}
				else
				{
					newSeq.set(i, other.getIndexOf(otherPlace));
					otherPlace++;
				}
			}
			
			return newSeq;
		}
	}
	
	/**
	 * Merges two sequences together and then sorts them
	 * @param other other sequence
	 * @return merged and sorted sequence
	 */
	public Sequence sortedMerge(Sequence other)
	{
		Sequence newSeq = new Sequence(values.length + other.getSize());
		
		newSeq = this.append(other);
		Arrays.sort(newSeq.values);
		
		return newSeq;
	}
	
}

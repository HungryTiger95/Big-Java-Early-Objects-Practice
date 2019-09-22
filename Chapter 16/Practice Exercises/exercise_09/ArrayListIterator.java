package exercise_09;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ArrayListIterator implements ListIterator
{
	// Instance Variables
	private ArrayList list;
	private int currentIndex;
	private boolean isAfterNext;
	
	// Constructors
	/**
	 * Constructs an iterator meant to iterate over an array list
	 * @param list the array list to iterate over
	 */
	public ArrayListIterator(ArrayList list)
	{
		this.list = list;
		this.currentIndex = -1;
		this.isAfterNext = false;
	}
	
	// Methods
	
	public int currentIndex()
	{
		return this.currentIndex;
	}
	
	@Override
	public boolean hasNext()
	{
		if(this.currentIndex == this.list.size() - 1)
		{
			return false;
		}
		else if (this.list.get(this.currentIndex + 1) != null)
		{
			return true;
		}
		else
		{
			return true;
		}
	}

	@Override
	public Object next()
	{
		if(!hasNext())
		{
			throw new NoSuchElementException();
		}
		
		// Increment the currentIndex
		this.currentIndex++;
		
		// Get the element to return it
		return this.list.get(this.currentIndex);
	}

	@Override
	public boolean hasPrevious()
	{
		if(this.currentIndex == -1 || this.currentIndex == 0)
		{
			throw new NoSuchElementException();
		}
		else if(this.list.get(this.currentIndex - 1) != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public Object previous()
	{
		if(!hasPrevious())
		{
			throw new NoSuchElementException();
		}
		
		this.currentIndex--;
		return this.list.get(this.currentIndex);
	}

	@Override
	public int nextIndex()
	{
		if(!hasNext())
		{
			throw new NoSuchElementException();
		}
		
		int i = this.currentIndex + 1;
		return i;
	}

	@Override
	public int previousIndex()
	{
		if(!hasPrevious())
		{
			throw new NoSuchElementException();
		}
		int i = this.currentIndex - 1;
		return i;
	}

	@Override
	public void remove()
	{
		this.list.remove(this.currentIndex);
	}

	@Override
	public void set(Object e)
	{
		this.list.set(this.currentIndex, e);
	}

	@Override
	public void add(Object e)
	{
		this.list.add(this.currentIndex, e);
	}
	
}

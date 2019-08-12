package exercise_09;

import java.util.ListIterator;

public class ArrayListIterator implements ListIterator
{
	// Instance Variables
	private ArrayList list;
	private int currentIndex;
	
	// Constructors
	/**
	 * Constructs an array list iterator object with a given list
	 * @param list the list to iterate over
	 */
	public ArrayListIterator(ArrayList list)
	{
		this.list = list;
		this.currentIndex = -1;
	}

	// Methods
	@Override
	public boolean hasNext()
	{
		if(this.list.get(this.currentIndex + 1) == null)
		{
			return false;
		}
		return true;
	}

	@Override
	public Object next()
	{
		if(!hasNext())
		{
			throw new IndexOutOfBoundsException("No More Elements");
		}
		this.currentIndex++;
		return this.list.get(this.currentIndex);
	}

	@Override
	public boolean hasPrevious()
	{
		if(this.currentIndex == -1 || this.currentIndex == 0)
		{
			return false;
		}
		return true;
	}

	@Override
	public Object previous()
	{
		if(!hasPrevious())
		{
			throw new IndexOutOfBoundsException("Cannot Go Back");
		}
		this.currentIndex--;
		return this.list.get(this.currentIndex);
	}

	@Override
	public int nextIndex()
	{
		if(!hasNext())
		{
			throw new IndexOutOfBoundsException();
		}
		return this.currentIndex + 1;
	}

	@Override
	public int previousIndex()
	{
		if(!hasPrevious())
		{
			throw new IndexOutOfBoundsException();
		}
		return this.currentIndex - 1;
	}

	@Override
	public void remove()
	{
		if(this.currentIndex == -1)
		{
			throw new IndexOutOfBoundsException();
		}
		this.list.remove(this.currentIndex);
		this.currentIndex--;
	}

	@Override
	public void set(Object e)
	{
		if(this.currentIndex == -1)
		{
			throw new IndexOutOfBoundsException();
		}
		this.list.set(this.currentIndex, e);
	}

	@Override
	public void add(Object e)
	{
		if(this.currentIndex == -1)
		{
			throw new IndexOutOfBoundsException();
		}
		this.list.add(this.currentIndex, e);
		this.currentIndex++;
	}
}

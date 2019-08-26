package exercise_02;

/**
 * Add a method swap that swaps the first and second elements of the pair.
 * 
 * @author Mayuresh
 *
 */
public class Pair<T>
{
	private T first;
	private T second;
	
	public Pair(T firstElement, T secondElement)
	{
		this.first = firstElement;
		this.second = secondElement;
	}
	
	public T getFirst()
	{
		return first;
	}
	
	public T getSecond()
	{
		return second;
	}
	
	public void swap()
	{
		T temp = first;
		this.first = second;
		this.second = temp;
	}
}

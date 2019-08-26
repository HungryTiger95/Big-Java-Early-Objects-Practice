package exercise_01;

/**
 * Modify the generic Pair class so that both values have the same type
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
}

package exercise_03;

/**
 * Implement a static generic method PairUtil.swap whose argument is a Pair object, using the generic class
 * declared in Section 18.2. The method should return a new pair, with the first and second element.
 * 
 * @author Mayuresh
 *
 * @param <T>
 * @param <S>
 */
public class Pair<T, S>
{
	// Instance Variables
	private T first;
	private S second;
	
	// Constructors
	public Pair(T firstElement, S secondElement)
	{
		first = firstElement;
		second = secondElement;
	}
	
	// Methods
	public T getFirst() { return first; }
	
	public S getSecond() { return second; }
	
	public void setFirst(T element)
	{
		this.first = element;
	}
	
	public void setSecond(S element)
	{
		this.second = element;
	}
}

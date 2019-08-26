package exercise_03;

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

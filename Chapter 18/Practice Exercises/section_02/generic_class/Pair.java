package section_02.generic_class;

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
}

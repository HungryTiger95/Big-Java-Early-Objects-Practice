package section_02.regular_class;

public class Pair
{
	// Instance Variables
	private String first;
	private Integer second;
	
	// Constructors
	public Pair(String firstElement, Integer secondElement)
	{
		first = firstElement;
		second = secondElement;
	}
	
	// Methods
	public String getFirst() { return first; }
	
	public Integer getSecond() { return second; }
}

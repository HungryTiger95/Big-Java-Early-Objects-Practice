package section_06;

public class WorkOrder implements Comparable
{
	// Instance Variables
	private int priority;
	private String description;
	
	// Constructors
	public WorkOrder(int aPriority, String aDescription)
	{
		this.priority = aPriority;
		this.description = aDescription;
	}
	
	// Methods
	public String toString()
	{
		return "priority=" + this.priority + ", description=" + this.description;
	}
	
	public int compareTo(Object otherObject)
	{
		WorkOrder other = (WorkOrder) otherObject;
		if(this.priority < other.priority)
		{
			return -1;
		}
		else if(this.priority > other.priority)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

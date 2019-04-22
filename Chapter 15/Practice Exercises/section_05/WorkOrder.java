package section_05;

public class WorkOrder implements Comparable
{
	// Instance Variables
	private int priority;
	private String description;
	
	// Constructors
	/**
	 * Constructs a work order with a given priority and description
	 * @param aPriority the priority of this work order
	 * @param aDescription the description of this work order
	 */
	public WorkOrder(int aPriority, String aDescription)
	{
		this.priority = aPriority;
		this.description = aDescription;
	}
	
	// Methods
	/**
	 * Returns the string representation of this object
	 */
	public String toString()
	{
		return this.getClass().getName() + "[priority=" + this.priority + "][" + "description=" + this.description + "]";
	}
	
	/**
	 * Compares two WorkOrder objects by their priority
	 * @param otherObject the other work order
	 * @return -1 if the priority of the other work order is
	 * greater than this one, 1 if this work orders priority
	 * is more than the other work order, or 0 if both priorities
	 * are equal
	 */
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

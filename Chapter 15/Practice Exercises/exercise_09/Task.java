package exercise_09;

/**
 * Implement a to do list. Tasks have a priority between 1 and 9, and a description. When the user enters the
 * command add(priority, description), the program adds a new task. When the user enters next, the program removes
 * and prints the most urgent task. The quit command quits the program. Use a priority queue in your solution.
 * 
 * @author Mayuresh
 *
 */
public class Task implements Comparable<Task>
{
	// Instance Variables
	private String description;
	private int priority;
	
	// Constructors
	/**
	 * Constructs a task with a description and a priority
	 * @param description the description of the task
	 * @param priority the priority value
	 */
	public Task(String description, int priority)
	{
		this.description = description;
		this.priority = priority;
	}
	
	// Methods
	/**
	 * Gets the description of this task
	 * @return the description
	 */
	public String getDescription()
	{
		return this.description;
	}
	
	/**
	 * Sets the description of this task
	 * @param description the description
	 */
	public void setDescrption(String description)
	{
		this.description = description;
	}
	
	/**
	 * Gets the priority of this task
	 * @return the priority
	 */
	public int getPriority()
	{
		return this.priority;
	}
	
	/**
	 * Sets the priority of this task
	 * @param priority the priority
	 */
	public void setPriority(int priority)
	{
		this.priority = priority;
	}

	@Override
	public int compareTo(Task otherTask)
	{
		if(this.priority < otherTask.priority)
		{
			return -1;
		}
		else if(this.priority > otherTask.priority)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Returns the string representation of an object of this class
	 */
	public String toString()
	{
		return this.getClass().getName() + "[description=" + this.description + "][priority=" + this.priority + "]";
	}
}

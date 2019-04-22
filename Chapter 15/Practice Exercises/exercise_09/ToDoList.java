package exercise_09;

import java.util.PriorityQueue;

public class ToDoList
{
	// Instance Variables
	private PriorityQueue<Task> tasks;
	
	// Constructors
	/**
	 * Constructs an empty to do list
	 */
	public ToDoList()
	{
		tasks = new PriorityQueue<Task>();
	}
	
	// Methods
	/**
	 * Gets the list of tasks
	 * @return the list of tasks
	 */
	public PriorityQueue<Task> getTasks()
	{
		return this.tasks;
	}
	
	/**
	 * Adds a task to the to do list
	 * @param priority the priority for this task
	 * @param description the description of this task
	 */
	public void addTask(int priority, String description)
	{
		Task newTask = new Task(description, priority);
		this.tasks.add(newTask);
	}
	
	/**
	 * Adds a new task to the to do list
	 * @param task the new task
	 */
	public void addTask(Task task)
	{
		this.tasks.add(task);
	}
	
	/**
	 * Removes the next task based on priority
	 */
	public void removeTask()
	{
		this.tasks.remove();
	}
	
	/**
	 * Removes a given task
	 * @param t the task to remove
	 */
	public void removeTask(Task t)
	{
		this.tasks.remove(t);
	}
	
	/**
	 * Looks at and returns the next task
	 * @return the next task
	 */
	public Task peekTask()
	{
		return this.tasks.peek();
	}
}

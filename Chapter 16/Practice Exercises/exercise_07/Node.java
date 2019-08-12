package exercise_07;

public class Node
{
	// Instance Variables
	private Object data;
	private Node next;
	
	// Constructors
	
	// Methods
	/**
	 * Returns the data in this node
	 * @return data
	 */
	public Object getData()
	{
		return this.data;
	}
	
	/**
	 * Sets the data for this node
	 * @param data the value to set
	 */
	public void setData(Object data)
	{
		this.data = data;
	}
	
	/**
	 * Gets the next node
	 * @return the next node
	 */
	public Node getNextNode()
	{
		return this.next;
	}
	
	/**
	 * Sets the next node
	 * @param next the node to set
	 */
	public void setNextNode(Node next)
	{
		this.next = next;
	}
}
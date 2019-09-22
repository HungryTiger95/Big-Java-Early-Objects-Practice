package exercise_07;

public class Node
{
	// Instance Variables
	private Object data;
	private Node next;
	
	// Constructors
	
	// Methods
	public Object getData()
	{
		return this.data;
	}
	
	public void setData(Object data)
	{
		this.data = data;
	}
	
	public Node getNextNode()
	{
		return this.next;
	}
	
	public void setNextNode(Node next)
	{
		this.next = next;
	}
}

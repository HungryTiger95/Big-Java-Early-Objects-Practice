
public class Choice
{
	// Instance Variables
	private Door choiceDoor = new Door();
	
	// Constructors
	/**
	 * Creates an object Choice with a given door
	 * @param door
	 */
	public Choice(Door door)
	{
		this.choiceDoor = door;
	}
	
	/**
	 * Creates an object Choice
	 */
	public Choice()
	{
		
	}
	// Methods
	/**
	 * Gets the door name
	 * @return name
	 */
	public String getChoiceName()
	{
		return this.choiceDoor.getDoorName();
	}
	
	/**
	 * Gets the door val
	 * @return val
	 */
	public int getChoiceVal()
	{
		return this.choiceDoor.getDoorVal();
	}
	
	/**
	 * Gets the door
	 * @return door
	 */
	public Door getChoiceDoor()
	{
		return this.choiceDoor;
	}
	/**
	 * Sets the door to the choice
	 * @param door door
	 */
	public void setDoor(Door door)
	{
		this.choiceDoor = door;
	}
}


public class Door
{
	// Instance Variables
	private String name;
	private int val;
	
	// Constructors
	/**
	 * Constructs a Door with a given value and name
	 * @param n value 0 or 1
	 * @param doorName string Goat or Car
	 */
	public Door(int n, String doorName)
	{
		this.val = n;
		this.name = doorName;
	}
	
	/**
	 * Constructs a Door with a given value
	 * @param n value of the door (0 or 1)
	 */
	public Door(int n)
	{
		this.val = n;
		
		if(val == 0)
		{
			this.name = "Car";
		}
		else
		{
			this.name = "Goat";
		}
	}
	
	/**
	 * Constructs a Door with a given name
	 * @param doorName name of door
	 */
	public Door(String doorName)
	{
		this.name = doorName;
		
		if(doorName == "Goat")
		{
			this.val = 1;
		}
		else
		{
			this.val = 0;
		}
	}
	
	/**
	 * Constructs a Door object
	 */
	public Door()
	{
		this.val = -1;
		this.name = null;
	}
	// Methods
	/**
	 * Sets the name of the door
	 * @param doorName door name
	 */
	public void setName(String doorName)
	{
		this.name = doorName;
		
		if(doorName == "Car")
		{
			this.val = 0;
		}
		else if(doorName == "Goat")
		{
			this.val = 1;
		}
		else
		{
			this.val = -1;
		}
	}
	
	/**
	 * Sets the door val
	 * @param doorVal door val
	 */
	public void setVal(int doorVal)
	{
		this.val = doorVal;
		
		if(this.val == 0)
		{
			this.name = "Car";
		}
		else if(this.val == 1)
		{
			this.name = "Goat";
		}
		else
		{
			this.name = null;
		}
	}
	
	/**
	 * Gets the door name
	 * @return door name
	 */
	public String getDoorName()
	{
		return name;
	}
	
	/**
	 * Gets the door val
	 * @return door val
	 */
	public int getDoorVal()
	{
		return val;
	}
}

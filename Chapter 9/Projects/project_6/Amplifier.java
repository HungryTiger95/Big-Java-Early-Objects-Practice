package project_6;

public class Amplifier
{
	// Instance Variables
	private String description;
	private double gain;
	
	// Constructors
	/**
	 * Constructs an amplifier object
	 */
	public Amplifier()
	{
		setDescription("Amplifier");
	}
	
	// Methods
	/**
	 * Gets the gain for this amplifier
	 * @return the gain constant
	 */
	public double getGain()
	{
		return this.gain;
	}
	
	/**
	 * Sets the gain for this amplifier
	 * @param gain
	 */
	public void setGain(double gain)
	{
		this.gain = gain;
	}
	
	/**
	 * Calculates the gain for this amplifier
	 */
	public void calculateGain()
	{
		this.gain = 1;
	}
	
	/**
	 * Gets the description of this amplifier
	 * @return the description
	 */
	public String getDescription()
	{
		return this.description;
	}
	
	/**
	 * Sets the description for this amplifier
	 * @param description
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
}

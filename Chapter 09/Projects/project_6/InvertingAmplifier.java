package project_6;

public class InvertingAmplifier extends Amplifier
{
	// Instance Variables
	private double resistance1;
	private double resistance2;
	
	// Constructors
	/**
	 * Constructs an inverting amplifier given two resistances
	 * @param resistance1 the first resistor
	 * @param resistance2 the second resistor
	 */
	public InvertingAmplifier(double resistance1, double resistance2)
	{
		this.resistance1 = resistance1;
		this.resistance2 = resistance2;
		
		setDescription("Inverting Amplifier\n");
	}
	
	// Methods
	/**
	 * Gets the description of this amplifier
	 */
	public String getDescription()
	{
		return this.getDescription() + "\nResistor 1: " + resistance1 + "\nResistor 2: " + resistance2;
	}
	
	/**
	 * Calculates the gain for this amplifier
	 */
	public void calculateGain()
	{
		setGain(-(resistance2 / resistance1));
	}
	
	/**
	 * Gets the first resistance for this amplifier
	 * @return the first resistance
	 */
	public double getResistance1()
	{
		return this.resistance1;
	}
	
	/**
	 * Gets the second resistance for this amplifier
	 * @return the second resistance
	 */
	public double getResistance2()
	{
		return this.resistance2;
	}
}

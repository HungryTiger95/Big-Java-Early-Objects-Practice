package project_4;

public class SeriesResonantCircuit extends ResonantCircuit
{
	// Instance Variables
	private double resistance;
	private double capacity;
	private double inductance;
	
	// Constructors
	/**
	 * Constructs a series resonant circuit
	 */
	public SeriesResonantCircuit()
	{
		super();
	}
	
	/**
	 * Constructs a series resonant circuit with given resistance, capacity, and inductance
	 * @param resonantFrequency resonant frequency in Hertz
	 * @param bandwidth bandwidth in Hertz
	 * @param gainAtResonantFrequency gain in volts
	 */
	public SeriesResonantCircuit(double resonantFrequency, double bandwidth, double gainAtResonanceFrequency)
	{
		super(resonantFrequency, bandwidth, gainAtResonanceFrequency);
	}
	
	// Methods
	/**
	 * Gets the resistance
	 * @return the resistance in Ohm
	 */
	public double getResistance()
	{
		return this.resistance;
	}
	
	/**
	 * Sets the resistance
	 * @param resistance the resistance in Ohm
	 */
	public void setResistance(double resistance)
	{
		this.resistance = resistance;
	}
	
	/**
	 * Gets the capacity
	 * @return the capacity in microFaraday
	 */
	public double getCapacity()
	{
		return this.capacity;
	}
	
	/**
	 * Sets the capacity
	 * @param capacity the capacity in microFaraday
	 */
	public void setCapacity(double capacity)
	{
		this.capacity = capacity;
	}
	
	/**
	 * Gets the inductance
	 * @return the inductance in Henry
	 */
	public double getInductance()
	{
		return this.inductance;
	}
	
	/**
	 * Sets the inductance
	 * @param inductance inductance in Henry
	 */
	public void setInductance(double inductance)
	{
		this.inductance = inductance;
	}
	
	/**
	 * Designs the circuit and sets the values for the resistance, capacity, and inductance
	 */
	public void designCircuit()
	{
		double resCalc = 1.0 / super.getGainAtResonantFrequency();
		double inducCalc = resCalc / super.getBandwidth();
		double capaCalc = 1.0 / (Math.pow(super.getResonantFrequency(), 2) * inducCalc);
		
		setResistance(resCalc);
		setInductance(inducCalc);
		setCapacity(capaCalc);
	}
	
	public void display()
	{
		super.display();
		
		System.out.printf("Resistance: %.4f\nCapacity: %.4f\nInductance: %.4f\n\n", getResistance(), getCapacity(), getInductance());
	}
}

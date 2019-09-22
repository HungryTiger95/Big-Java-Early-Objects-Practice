package project_4;

public class ResonantCircuit
{
	// Instance Variables
	private double resonantFrequency;
	private double bandwidth;
	private double gainAtResonantFrequency;
	
	// Constructors
	/**
	 * Constructs a resonant circuit
	 */
	public ResonantCircuit()
	{
		
	}
	
	/**
	 * Constructs a resonant circuit with given values of resonant frequency, bandwidth, and gain at the resonant frequency
	 * @param resonantFrequency resonant frequency in Hertz
	 * @param bandwidth bandwidth in Hertz
	 * @param gainAtResonantFrequency gain in volts
	 */
	public ResonantCircuit(double resonantFrequency, double bandwidth, double gainAtResonantFrequency)
	{
		this.resonantFrequency = resonantFrequency;
		this.bandwidth = bandwidth;
		this.gainAtResonantFrequency = gainAtResonantFrequency;
	}
	// Methods
	/**
	 * Gets the resonant frequency
	 * @return resonant frequency in Hertz
	 */
	public double getResonantFrequency()
	{
		return this.resonantFrequency;
	}
	
	/**
	 * Sets the resonant frequency
	 * @param frequency frequency in Hertz
	 */
	public void setResonantFrequency(double frequency)
	{
		this.resonantFrequency = frequency;
	}
	
	/**
	 * Gets the bandwidth
	 * @return bandwidth in Hertz
	 */
	public double getBandwidth()
	{
		return this.bandwidth;
	}
	
	/**
	 * Sets the bandwidth
	 * @param bandwidth bandwidth in Hertz
	 */
	public void setBandwidth(double bandwidth)
	{
		this.bandwidth = bandwidth;
	}
	
	/**
	 * Gets the gain at the resonant frequency
	 * @return gain at the resonant frequency in voltage
	 */
	public double getGainAtResonantFrequency()
	{
		return this.gainAtResonantFrequency;
	}
	
	/**
	 * Sets the gain at the resonant frequency
	 * @param gain gain at the resonant frequency in voltage
	 */
	public void setGainAtResonantFrequency(double gain)
	{
		this.gainAtResonantFrequency = gain;
	}
	
	/**
	 * Displays the description of the resonant frequency response
	 */
	public void display()
	{
		System.out.printf("Resonance Frequency: %.4f\nBandwidth: %.4f\nGain at Rf: %.4f\n", getResonantFrequency(), getBandwidth(), getGainAtResonantFrequency());
	}
}

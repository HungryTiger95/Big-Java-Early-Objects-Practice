
/**
 * P5.4
 * 
 * Write a unit conversion program that asks the users from which
 * unit they want to convert (fl. oz, gal, oz, lb, in, ft, mi) and to which unit they want
 * to convert (ml, l, g, kg, mm, cm, m km). Reject incompatible conversions (such as gal > km).
 * Ask for the value to be converted, then display the result.
 * 
 * @author Mayuresh
 *
 */
public class UnitConversion
{
	// Instance Variables
	private String from, to;
	private double value;
	
	// Constructors
	/**
	 * Creates an UnitConversion object
	 */
	public UnitConversion()
	{
		this.from = "";
		this.to = "";
		this.value = 0;
	}
	
	/**
	 * Creates a UnitConversion object with given units to convert to and from and the value
	 * @param from unit to convert from
	 * @param to unit to convert to
	 * @param value value to convert
	 */
	public UnitConversion(String from, String to, double value)
	{
		this.from = from;
		this.to = to;
		this.value = value;
	}
	// Methods
	/**
	 * Sets what to convert from
	 * @param from convert from
	 */
	public void setConvertFrom(String from)
	{
		this.from = from;
	}
	
	/**
	 * Sets what to convert to
	 * @param to convert to
	 */
	public void setConvertTo(String to)
	{
		this.to = to;
	}
	
	/**
	 * Sets value
	 * @param value value
	 */
	public void setValue(double value)
	{
		this.value = value;
	}
	
	/**
	 * Converts a unit to another unit
	 * @param from unit to convert from
	 * @param to unit to convert to
	 * @param value value to be converted
	 * @return converted value
	 */
	public double convert(String from, String to, double value)
	{
		// Convert from fluid oz
		if(from.equals("fl. oz"))
		{
			// Convert to
			if(to.equals("mL"))
			{
				return value * 29.5735;
			}
			else if(to.equals("gal"))
			{
				return value * .0078125;
			}
			else if(to.equals("quart"))
			{
				return value * .03125;
			}
			else if(to.equals("pint"))
			{
				return value * .0625;
			}
			else if(to.equals("L"))
			{
				return value * .0295735;
			}
			else
			{
				System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
				return 0;
			}
		}
		
		// Convert from gallons
		else if(from.equals("gal"))
		{
			if(to.equals("quart"))
			{
				return value * 4;
			}
			else if(to.equals("pint"))
			{
				return value * 8;
			}
			else if(to.equals("fl. oz"))
			{
				return value * 128;
			}
			else if(to.equals("L"))
			{
				return value * 3.78541;
			}
			else if(to.equals("mL"))
			{
				return value * 3785.41;
			}
			else
			{
				System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
				return 0;
			}
		}
		
		// Convert from oz
		else if(from.equals("oz"))
		{
			if(to.equals("lb"))
			{
				return value * .0625;
			}
			else if(to.equals("mg"))
			{
				return value * 28349.5;
			}
			else if(to.equals("g"))
			{
				return value * 28.3495;
			}
			else if(to.equals("kg"))
			{
				return value = .0283495;
			}
			else
			{
				System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
				return 0;
			}
		}
		
		// Convert from pound
		else if(from.equals("lb"))
		{
			if(to.equals("kg"))
			{
				return value * .453592;
			}
			else if(to.equals("g"))
			{
				return value * 453.592;
			}
			else if(to.equals("mg"))
			{
				return value * 453592;
			}
			else if(to.equals("oz"))
			{
				return value * 16;
			}
			else
			{
				System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
				return 0;
			}
		}
		
		// Convert from inches
		else if(from.equals("in"))
		{
			if(to.equals("km"))
			{
				return value * 2.45E-5;
			}
			else if(to.equals("m"))
			{
				return value * .0254;
			}
			else if(to.equals("cm"))
			{
				return value * 2.54;
			}
			else if(to.equals("mm"))
			{
				return value * 25.4;
			}
			else if(to.equals("mi"))
			{
				return value * 1.5783E-5;
			}
			else if(to.equals("yd"))
			{
				return value * .0277778;
			}
			else if(to.equals("ft"))
			{
				return value * .0833333;
			}
			else
			{
				System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
				return 0;
			}
		}
		
		// Convert from feet
		else if(from.equals("ft"))
		{
			if(to.equals("km"))
			{
				return value * 3.048E-4;
			}
			else if(to.equals("m"))
			{
				return value * .3048;
			}
			else if(to.equals("cm"))
			{
				return value * 30.48;
			}
			else if(to.equals("mm"))
			{
				return value * 304.8;
			}
			else if(to.equals("mi"))
			{
				return value * 1.89394E-4;
			}
			else if(to.equals("yd"))
			{
				return value * .333333;
			}
			else if(to.equals("in"))
			{
				return value * 12;
			}
			else
			{
				System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
				return 0;
			}
		}
		
		// Convert from mile
		else if(from.equals("mi"))
		{
			if(to.equals("km"))
			{
				return value * 1.60934;
			}
			else if(to.equals("m"))
			{
				return value * 1609.34;
			}
			else if(to.equals("cm"))
			{
				return value * 160934;
			}
			else if(to.equals("mm"))
			{
				return value * 1609E6;
			}
			else if(to.equals("yd"))
			{
				return value * 1760;
			}
			else if(to.equals("ft"))
			{
				return value * 5280;
			}
			else if(to.equals("in"))
			{
				return value * 63360;
			}
			else
			{
				System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
				return 0;
			}
		}
		
		// From Conversion is wrong
		else
		{
			System.out.println("Wrong From input:");
			return 0;
		}
	}
}

import java.util.Scanner;

/**
 * E5.10 / E5.11 / E5.12
 * 
 * Write a program that reads a temperature value and the letter C for Celsius or F for Fahrenheit.
 * Print whether water is liquid, solid, or gaseous at the given temperature at sea level.
 * 
 * The boiling point of water drops by about one degree centigrade for every 300 meters (1,000 ft)
 * of altitude. Improve the program to allow the user to supply the altitude in meters or feet.
 * 
 * Add error handling. If the user does not enter a number when expected, or provides and ivalid
 * unit for the altitude, print an error message and end the program.
 * 
 * @author Mayuresh
 *
 */

public class LiquidSolidGas
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		int altitudeVal, numIndex;
		String unit, altitude, altitudeUnit;
		double temp, deltaTemp;
		
		System.out.print("Enter the Altitude in Feet or Meters: ");
		altitude = in.nextLine();
		
		System.out.print("Please Enter a Temperature: ");
		temp = in.nextDouble();
		
		System.out.print("Enter C for Celsius, F for Fahrenheit: ");
		unit = in.next();
		
		in.close();
		
		numIndex = altitude.indexOf(" ");												// Gets the index where numbers end in the altitude input
		altitudeUnit = altitude.substring(numIndex, altitude.length());					// Gets the unit of the altitude
		altitude = altitude.substring(0, numIndex);										// Gets the value of the altitude
		altitudeVal = Integer.parseInt(altitude);										// Turns the string of altitude into an int
		
		if(altitudeVal == 0)															// Instructions for when altitude is 0 (sea level)
		{
			if(unit.contains("C") || unit.contains("c"))
			{
				if(temp <= 0)
				{
					System.out.println("solid");
				}
				else if(temp > 0 && temp < 100)
				{
					System.out.println("liquid");
				}
				else if(temp >= 100)
				{
					System.out.println("gas");
				}
				else
				{
					System.out.println("invalid temperature");
				}
			}
			else if(unit.contains("F") || unit.contains("f"))
			{
				if(temp <= 32)
				{
					System.out.println("solid");
				}
				else if(temp > 32 && temp < 212)
				{
					System.out.println("liquid");
				}
				else if(temp >= 212)
				{
					System.out.println("gas");
				}
				else
				{
					System.out.println("invalid temperature");
				}
			}
			else
			{
				System.out.println("Invalid Units");
			}
		}
		else if (altitudeVal != 0)														// Instructions for when altitude is not 0
		{
			if (altitudeUnit.contains("feet") || altitudeUnit.contains("ft"))
			{
				if(unit.contains("C") || unit.contains("c"))
				{
					deltaTemp = altitudeVal / 1000.0;
					
					System.out.println("Old Temp: " + temp);
					System.out.println("Change in Temp: " + deltaTemp);
					
					temp = temp - deltaTemp;
					
					System.out.println("New Temp: " + temp);
					
					if(temp <= 0)
					{
						System.out.println("solid");
					}
					else if(temp > 0 && temp < 100)
					{
						System.out.println("liquid");
					}
					else if(temp >= 100)
					{
						System.out.println("gas");
					}
					else
					{
						System.out.println("invalid temperature");
					}
				}
				else if(unit.contains("F") || unit.contains("f"))
				{
					deltaTemp = altitudeVal / 1000.0;
					deltaTemp = deltaTemp * 1.8;
					
					System.out.println("Old Temp: " + temp);
					System.out.println("Change in Temp: " + deltaTemp);
					
					temp = temp - deltaTemp;
					
					System.out.println("New Temp: " + temp);
					
					if(temp <= 32)
					{
						System.out.println("solid");
					}
					else if(temp > 32 && temp < 212)
					{
						System.out.println("liquid");
					}
					else if(temp >= 212)
					{
						System.out.println("gas");
					}
					else
					{
						System.out.println("invalid temperature");
					}
				}
			}
			else if(altitudeUnit.contains("meters") || altitudeUnit.contains("m"))
			{
				if(unit.contains("C") || unit.contains("c"))
				{
					deltaTemp = altitudeVal / 300.0;
					
					System.out.println("Old Temp: " + temp);
					System.out.println("Change in Temp: " + deltaTemp);
					
					temp = temp - deltaTemp;
					
					System.out.println("New Temp: " + temp);
					
					if(temp <= 0)
					{
						System.out.println("solid");
					}
					else if(temp > 0 && temp < 100)
					{
						System.out.println("liquid");
					}
					else if(temp >= 100)
					{
						System.out.println("gas");
					}
					else
					{
						System.out.println("invalid temperature");
					}
				}
				else if(unit.contains("F") || unit.contains("f"))
				{
					deltaTemp = altitudeVal / 300.0;
					deltaTemp = deltaTemp * 1.8;
					
					System.out.println("Old Temp: " + temp);
					System.out.println("Change in Temp: " + deltaTemp);
					
					temp = temp - deltaTemp;
					
					System.out.println("New Temp: " + temp);
					
					if(temp <= 32)
					{
						System.out.println("solid");
					}
					else if(temp > 32 && temp < 212)
					{
						System.out.println("liquid");
					}
					else if(temp >= 212)
					{
						System.out.println("gas");
					}
					else
					{
						System.out.println("invalid temperature");
					}
				}
			}
			else
			{
				return;
			}
		}
	}

}

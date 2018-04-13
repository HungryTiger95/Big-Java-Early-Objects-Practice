import java.util.Scanner;

/**
 * Science P5.11/ P5.12/ P5.13
 * 
 * Write a program that prompts the user for a wavelength value and prints a
 * description of the corresponding part of the electromagnetic spectrum:
 * 
 * 	   +--------------------------------------------------------------------------------------+
 * 	   |	Type				|	Wavelength (m)				|		Frequency (HZ)		  |
 * 	   +--------------------------------------------------------------------------------------+
 * 	   |	Radio Waves			|		> 1E-1					|			<3E9			  |
 *     |	Microwaves			|     1E-3 - 1E-1				|		3E9 - 3E11			  |
 *     |	Infrared			|	  7E-7 - 1E-3				|		3E11 - 4E14			  |
 *     |	Visible Light		|	  4E-7 to 7E-7				|       4E14 - 7.5E14		  |
 *     |	Ultraviolet			|	  1E-8 - 4E-7				|       7.5E14 - 3E16		  |
 *     |	X-Rays				|     1E-11 - 1E-8				|		3E16 -3E19			  |
 *     |	Gamma Rays			|     < 1E-11					|		> 3E19				  |
 *     +--------------------------------------------------------------------------------------+
 * 
 * Modify the program so that it prompts for the frequency instead.
 * 
 * Modify the program so that it first asks the user whether the input will be a wavelength or a frequency
 * 
 * @author Mayuresh
 *
 */
public class Wavelength
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Frequency[1] or Wavelength[2]: ");
		int input = in.nextInt();
		long queryValF = 0;
		double queryValW = 0;
		
		if(input == 1)
		{
			System.out.print("Enter Frequency: ");
			queryValF = in.nextLong();
		}
		else if(input == 2)
		{
			System.out.print("Enter Wavelength: ");
			queryValW = in.nextDouble();
		}
		else
		{
			System.out.println("Wrong Input");
		}
		
		in.close();
		
		// Ask for input in wavelength or frequency
		if(input == 1)
		{
			if(queryValF > 3E19)
			{
				System.out.println("Gamma Rays\nWavelength: < 1.0 X 10^-11\nFreqency: > 3.0 X 10^19\n");
			}
			else if(queryValF > 3E16)
			{
				System.out.println("X-Rays\nWavelength: < 1.0 X 10^-8\nFreqency: > 3.0 X 10^16\n");
			}
			else if(queryValF > 7.5E14)
			{
				System.out.println("UltraViolet\nWavelength: < 4.0 X 10^-7\nFreqency: > 7.5 X 10^14\n");
			}
			else if(queryValF > 4E14)
			{
				System.out.println("Visible Light\nWavelength: < 7.0 X 10^-7\nFreqency: > 4.0 X 10^14\n");
			}
			else if(queryValF > 3E11)
			{
				System.out.println("Infrared\nWavelength: < 1.0 X 10^-3\nFreqency: > 3.0 X 10^11\n");
			}
			else if(queryValF > 3E9)
			{
				System.out.println("Microwaves\nWavelength: < 1.0 X 10^-1\nFreqency: > 3.0 X 10^9\n");
			}
			else if(queryValF > 0)
			{
				System.out.println("Radio Waves\nWavelength: < 0\nFreqency: > 0\n");
			}
			else
			{
				System.out.println("Frequency cannot be less than 0");
			}
		}
		else if(input == 2)
		{
			if(queryValW < 0.00000000001)
			{
				System.out.println("Gamma Rays\nWavelength: < 1.0 X 10^-11\nFreqency: > 3.0 X 10^19\n");
			}
			else if(queryValW < 0.00000001)
			{
				System.out.println("X-Rays\nWavelength: < 1.0 X 10^-8\nFreqency: > 3.0 X 10^16\n");
			}
			else if(queryValW < 0.0000004)
			{
				System.out.println("UltraViolet\nWavelength: < 4.0 X 10^-7\nFreqency: > 7.5 X 10^14\n");
			}
			else if(queryValW < 0.0000007)
			{
				System.out.println("Visible Light\nWavelength: < 7.0 X 10^-7\nFreqency: > 4.0 X 10^14\n");
			}
			else if(queryValW < 0.001)
			{
				System.out.println("Infrared\nWavelength: < 1.0 X 10^-3\nFreqency: > 3.0 X 10^11\n");
			}
			else if(queryValW < .1)
			{
				System.out.println("Microwaves\nWavelength: < 1.0 X 10^-1\nFreqency: > 3.0 X 10^9\n");
			}
			else if(queryValW < 1)
			{
				System.out.println("Radio Waves\nWavelength: < 0\nFreqency: > 0\n");
			}
			else
			{
				System.out.println("Wavelength cannot be more than 0");
			}
		}
		else
		{
			System.out.println("You entered the wrong input");
		}
	}
}

package project3;

import java.util.ArrayList;

/**
 * The encoding scheme for a five-digit ZIP code is shown in Figure 8. There are
 * full-height frame bars on each side. The five encoded digits are followed by
 * a check digit, which is computed as follows:
 * 
 * Add up all digits, and choose the check digit to make the sum a multiple of 10.
 * 
 * For example, the sum of the digits in the ZIP code 95014 is 19, so the check digit
 * is 1 to make the sum equal to 20.
 * 
 * Each digit of the ZIP code, and the check digit, is encoded according to the table at
 * the right, where 0 denotes a half bar and 1 a full bar. Note that they represent all
 * combinations two full bars and three half bars. The digit can be computed easily from
 * the bar code using the column weights 7, 4, 2, 1, 0.
 * 
 * For example, 01100 is:
 * 
 * 		0 * 7 + 1 * 4 + 1 + 2 + 0 * 1 + 0 * 0 = 6
 * 
 * The only exception is 0, which would yield 11.
 * 
 * Write a program whtat asks for the user for a ZIP code and prints the bar code. Use : for half
 * bars, | for full bars. For example, 95014 becomes
 * 
 * 		||:|:::|:|:||::::::||:|::|:::|||
 * 
 * @author Mayuresh
 *
 */
public class BarcodeForm
{
	// Instance Variables
	private int zipCode;
	private int checkDigit;
	private String convertedCode = "";

	private ArrayList<Integer> digits = new ArrayList<Integer>();
	
	// Constructors
	/**
	 * Constructs a BarcodeForm object with a given zip code
	 * @param zipCode zip code
	 */
	public BarcodeForm(int zipCode)
	{
		this.zipCode = zipCode;
	}
	
	// Methods
	/**
	 * Sets a check digit for this zip code
	 * @param digit check digit
	 */
	public void setCheckDigit(int digit)
	{
		this.checkDigit = digit;
		digits.add(digit);
	}
	
	/**
	 * Calculates and sets the check digit based on the zipcode
	 */
	public void setCheckDigit()
	{
		int digit =  10 - getZipCodeSum() % 10;
		digits.add(5, digit);
	}
	/**
	 * Gets all the digits in the array
	 * @return all digits saved
	 */
	public ArrayList<Integer> getAllDigits()
	{
		return digits;
	}
	
	/**
	 * Gets the zipcode
	 * @return zipcode
	 */
	public int getZipCode()
	{
		return zipCode;
	}
	
	/**
	 * Gets the sum of the digits of the zip code
	 * @return sum of digits
	 */
	public int getZipCodeSum()
	{
		// Converts the zipcode integer to a string
		String value = String.valueOf(zipCode);
		
		// Takes each element in the string zipcode and converts it to a single digit
		// and adds it to an array which holds all the digits of the zipcode
		for(int i = 0; i < value.length(); i++)
		{
			int num = Character.getNumericValue(value.charAt(i));
			
			digits.add(num);
		}
		
		// Gets the sum of the zipcode
		int sum = 0;
		for(int i = 0; i < digits.size(); i++)
		{
			sum = sum + digits.get(i);
		}
		
		return sum;
	}
	
	/**
	 * Gets the check digit for this zipcode
	 */
	public int getCheckDigit()
	{	
		return digits.get(digits.size() - 1);
	}
	
	/**
	 * Converts a digit of the zipcode into barcode
	 * @param i integer to be converted
	 * @return specific code for the digit
	 */
	public String getDigitCode(int i)
	{
		if(i == 0)
		{
			return "||:::";
		}
		else if(i == 1)
		{
			return ":::||";
		}
		else if(i == 2)
		{
			return "::|:|";
		}
		else if(i == 3)
		{
			return "::||:";
		}
		else if(i == 4)
		{
			return ":|::|";
		}
		else if(i == 5)
		{
			return ":|:|:";
		}
		else if(i == 6)
		{
			return ":||::";
		}
		else if(i == 7)
		{
			return "|:::|";
		}
		else if(i == 8)
		{
			return "|::|:";
		}
		else if(i == 9)
		{
			return "|:|::";
		}
		else
		{
			return "ERROR: INT";
		}
	}
	
	/**
	 * Gets the full barcode
	 * @return completed barcode
	 */
	public String getFullCode()
	{
		convertedCode = convertedCode + "|";
		for(int i = 0; i < digits.size(); i++)
		{
			convertedCode = convertedCode + getDigitCode(digits.get(i));
		}
		convertedCode = convertedCode + "|";
		return convertedCode;
	}
}

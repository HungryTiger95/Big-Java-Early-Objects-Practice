package exercise_1;

import java.util.Scanner;

/**
 * Add a class NumericQuestion to the question hierarchy of Section 9.1. If the response
 * and the expected answer differ by no more than 0.01, then accept the response as
 * correct.
 * 
 * @author Mayuresh
 *
 */

public class NumericalQuestion extends Question
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Checks the response and returns true if the response matches the correct response
	 * and does not differ by more than 0.01
	 * @param the response to be checked against the actual response
	 */
	public boolean checkAnswer(String response)
	{
		// Compute the absolute value of the difference between the actual answer and the given answer
		double endResult = Math.abs(Double.valueOf(response) - Double.valueOf(super.getAnswer()));
		
		if(endResult <= 0.01)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

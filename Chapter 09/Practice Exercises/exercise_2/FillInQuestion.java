package exercise_2;

import java.util.Scanner;

/**
 * Add a class FillInQuestion to the question hierarchy. Such as question is constructed with a string that contains
 * the answer, surrounded by ___.
 * 
 * 		The question should be displayed as "The inventor of Java was _____.
 * 
 * @author Mayuresh
 *
 */

public class FillInQuestion extends Question
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	public void setText(String questionText)
	{
		super.setText(questionText + " ________");	
	}
}

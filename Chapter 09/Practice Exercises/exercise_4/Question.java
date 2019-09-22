package exercise_4;

import java.util.Scanner;

/**
 * A Question with a text
 * 
 * Add a class AnyCorrectChoiceQuestion to the question hierarchy of Section 9.1 that allows
 * multiple correct choices. The respondent should provide any one of the correct choices.
 * The answer string should contain all of the choices separated by spaces. Provide instructions
 * in the question text.
 * 
 * @author Mayuresh
 *
 */
public class Question
{
	// Instance Variables
	private String text;
	private String answer;
	
	// Constructors
	/**
	 * Constructs a question with empty question and answer
	 */
	public Question()
	{
		text = "";
		answer = "";
	}
	
	/**
	 * Constructs a question object with a given question text
	 * @param questionText question text
	 */
	public Question(String questionText)
	{
		this.text = questionText;
		this.answer = "";
	}
	
	// Methods
	/**
	 * Sets the correct answer for the question
	 * @param correctResponse the answer
	 */
	public void setAnswer(String correctResponse)
	{
		this.answer = correctResponse;
	}
	
	/**
	 * Gets the answer text
	 * @return the answer
	 */
	public String getAnswer()
	{
		return this.answer;
	}
	
	/**
	 * Sets the question text
	 * @param questionText the text to set as the question text
	 */
	public void setText(String questionText)
	{
		this.text = questionText;
	}
	
	/**
	 * Gets the text of this question
	 * @return the text of this question
	 */
	public String getText()
	{
		return this.text;
	}
	
	/**
	 * Checks if the response is correct
	 * @param response the given response
	 * @return true if the response is correct, false if response is incorrect
	 */
	public boolean checkAnswer(String response)
	{
		return response.equalsIgnoreCase(answer);
	}
	
	/**
	 * Displays the question
	 */
	public void display()
	{
		System.out.println(text);
	}
	
	/**
	 * Presents the question, asks for an input, and checks whether the 
	 * answer is correct or not
	 */
	public void presentQuestion()
	{
		Scanner in = new Scanner(System.in);
		
		this.display();
		
		System.out.print("Your Answer: ");
		String response = in.nextLine();
		
		System.out.println(this.checkAnswer(response));
	}
	
	/**
	 * Returns the String representation of this object
	 */
	public String toString()
	{
		return getClass().getName();
	}
}

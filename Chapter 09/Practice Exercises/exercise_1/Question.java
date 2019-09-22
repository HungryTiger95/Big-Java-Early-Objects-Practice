package exercise_1;

import java.util.Scanner;

/**
 * A question with a text as the question and answer
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
		this.text = "";
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
	 * Checks if the response is correct
	 * @param response the given response
	 * @return true if the response is correct, false if response is incorrect
	 */
	public boolean checkAnswer(String response)
	{
		return response.equals(answer);
	}
	
	/**
	 * Displays the question
	 */
	public void display()
	{
		System.out.println(text);
	}
	
	/**
	 * Sets the question text
	 * @param string the question to be asked
	 */
	public void setText(String questionText)
	{
		this.text = questionText;	
	}
	
	/**
	 * Presents the question and asks for an input
	 */
	public void presentQuestion()
	{
		Scanner in = new Scanner(System.in);
		
		this.display();
		
		System.out.print("Your Answer: ");
		String response = in.nextLine();
		
		System.out.println(this.checkAnswer(response));
	}
}

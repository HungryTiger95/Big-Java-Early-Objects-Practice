package exercise_3;

import java.util.Scanner;

/**
 * A Question with a text
 * 
 * Modify the checkAnswer method so that it does not take into account different
 * spaces or upper/lowercase characters. For example, the response "JAMES gosling"
 * should match an answer of "James Gosling".
 * 
 * This can be easily done by knowing that the String class has a method equalsIgnoreCase(String other).
 * Otherwise, you can basically rewrite the code by changing the response string and the answer string
 * to lowercase and comparing them that way. The equalsIgnoreCase(String other) method does this the
 * same way.
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
	 * Sets the question text
	 * @param string the question to be asked
	 */
	public void setText(String questionText)
	{
		this.text = questionText;	
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
}

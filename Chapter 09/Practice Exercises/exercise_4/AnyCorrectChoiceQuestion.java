package exercise_4;

import java.util.ArrayList;

import exercise_1.ChoiceQuestion;

public class AnyCorrectChoiceQuestion extends ChoiceQuestion
{
	// Instance Variables
	
	// Constructors
	/**
	 * Constructs a AnyCorrectChoiceQuestion object using superclass constructors
	 */
	public AnyCorrectChoiceQuestion()
	{
		super();
	}
	
	// Methods
	/**
	 * Sets the answer for this question
	 * @param answer the answer to be set
	 */
	public void setAnswer(String answer)
	{
		String newAnswers = getAnswer();
		
		newAnswers += answer + " ";
		super.setAnswer(newAnswers);
	}
	
	/**
	 * Adds a choice to the question given the choice and whether or not the choice is
	 * the corrrect choice
	 * @param choice the choice to be added
	 * @param correct sets whether or no the choice should be the answer or not
	 */
	public void addChoice(String choice, boolean correct)
	{
		super.setChoice(choice);
		
		if(correct)
		{
			setAnswer(choice);
		}
	}
	
	/**
	 * Checks the answer and returns true if the response is the same as the correct
	 * answer
	 * @param response the response given by the user
	 */
	public boolean checkAnswer(String response)
	{
		return this.getAnswer().trim().toLowerCase().contains(response.trim().toLowerCase());
	}
	
	/**
	 * Displays the question
	 */
	public void display()
	{
		super.display();
		System.out.println("Provide any correct answers\nIf there are more than one, provide them each separated by spaces");
	}
}

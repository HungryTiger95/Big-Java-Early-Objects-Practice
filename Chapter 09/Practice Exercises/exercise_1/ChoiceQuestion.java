package exercise_1;

import java.util.ArrayList;

/**
 * A multiple choice question which extends the Question class
 * 
 * @author Mayuresh
 *
 */
public class ChoiceQuestion extends Question
{
	// Instance Variables
	private ArrayList<String> choices;
	
	// Constructors
	/**
	 * Constructs a choice question with no choices
	 */
	public ChoiceQuestion()
	{
		super();
		choices = new ArrayList<String>();
	}
	
	// Methods
	/**
	 * Gets the array list of the choices for this question
	 * @return the array list of choices
	 */
	public ArrayList<String> getChoices()
	{
		return this.choices;
	}
	
	/**
	 * Sets a choice to the question
	 * @param choice the choice
	 */
	public void setChoice(String choice)
	{
		this.choices.add(choice);
	}
	
	/**
	 * Adds an answer choice to this question
	 * @param choice the choice to add
	 * @param correct true if this is the correct choice, false otherwise
	 */
	public void addChoice(String choice, boolean correct)
	{
		setChoice(choice);
		if (correct)
		{
			setAnswer(choice);
		}
	}
		
	/**
	 * Displays the Question
	 */
	public void display()
	{
		super.display();
		
		for(int i = 0; i < choices.size(); i++)
		{
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));
		}
	}
	
	/**
	 * Gets the string representation of this class
	 */
	public String toString()
	{
		return getClass().getName();
	}
}

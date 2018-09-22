package example2;

import java.util.ArrayList;

public class ChoiceQuestion extends Question
{
	// Instance Variables
	private ArrayList<String> choices;
	
	// Constructors
	/**
	 * Constructs a multiple choice question
	 */
	public ChoiceQuestion()
	{
		choices = new ArrayList<String>();
	}
	
	/**
	 * Constructs a multiple choice question with a given question text
	 * @param questionText question text
	 */
	public ChoiceQuestion(String questionText)
	{
		super(questionText);
		choices = new ArrayList<String>();
	}
	
	// Methods
	/**
	 * Adds a choice to the multiple choice question
	 * @param choice the choice text
	 * @param correct whether or not the choice is the correct answer
	 */
	public void addChoice(String choice, boolean correct)
	{
		choices.add(choice);
		
		if(correct)
		{
			String choiceString = "" + choices.size();
			this.setAnswer(choiceString);
		}
	}
	
	/**
	 * Displays the question
	 * 
	 * Becuase this method name is the exact same as the one from the super class Question,
	 * it is considered to be overriding the method in the super class.
	 * 
	 * Here, super.display is called to use the method from the super class. Then, the rest
	 * of the body specifies how this method is different than the super class method
	 */
	public void display()
	{
		// Display the question text
		super.display();
		
		// Display the answer choices
		for(int i = 0; i < choices.size(); i++)
		{
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));
		}
	}
}

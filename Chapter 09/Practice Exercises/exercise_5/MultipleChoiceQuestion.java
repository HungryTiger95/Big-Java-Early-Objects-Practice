package exercise_5;

/**
 * Add a class MultipleChoiceQuestion to the question hierarchy of Section 9.1 that allows multiple correct
 * choices. the respondent should provide any one of the correct choices. The answer string should contain
 * all of the correct choices, separated by spaces. Provide instructions in the questions text
 * 
 * @author Mayuresh
 *
 */
public class MultipleChoiceQuestion extends ChoiceQuestion
{
	// Instance Variables
	
	// Constructors
	public MultipleChoiceQuestion()
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
		String newAnswer = getAnswer();
		
		newAnswer += answer + " ";
		super.setAnswer(newAnswer);
	}
	
	/**
	 * Adds a choice to the question given the choice and whether or not the choice is
	 * the correct choice
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
	 * Displays the question
	 */
	public void display()
	{
		super.display();
		System.out.println("Provide all correct answers\nIf there are more than one, provide them each separated by spaces");
	}
	
	/**
	 * Checks whether or not the response and the correct answer are equal.
	 * If they are equal it returns true, if not, it returns false
	 * @param response the response provided by the user
	 * @return true if both strings are the same, false if not
	 */
	public boolean checkAnswer(String response)
	{
		return this.getAnswer().trim().toLowerCase().equals(response.trim().toLowerCase());
	}
}

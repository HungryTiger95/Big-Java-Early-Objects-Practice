package example2;

/**
 * A question with a text and answer
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
	 * Constructs a question object without initializing text or correct answer
	 */
	public Question()
	{
		this.text = "";
		this.answer = "";
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
	 * Sets the text for this question
	 * @param text the text of this question
	 */
	public void setText(String text)
	{
		this.text = text;
	}
	
	/**
	 * Sets the answer for this question
	 * @param answer the answer of this question
	 */
	public void setAnswer(String answer)
	{
		this.answer = answer;
	}
	
	/**
	 * Checks a given response against the correct answer
	 * @param response the response to check
	 * @return true if the response is correct, false if not
	 */
	public boolean checkAnswer(String response)
	{
		return response.equals(this.answer);
	}
	
	/**
	 * Displays this question
	 * @return the text of the question
	 */
	public void display()
	{
		System.out.println(this.text);
	}
}

package exercise_10_2;

/**
 * Implement a class Quiz that implements the Measurable interface. A quiz has a score and a letter grade
 * (such as B+). Use the Data class of Exercise E10.1 to process an array of quizzes. Display the average score
 * and the quiz with the highest score (both letter garde and score).
 * 
 * @author Mayuresh
 *
 */
public class Quiz implements Measurable
{
	// Instance Variables
	private double score;
	private String letterGrade;
	
	// Constructors
	/**
	 * Constructs a quiz without a score or letter grade
	 */
	public Quiz()
	{
		
	}
	
	/**
	 * Constructs a quiz with a score and a letter grade
	 * @param quizScore the quiz score
	 * @param quizLetterGrade the letter grade
	 */
	public Quiz(double quizScore, String quizLetterGrade)
	{
		this.score = quizScore;
		this.letterGrade = quizLetterGrade;
	}
	
	// Methods
	/**
	 * Sets the score of the quiz
	 * @param score the score
	 */
	public void setScore(double score)
	{
		this.score = score;
	}
	
	/**
	 * Gets the score of the quiz
	 * @return the score of the quiz
	 */
	public double getScore()
	{
		return this.score;
	}
	
	/**
	 * Sets the letter grade
	 * @param letterGrade the letter grade to be set
	 */
	public void setLetterGrade(String letterGrade)
	{
		this.letterGrade = letterGrade;
	}
	
	/**
	 * Gets the letter grade for this quiz
	 * @return the letter grade
	 */
	public String getLetterGrade()
	{
		return this.letterGrade;
	}
	
	/**
	 * Determines the letter grade representation of the numerical grade
	 * assuming that the score was set
	 */
	public void determineLetterGrade()
	{
		if(this.score > 90)
		{
			this.letterGrade = "A";
		}
		else if(this.score > 85)
		{
			this.letterGrade = "B+";
		}
		else if(this.score > 80)
		{
			this.letterGrade = "B";
		}
		else if(this.score > 75)
		{
			this.letterGrade = "C+";
		}
		else if(this.score > 70)
		{
			this.letterGrade = "C";
		}
		else if(this.score >= 65)
		{
			this.letterGrade = "F+";
		}
		else if(this.score < 65)
		{
			this.letterGrade = "F";
		}
	}
	
	/**
	 * Processes a quiz score. When a score is provided, it sets the score and determines and sets
	 * the letter grade
	 * @param score the score to be processed
	 */
	public void processGrade(double score)
	{
		this.score = score;
		
		determineLetterGrade();
	}
	
	@Override
	public double getMeasure()
	{
		return this.score;
	}
}

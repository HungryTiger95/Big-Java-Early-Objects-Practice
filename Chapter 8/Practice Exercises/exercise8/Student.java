package exercise8;

public class Student
{
	// Instance Variables
	private double[] scores;
	private int scoresSize;
	private String studentName;
	
	// Constructors
	/**
	 * Constructs a student with no scores and a maximum number of scores
	 * @param scoreCapacity the max number of scores for this student
	 */
	public Student(int scoreCapacity, String name)
	{
		scores = new double[scoreCapacity];
		scoresSize = 0;
		studentName = name;
	}
	// Methods
	/**
	 * Adds a score for this student
	 * @param score the score to add
	 * @return true if the score was added, false if there was no more space
	 */
	public boolean addScore(double score)
	{
		if(scoresSize < scores.length)
		{
			scores[scoresSize] = score;
			scoresSize++;
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Computes the sum of all of the students scores
	 * @return the sum of the scores
	 */
	public double sum()
	{
		double total = 0;
	    for (int i = 0; i < scoresSize; i++)
	    {
	       total = total + scores[i];
	    }
	    return total;
	}
	
	/**
	 * Gets the minimum score of this student
	 * @return the minimum score, or 0 if there are no scores
	 */
	public double minimum()
	{
		if (scoresSize == 0)
		{ 
			return 0;
		}
		else
		{
			double smallest = scores[0];
			for (int i = 1; i < scoresSize; i++)
			{
				if (scores[i] < smallest)
				{
					smallest = scores[i];
				}
			}
			
			return smallest;
		}  
	}
	
	/**
	 * Gets the final score for this student
	 * @return the sum of the scores, with the lowest score dropped if
	 * there are at least two scores, or 0 if there are no scores
	 */
	public double finalScore()
	{
		if(scoresSize == 0)
		{
			return 0;
		}
		else if(scoresSize == 1)
		{
			return scores[0];
		}
		else
		{
			return sum() - minimum();
		}
	}
	
	/**
	 * Gets the score at the given index
	 * @param index index of where the score is located
	 * @return the score indexed
	 */
	public double getScoreAt(int index)
	{
		return scores[index];
	}
	
	/**
	 * Gets the number of scores the student has
	 * @return the number of scores added to the student
	 */
	public int getScoreCount()
	{
		return scoresSize;
	}
	
	/**
	 * Gets the name of the student
	 * @return
	 */
	public String getName()
	{
		return studentName;
	}
}

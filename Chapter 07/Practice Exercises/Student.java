
public class Student
{
	// Instance Variables
	private double[] scores;
	private int scoreSize;
	
	// Constructors
	/**
	 * Creates a Student object zero scores and a max number of scores
	 * @param scoreCapacity number of maximum scores
	 */
	public Student(int scoreCapacity)
	{
		scores = new double[scoreCapacity];
		this.scoreSize = 0;
		
	}
	
	// Methods
	/**
	 * Adds a score for this student
	 * @param score the score to add
	 * @return true is the score was added, false is there was no more room
	 */
	public boolean addScore(double score)
	{
		if(scoreSize < scores.length)
		{
			scores[scoreSize] = score;
			scoreSize++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Calculates the final score for this student
	 * @return the sum of the scores for this student after
	 * dropping the lowest score
	 */
	public double finalScore()
	{
		if(scoreSize == 0)
		{
			return 0;
		}
		else if(scoreSize == 1)
		{
			return scores[0];
		}
		else
		{
			return getSum() - getMin();
		}
	}
	
	/**
	 * Calculates the sum of all scores for this student
	 * @return the sum of the scores
	 */
	public double getSum()
	{
		double sum = 0;
		
		for(int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		
		return sum;
	}
	
	/**
	 * Gets the minimum score for this student
	 * @return the minimum score, or 0 if there are no scores
	 */
	public double getMin()
	{
		if(scoreSize == 0)
		{
			return 0;
		}
		else
		{
			double min = scores[0];
			for(int i = 1; i < scoreSize; i++)
			{
				if(scores[i] < min)
				{
					min = scores[i];
				}
			}
			return min;
		}
	}
	
	/**
	 * Gets the position of the minimum value
	 * @return minPos
	 */
	public int getMinPos()
	{
		if(scoreSize == 0)
		{
			return 0;
		}
		else
		{
			int minPos = 0;
			for(int i = 1; i < scoreSize; i++)
			{
				if(scores[i] < scores[minPos])
				{
					minPos = i;
				}
			}
			return minPos;
		}
	}
	
	/**
	 * Removes the minimum value
	 */
	public void removeMin()
	{	
		for(int i = getMinPos() + 1; i < scoreSize; i++)
		{
			scores[i - 1] = scores[i];
		}
		scoreSize--;
	}
	
	/**
	 * Prints the scores
	 */
	public void printArray()
	{
		for(int i = 0; i < scoreSize; i++)
		{
			if(i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(scores[i]);
		}
		System.out.println();
	}
}

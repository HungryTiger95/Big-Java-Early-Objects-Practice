/**
 * P3.4
 * 
 * Implement a class Student. For the purpose of this exercise, a student has a name
 * and a total quiz score. Supply an appropriate constructor and methods getName(),
 * addQuiz(int quizScore), getTotalScore(), and getAverageScore(). To compute the average,
 * you also need to store the number of quizzes that the student took.
 * 
 * Supply a StudentTester class that tests all methods.
 * 
 * @author Mayuresh
 *
 */

public class Student
{
	private String studentName;
	private int quizScore;
	private int quizCount = 0;
	private String quizString = "";
	
	// Constructors
	/**
	 * Constructs a Student object with a given name
	 * @param name name of student
	 */
	public Student(String name)
	{
		studentName = name;
		quizScore = 0;
	}
	
	// Methods
	/**
	 * Gets the name of the student
	 * @return name of student
	 */
	public String getName()
	{
		return studentName;
	}
	
	/**
	 * Adds a quiz with score
	 * @param score score of the quiz
	 */
	public void addQuiz(int score)
	{
		String quizValue = String.valueOf(score);
		quizString = quizString.concat(quizValue + ", ");
		quizCount++;
		quizScore = quizScore + score;
	}
	
	/**
	 * Gets the total score
	 * @return total score
	 */
	public int getTotalScore()
	{
		return quizScore;
	}
	
	/**
	 * Gets the average score
	 * @return average of all scores
	 */
	public double getAverageScore()
	{
		double average = (quizScore * 1.0) / (quizCount * 1.0);
		return average;
	}
}

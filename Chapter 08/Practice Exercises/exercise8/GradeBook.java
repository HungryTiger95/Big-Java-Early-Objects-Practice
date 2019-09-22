package exercise8;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Repeat E8.7, using multiple classes. Provide a GradeBook class that collects
 * objects of type Student
 * 
 * @author Mayuresh
 *
 */
public class GradeBook
{
	// Instance Variables
	Student[] students;
	int studentsCount;
	double sumOfScores[];
	double finalScores[];
	double minimumScores[];
	
	NumberFormat formatter = new DecimalFormat("#0.00");
	
	// Constructors
	/**
	 * Creates a GradeBook object with room for 100 students
	 */
	public GradeBook()
	{
		students = new Student[100];
		sumOfScores = new double[100];
		finalScores = new double[100];
		minimumScores = new double[100];
		
		studentsCount = 0;
	}
	
	// Methods
	/**
	 * Adds a student to the gradebook
	 * @param newStudent the new student
	 * @return true if the student was added, false if there was no more space
	 */
	public boolean addStudent(Student newStudent)
	{
		if(this.studentsCount < this.students.length)
		{
			this.students[studentsCount] = newStudent;
			studentsCount++;
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Gets the student at the given index
	 * @param i index i
	 * @return the student indexed
	 */
	public Student getStudentAt(int i)
	{
		return students[i];
	}
	
	/**
	 * Gets the sum of the scores of a student
	 * @param i index i
	 * @return sum of scores
	 */
	public double getSumOfScores(int i)
	{
		double sum = 0;
		
		sum = getStudentAt(i).sum();
		
		return Double.valueOf(formatter.format(sum));
	}
	
	/**
	 * Gets the sum of the scores for all the students 
	 * @return sumOfScores array with all of the sums of the students scores
	 */
	public double[] getSumOfScores()
	{
		// Go through all students in the gradebook and add each students sum of scores
		// to an array
		for(int i = 0; i < studentsCount; i++)
		{
			double sum = getSumOfScores(i);
			
			sumOfScores[i] = sum;
		}
		
		// trim array
		double[] trimArray = new double[studentsCount];
		
		// add values from sumOfScores to the trim array
		for(int i = 0; i < studentsCount; i++)
		{
			trimArray[i] = Double.valueOf(formatter.format(sumOfScores[i]));
		}
		
		return trimArray;
	}
	/**
	 * Gets the final score of a student
	 * @param i index i
	 * @return final score after removing the minimum
	 */
	public double getFinalScores(int i)
	{
		double finalScore;
		
		finalScore = getStudentAt(i).finalScore();
		
		return Double.valueOf(formatter.format(finalScore));
	}
	
	/**
	 * Get the final scores of each of the students in the gradebook
	 * @return finalScores an array with the final scores of each students
	 */
	public double[] getFinalScores()
	{
		// Go through all students in the gradebook and add each students final scores
		// to an array
		for(int i = 0; i < studentsCount; i++)
		{
			double finalScore = getFinalScores(i);
			
			finalScores[i] = finalScore;
		}
		
		// trim array
		double[] trimArray = new double[studentsCount];
		
		// add values from sumOfScores to the trim array
		for(int i = 0; i < studentsCount; i++)
		{
			trimArray[i] = Double.valueOf(formatter.format(finalScores[i]));
		}
		
		return trimArray;
	}
	
	/**
	 * Gets the minimum score of a student
	 * @param i index i
	 * @return minimum score of the student
	 */
	public double getMinimumScores(int i)
	{
		double min;
		
		min = getStudentAt(i).minimum();
		
		return Double.valueOf(formatter.format(min));
	}
	
	/**
	 * Gets the minimum scores for all the students in the gradebook
	 * @return minimumScores an array with the minimum scores of all the students
	 */
	public double[] getMinimumScores()
	{
		// Go through all the students in the gradebook and add each students minimum scores
		// to an array
		for(int i = 0; i < studentsCount; i++)
		{
			double minScore = getMinimumScores(i);
			
			minimumScores[i] = minScore;
		}
		
		// trim array
		double[] trimArray = new double[studentsCount];
		
		// add values from sumOfScores to the trim array
		for(int i = 0; i < studentsCount; i++)
		{
			trimArray[i] = Double.valueOf(formatter.format(minimumScores[i]));
		}
		
		return trimArray;
	}
}

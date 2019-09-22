package exercise_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Write a program that keeps a map in which both keys and values are strings - the names of students
 * and their course grades. Prompt the user of the program to add or remove students, to modify grades,
 * or  to print all grades. The printout should be sorted by name and formatted like this:
 * 
 * 			Carl : B+
 * 			Joe: C
 * 			Sarah: A+
 * 
 * @author Mayuresh
 *
 */
public class GradeBook
{
	// Instance Variables
	private Map<String, String> grades;
	
	// Constructors
	/**
	 * Constructs a grade book without any entries
	 */
	public GradeBook()
	{
		this.grades = new HashMap<String, String>();
	}
	
	// Methods
	/**
	 * Adds a grade for a student
	 * @param studentName the name of the student
	 * @param grade the grade for the student
	 */
	public void addGrade(String studentName, String grade)
	{
		this.grades.put(studentName, grade);
	}
	
	/**
	 * Gets the grade for a student
	 * @param studentName the student whose grade needs to be retrieved
	 * @return the grade
	 */
	public String getGrade(String studentName)
	{
		return this.grades.get(studentName);
	}
	
	/**
	 * Prints all the grades in this gradebook
	 * @return the gradebook
	 */
	public void printGradeBook()
	{
		Set<String> keySet = this.grades.keySet();
		for(String key : keySet)
		{
			String grade = this.grades.get(key);
			System.out.printf("%10s: %4s\n", key, grade);
		}
	}
	
	/**
	 * Removes a grade and returns the name of the student
	 * @param studentName the name of the student
	 * @return the name of the student
	 */
	public String removeGrade(String studentName)
	{
		return this.grades.remove(studentName);
	}
	
	/**
	 * Changes the grade for a given student
	 * @param studentName the name of the student
	 * @param newGrade the new grade
	 */
	public void changeGrade(String studentName, String newGrade)
	{
		this.grades.put(studentName, newGrade);
	}
}

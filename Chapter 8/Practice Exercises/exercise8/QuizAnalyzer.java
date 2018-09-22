package exercise8;

import java.util.Arrays;
import java.util.Random;

public class QuizAnalyzer
{
	public static void main(String[] args)
	{
		GradeBook gradebook = new GradeBook();
		Random gen = new Random();
		
		Student mayo = new Student(100, "Mayo");
		Student arju = new Student(100, "Arju");
		Student payal = new Student(100, "Payal");
		Student deep = new Student(100, "Deep");
		Student aarohi = new Student(100, "Aarohi");
		
		gradebook.addStudent(mayo);
		gradebook.addStudent(arju);
		gradebook.addStudent(payal);
		gradebook.addStudent(deep);
		gradebook.addStudent(aarohi);
		
		// Set a random amount of grades for each student
		for(int i = 0; i < gradebook.studentsCount; i++)
		{
			// Up to 10 scores
			int randScoreCount = gen.nextInt(10) + 1;
			
			// Add random scores to student
			for(int j = 0; j < randScoreCount; j++)
			{
				double randScore = gen.nextDouble() * 100;
				
				
				gradebook.getStudentAt(i).addScore(randScore);
			}
		}
		
		// Print all scores for the all the students
		for(int i = 0; i < gradebook.studentsCount; i++)
		{
			// Name of student
			System.out.printf("%-8s", gradebook.getStudentAt(i).getName());
			
			// Print scores for this student
			for(int j = 0; j < gradebook.getStudentAt(i).getScoreCount(); j++)
			{
				if(j == gradebook.getStudentAt(i).getScoreCount() - 1)
				{
					System.out.printf("%3.2f", gradebook.getStudentAt(i).getScoreAt(j));
				}
				else
				{
					System.out.printf("%3.2f, ", gradebook.getStudentAt(i).getScoreAt(j));
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Get Minimum Scores
		System.out.println("Minimum Scores: " + Arrays.toString(gradebook.getMinimumScores()));
		
		// Get Sum Scores
		System.out.println("Sum Scores: " + Arrays.toString(gradebook.getSumOfScores()));
		
		// Gets Final Scores
		System.out.println("Final Scores: " + Arrays.toString(gradebook.getFinalScores()));
	}
}

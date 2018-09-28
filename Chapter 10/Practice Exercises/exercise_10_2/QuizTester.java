package exercise_10_2;

import java.util.Scanner;

public class QuizTester
{
	public static void main(String[] args)
	{
		Measurable[] grades = new Quiz[10];
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < grades.length; i++)
		{
			double quizGrade;
			String letterGrade;
			
			System.out.print("Please Enter a Grade: ");
			quizGrade = in.nextDouble();
			
			if (quizGrade > 90)
			{
				letterGrade = "A";
			}
			else if (quizGrade > 85)
			{
				letterGrade = "B+";
			}
			else if (quizGrade > 80)
			{
				letterGrade = "B";
			}
			else if (quizGrade > 75)
			{
				letterGrade = "C+";
			}
			else if (quizGrade > 70)
			{
				letterGrade = "C";
			}
			else
			{
				letterGrade = "F";
			}
			
			grades[i] = new Quiz(quizGrade, letterGrade);
		}
		in.close();
		
		double averageGrade = Data.average(grades);
		String averageLetterGrade = Data.letterConvert(averageGrade);
		
		Quiz highestGrade = (Quiz) Data.max(grades);
		
		
		System.out.println("Average Quiz Grades: " + averageGrade);
		System.out.println("Average Quiz Letter Grade: " + averageLetterGrade);
		System.out.println("Largest Quiz Grade: " + highestGrade.getScore());
		System.out.println("Largest Quiz Letter Grade: " + highestGrade.getLetterGrade());
	}	
}

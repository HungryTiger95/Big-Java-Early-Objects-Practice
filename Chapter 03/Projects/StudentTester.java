
public class StudentTester
{
	public static void main(String[] args)
	{
		Student stu = new Student("Mayuresh");
		
		stu.addQuiz(90);
		stu.addQuiz(95);
		stu.addQuiz(100);
		
		System.out.println("Student Name: " + stu.getName());
		System.out.println("Total Score: " + stu.getTotalScore());
		System.out.println("Average Score: " + stu.getAverageScore());
	}
}

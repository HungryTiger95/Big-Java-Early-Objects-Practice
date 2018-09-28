package interface_example_5;

import java.util.ArrayList;

public class MockGradeBook implements IGradeBook
{
	private ArrayList<Double> scores;
	
	public MockGradeBook()
	{
		scores = new ArrayList<Double>();
	}
	
	public void addScore(int studentId, double score)
	{
		// Ignore studentId
		scores.add(score);
	}
	
	public double getAverageScore(int studentId)
	{
		double total = 0;
		
		for(double x : scores)
		{
			total += x;
		}
		
		return total / scores.size();
	}
	
	public void save(String fileName)
	{
		// Do Nothing
	}
	
	public void load(String fileName)
	{
		// Add sample scores
		scores.add(20.0);
		scores.add(30.0);
		scores.add(15.0);
		scores.add(40.0);
	}
}

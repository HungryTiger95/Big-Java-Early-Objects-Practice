package exercise_13.rectangle_account_tester;

import exercise_13.*;

public class MeasurerTester
{
	public static void main(String[] args)
	{
		Measurable<BetterRectangle> accountMeas = new Measurer<>();
		BetterRectangle[] rects = new BetterRectangle[4];
		rects[0] = new BetterRectangle(20, 20);
		rects[1] = new BetterRectangle(50, 50);
		rects[2] = new BetterRectangle(100, 100);
		rects[3] = new BetterRectangle(45, 60);
		
		System.out.println("Largest: " + Data.max(rects, accountMeas).toString());
		System.out.println("Average: " + Data.average(rects, accountMeas));
	}
}

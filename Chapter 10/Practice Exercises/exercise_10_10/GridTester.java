package exercise_10_10;

public class GridTester
{
	public static void main(String[] args)
	{
		Grid grid = new Grid(100, 100);
		
		grid.add(20, 15, "TwentyFifteen");
		grid.add(19, 20, "NineteenTwenty");
		grid.add(35, 10, "ThirtyfiveTen");
		
		System.out.println(grid.getDescription(20, 15));
		System.out.println(grid.getDescription(19, 20));
		System.out.println(grid.getDescription(35, 10));
		System.out.println(grid.getDescription(10, 5));
		
		System.out.println("\nTest1: " + grid.getDescribedLocations().toString());
	}
}

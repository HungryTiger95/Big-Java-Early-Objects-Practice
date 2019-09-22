package exercise_11;

public class BetterRectangleTester
{
	public static void main(String[] args)
	{
		BetterRectangle box = new BetterRectangle(10, 15, 20, 10);
		double perimeter = box.getPerimeter();
		double area = box.getArea();
		
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
	}

}

package section_01;

public class SquareTester
{
	public static void main(String[] args)
	{
		Square s = new Square(8);
		
		System.out.println("Area: " + s.getArea());
		System.out.println("Expected: 64");
	}
}
